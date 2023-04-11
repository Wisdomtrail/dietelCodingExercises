package chapterThree.Example;

public class Main {
    public static void main(String[] args) {
        Person person  = new Person("John doe", 18, Gender.MALE);
        Person person1 = new Person("johnny doe", 18, Gender.MALE);
        Person person2 = new Person("jane doe", 19, Gender.FEMALE);
        Person person3 = new Person("janet doe", 20, Gender.NON_BINARY);

        int numberOfmales= countMales(person, person1, person2, person3);
    }

    private static int countMales(Person...people){
        int counter = 0;
        for (Person person : people) {
            if (person.getGender() == Gender.MALE) counter++;
        }
        return counter;
    }
}
