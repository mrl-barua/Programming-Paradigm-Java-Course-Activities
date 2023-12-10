
package prac101;



public class Prac101 {

    public static void main(String[] args) {
  //Student marlo = new Student();
  //Student mark = new Student("Mark", 18);
  //Student john = new Student();
  
  int[] marks = new int[10];
  
  
  Student [] students = new Student [3];
  
  students[0] = new Student("Marlo", 19);
  students[1] = new Student("Mark", 18);
  students[2] = new Student("john", 20);
          
  
;
  
  students[0].introduce();
  students[1].introduce();
  students[2].introduce();
  
}
}

class Student
{
    String name;
    int age;
    
    Student()
    {
        name = "noname";
        age = 1;
    }
    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    void setNameAndAge(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    void introduce()
    {
        System.out.println("hi i am " + name + " and my age is " + age);
    }
    
            
}


