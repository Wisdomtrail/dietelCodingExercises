package tdd;

public class Parcel {
    public int amount(int percent) {
        if (percent < 50)
            return 0;
        else if (percent <= 59)
            return percent * 200;
        else if (percent <= 69)
            return percent * 250;
        else
            return percent * 500;
    }
}


