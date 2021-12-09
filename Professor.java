public class Professor extends Person{
  private int professorID;

  public Professor(String name, int professorID, int age){
    super(name, age);
    this.professorID = professorID;
  }
  public int getProfessorID(){
    return professorID;
  }
  public void setProfessorID(int professorID){
    this.professorID = professorID;
  }
  @Override
  public String toString(){
    String retVal = super.toString();
    return retVal + " my professor ID is " + professorID;
  }
}