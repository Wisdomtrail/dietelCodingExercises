package chapterSixteen;

public class User {
    private String name;
    private  int age;
    private String phoneNumber;
    private String email;
    private String address;

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setEmail(String email){
        this.email =email;

    }

    public String getEmail(String email){
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return String.format("""
                Name -> %s
                Age -> %d
                Email -> %s
                PhoneNumber -> %s
                Address -> %s""", name, age,email,phoneNumber, address);
    }
}
