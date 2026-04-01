class Cat
{
    public String name; //instance variable
    
    
    public void eat(String fod){
        System.out.println(name+" is eating "+fod);
    }    
    public void eat(String fod,int n){
        System.out.println(name+" is eating "+n+ " "+fod);
    }
    public void eat(String fod ,String fod2){
        System.out.println(name+" is eating "+fod+ " and " +fod2);
    }
   }
public class CatDemo {

    public static void main(String[] args) {
      Cat c1 = new Cat();  
      c1.name = "Piku";
      c1.eat("bread");
      c1.eat("bread", 3);
      c1.eat("bread" ,"fish");
    }
    
}
