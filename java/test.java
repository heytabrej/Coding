abstract class bike{
    bike(){
        System.out.println("Bike is running");
    }
     abstract void run();
     void display(){

      System.out.println(" change the speed");
     }


}

class honda extends bike{
    void run(){
        System.out.println("running safely");
    }
}


public class test {
    public static void main(String[] args)
{
    bike b = new honda();
    b.run();
    b.display();
}    
}
