import java.util.Scanner;

class shape{
    // public static void  xyz(int x, int y){
        public void xyz(){
            System.out.println("display anthing here");
        }
    // }
    
}

// single inheritance
class rectangle extends shape{
    public void are(int l,int h){
        xyz();
        System.out.println("Area of rectangle is "+l*h);
        
        

    }
}
    // multi level inheritance

class square extends rectangle{
  public void are(int l){
            xyz();
             System.out.println("Area of square is "+l*l);
    }
 }

 

 // hierarchical inheritance

 class circle extends shape{
     public void are(int r){
         xyz();
         System.out.println("Area of circle is "+3.14*r*r);
    }
 }

class line extends shape{
    public void are(int l){
        xyz();
        System.out.println("Area of line is "+l);
    }
}



public class exte{

    public static void main(String args[]){
        
        rectangle rect = new rectangle();
        rect.are(34, 45);
        square sq = new square();
        sq.are(6);
        circle cir = new circle();
        cir.are(5);
        line lin = new line();
        lin.are(5);

    }
}
