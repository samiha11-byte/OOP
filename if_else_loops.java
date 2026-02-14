import java.util.Scanner;
public class IfelseJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("Enter your choice: ");
         int ch= s.nextInt();
         while(ch!=0){
              System.out.print("Enter your marks: ");
         int m = s.nextInt();
         if (m>=0 && m<=100){
             if(m>=80)
              System.out.println("Grade: A+"); 
             else if (m>=70)
                  System.out.println("Grade: A"); 
              else if (m>=60)
                  System.out.println("Grade: A-"); 
              else if (m>=50)
                  System.out.println("Grade: B"); 
              else if (m>=40)
                  System.out.println("Grade: C"); 
              else if (m>=33)
                  System.out.println("Grade: D"); 
              else 
                  System.out.println("Grade:fail..!!"); 
             
              }
         else{
             System.out.println("Invalid marks!!!"); 
             
             
         }
         ch--;
         }         
    }
    
}
