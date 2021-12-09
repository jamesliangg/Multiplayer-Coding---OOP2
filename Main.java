/*
Team/Group:
Part A
Design the UML for 2 new classes, incorporating the Person class (you can modify), that demonstrate:
One class will demonstrate an “is-a” relationship
The other class will demonstrate a “has-a” relationship

Part B
Convert your UML to Java code

Part C
Create a package called, “myPackage.superpackage”, for your Person class and the new classes you designed
*/
import myPackage.superpackage.HealthCard;
import myPackage.superpackage.Person;
import myPackage.superpackage.Professor;

class Main {
  public static void main(String[] args) {
    //"is-a" relationship
    Professor t1 = new Professor("Yves", 10532, 33);
    System.out.println(t1.getName());
    System.out.println(t1.getAge());
    System.out.println(t1.getProfessorID());
    System.out.println(t1); 
    //"has-a" relationship
    Person t2 = new Person("Zhang", 65, 7237567890l, "YH");
    System.out.println(t2.getName());
    System.out.println(t2.getHC());
    System.out.println(t2.getHC().getHealthCardNumber());
    System.out.println(t2.getHC().getVersionCode());
  }
}