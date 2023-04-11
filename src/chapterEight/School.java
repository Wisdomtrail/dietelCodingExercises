package chapterEight;

public enum School {
    UNILAG("University of Lagos", "Lagos"),
    UNIPORT("University of Port Harcourt", "Rivers"),
    LASU("Lagos Secondary School","Lagos");


    private String fullName;
    private String state;

    School(String fullName, String state) {
        this.fullName = fullName;
        this.state = state;
        System.out.println("I am Creating " + fullName +" "+ this.name());
    }
        public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
