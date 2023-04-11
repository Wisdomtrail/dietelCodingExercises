package chapterThree;

public class Petrol {

    private final String location;
    private final String petrolType;
    private final int quantity;
    private final double pricePerLiter;
    private final double discount;

    public Petrol(String location, String petrolType, int quantity, double pricePerLiter, double discount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.discount = discount;
    }

    public String getLocation(){
        return location;
    }
    public String getPetrolType(){
        return petrolType;
    }

    public int getquantity(){
        return quantity;
    }
    public double getpriceperliter(){
        return pricePerLiter;
    }
    public double getDiscount(){
        return discount;
    }
    public double getPurchase(){
        return (quantity * pricePerLiter) - discount;
    }
}
