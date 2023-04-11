package chapterEight;

public enum State {
    NORTH_CENTRAL(new String[]{"benue","fct","kogi","kwara","nasarawa","niger","plateau"}),
    NORTH_EAST(new String[]{"adamawa","bauchi","borno","gombe","taraba","yobe"}),
    NORTH_WEST( new String[]{"kaduna" ,"kastina","kano","kebbi","sokoto","jigawa","zamfara"}),
    SOUTH_EAST(new String[]{"abia","anambra","eboyin","enugun","imo"}),
    SOUTH_SOUTH(new String[]{"akwa-ibom","bayelsa","cross river","delta","edo","rivers"}),
    SOUTH_WEST(new String[]{"ekiti","lagos","osun","ogun", "ondo","oyo"});

    State(String[] strings) {

    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
