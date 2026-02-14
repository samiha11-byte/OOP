import java.util.Scanner;

public class Learningjava {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

      int age;
      float height;
      double price;
      long l;
      short sh;
      byte b;
      boolean yes;
      char ch;
      String s;
      String st;
      
      
     //Input
     
     System.out.print("Enter an integer: ");
     age = sc.nextInt();
     
     System.out.print("Enter a Float: ");
     height = sc.nextFloat();
     
     System.out.print("Enter a double: ");
     price = sc.nextDouble();
     
     System.out.print("Enter a long number: ");
     l = sc.nextLong();
     
     System.out.print("Enter a Short Number: ");
     sh = sc.nextShort();
     
     System.out.print("Enter a byte: ");
     b = sc.nextByte();
     
     System.out.print("Enter a Boolean : ");
     yes = sc.nextBoolean();
     
     System.out.print("Enter a Character: ");
     ch = sc.next().charAt(0);
     
     System.out.print("Enter a Word: ");
     s = sc.next();
     
     sc.nextLine();
     System.out.print("Enter a Sentence: ");
     st = sc.nextLine();
     
     
     
     
     System.out.println("\nInt: " + age);
     System.out.println("Float: " + height);
     System.out.println("Double: " + price);
     System.out.println("Long: "+ l);
     System.out.println("Short: "+ sh);
     System.out.println("Byte: "+ b);
     System.out.println("Boolean: "+ yes);
     System.out.println("Char: "+ ch);
     System.out.println("Word: "+ s);
     System.out.println("Sentence: "+ st);
     
    }
}
