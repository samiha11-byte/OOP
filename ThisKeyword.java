class Cat
{
    public String colour; //instance variable
    public String action = "sitting" ;
    
    public void changeAction(String action){
        this.action = action;
    }    
    public void details (){        //instance mathod
        System.out.println (colour+" cat is "+action);
    }
   }
public class CatDemo {

    public static void main(String[] args) {
      Cat c1 = new Cat();  
      c1.colour = "White";
      
      Cat c2 = new Cat();
      c2.colour = "Purple";
      System.out.println ("c1=======");
      c1.details();
      System.out.println("c2========");
      c2.details();
      c1.changeAction("Jumping");
      System.out.println("c1========");
      c1.details();
    }
    
}
