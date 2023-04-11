package chapterThree.Example;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    public Person(String name, int age, Gender male) {

    }


    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void  setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }
}
