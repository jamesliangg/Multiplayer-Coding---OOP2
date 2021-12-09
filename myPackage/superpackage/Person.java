package myPackage.superpackage;

public class Person{
  private String name;
  protected int age;
  private final String DEFAULT_NAME = "John";
  private final int DEFAULT_AGE = 18;
  private HealthCard hc;
  
  public Person(){
    name = DEFAULT_NAME;
    age = DEFAULT_AGE;
  }
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public Person(String name, int age, long healthCardNumber, String versionCode){
    this.name = name;
    this.age = age;
    hc = new HealthCard(healthCardNumber, versionCode);
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public void setName(String newName){
    name = newName;
  }
  public void setAge(int newAge){
    age = newAge;
  }
  public HealthCard getHC(){
    return hc;
  }
  public String toString(){
    return "My name is " + name + " my age is " + age;
  }
}