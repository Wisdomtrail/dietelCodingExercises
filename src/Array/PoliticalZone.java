package Array;

public enum PoliticalZone {
        NORTH_CENTRAL("North Central", "Benue, Kogi, Kwara, Nasarawa, Niger, Plateau"),
        NORTH_WEST("North West", "Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara"),
        NORTH_EAST("North East", "Adamawa, Bauchi, Borno, Gombe, Taraba, Yobe"),
        SOUTH_EAST("South East", "Abia, Anambra, Ebonyi, Enugu, Imo"),
        SOUTH_SOUTH("South South", "Akwa Ibom, Bayelsa, Cross River, Delta, Edo, Rivers"),
        SOUTH_WEST("South West", "Ekiti, Lagos, Ogun, Ondo, Osun, Oyo");

        private final String zoneName;
        private final String states;


        PoliticalZone(String zoneName, String states) {
            this.zoneName = zoneName;
            this.states = states;
        }

        public String getZoneName() {
            return zoneName;
        }

        public String getStates() {
            return states;
        }

        public static PoliticalZone getZoneByState(String state) {
            for (PoliticalZone zone : PoliticalZone.values()) {
                if (zone.states.contains(state)) {
                    return zone;
                }
            }
            return null;
        }
    }


