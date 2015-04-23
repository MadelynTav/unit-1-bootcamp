public class Person {
    public int age;
  public String name;
  private String phoneNumber;
  private String city;
  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }
    public Person (int age){ this.age=age; }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }
    public int getAge(){ return age;}

    public int setAge(int age)
    { return this.age=age;}

  public void setName(String name) {
    this.name = name;
  }
}