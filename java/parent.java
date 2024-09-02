 class paren{
    void display(){
        System.out.println("Welcome to KPR");
    }
}
class child extends paren{
    void display(){
        
        System.out.println("Welcome to CSE");
}


public class parent{


public static void main(String args[]){

    child obj = new child();

    obj.display();

}
}
}