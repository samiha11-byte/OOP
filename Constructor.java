class Box {
    
    float height;
    float width;
    float depth;
    Box (float h,float w,float d)
    {
        height = h;
        width=w;
        depth= d;
    }
    float volume ()
    {
        return height*width*depth ;
    }
            
}

public class BoxDemo {

   
    public static void main(String[] args) {
       
        Box b = new Box(5,7,8);
        
        System.out.println("Volume : " + b.volume());
        
    }
    
}
