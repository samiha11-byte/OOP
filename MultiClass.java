//Student class

import java.util.Arrays;
 class Student {
    public String name;
    public int id;
    public Course[]courses = new Course[5];
    public int courseCount = 0;
    
    public Student (String nm,int i){
        name =nm;
        id = i;
    }
    public void addCourse(Course c){
         courses[courseCount]= c;
        courseCount+=1;
    }
    public void showDetails (){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("Courses taken: ");
        for (int i=0;i<courseCount;i++)
        {
            System.out.println(courses[i].code);
            System.out.println(courses[i].title);
        }
    }
}

//course class

 class Course {
  public String code;
public String title;
public Course (String c,String t )
{
    code = c;
    title = t;
}
public Course (String c)
{
    code = c;
    title = "Not setted yet";
}
}

//Main class

public class Tester {

    
    public static void main(String[] args) {
       Student s1 = new Student("Bob",11);
       Student s2 = new Student("Momo",55);
       Course c1 = new Course("CSE221","Object Oriented Programming");
       Course c2 = new Course("STA215");
       s1.addCourse(c1);
       s1.addCourse(c2);
       s1.showDetails();
       s2.addCourse(c1);
       s2.addCourse(c2);
       s2.showDetails();
    }
    
}
