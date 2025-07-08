// Constructor
class Student{
  int age;
  Student(){
    age=20;
  }
  Student(int a){
    age=a;
  }
  void display(){
  System.out.println("Age: "+age);
  }
  public static void main(String arg[]){
    Student s1= new Student();
    Student s2= new Student(19);
    s1.display();
    s2.display();
  }
}
