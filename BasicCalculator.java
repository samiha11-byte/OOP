import java.util.Scanner;

class Calculator{
    float a;
    float b;
         
    void calculator(){
        System.out.println ("Addition: " + (a+b));
        System.out.println ("Subtruction : " + (a-b));
        System.out.println ("Multiplication : " + (a*b));
        System.out.println ("Division: " + (a/b));
    }
}
public class BasicCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        System.out.print("Enter two Number: ");
        cal.a=sc.nextFloat();
        cal.b=sc.nextFloat();
        cal.calculator();
        
    }
    
}
