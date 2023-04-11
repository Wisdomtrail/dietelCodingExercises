package chapterThree;

import tdd.Car;

public class CarApplication {
    public static void main(String[] args) {
        Car lexus = new Car("lexus 320", "2020", 99.08);
        Car camry = new Car("muscle", "2019", 78.09);

        System.out.println(lexus.getPrice());
        System.out.println(camry.getPrice());




    }
}
