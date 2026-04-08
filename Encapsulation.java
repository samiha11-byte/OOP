public class Student {
    public String name;
    private int id;
    public Student (String nm,int i){
        name = nm;
        id=i;
    }
    public void setID (int i){
        if(i>0){
            id =i;
        }
        else{
            System.out.println("Invalid Id given");
        }
    }
    public int getID(){
        return id;
    }

    public void setNAME (String n){
        name = n;
    }
    public String getNAME(){
        return name;
    }
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}

//Main class

public class Tester
{
    public static void main (String []args)
    {
        Student s1 = new Student("Samiha",25);
        Student s2 = new Student ("Talha",11);

        System.out.println("Student1:=========");
        s1.showDetails();
        s1.setNAME("Fariha");
        System.out.println("Updated Name: "+s1.getNAME());
System.out.println("Student2:=========");
        s2.showDetails();
        s2.setID(55);
        System.out.println("Updated Id: "+s2.getID());
    }
}




