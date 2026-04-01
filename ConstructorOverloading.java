class Box {
    
    float height;
    float width;
    float depth;
    Box (float h,float w,float d)
    {
        height = h;
        width= w;
        depth= d;
    }
    Box ()
    {
        height = -1;
        width= -1;
        depth= -1;
    }
    
    Box(float len)
    {
        width = height = depth = len ;
    }
    float volume ()
    {
        return height*width*depth ;
    }
            
}

public class BoxDemo {

   
    public static void main(String[] args) {
       
        Box b1 = new Box(10,20,30);
        Box b2 = new Box();
        Box b3 = new Box(7);
        
        
        
        System.out.println("Volume is : " + b1.volume());
        System.out.println("Volume is : " + b2.volume());
        System.out.println("Volume is : " + b3.volume());
       
        
    }
    
}
