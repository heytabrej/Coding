class pen{
   int price;
   String color;
   String Type;
   public void write(){
    System.out.println("Writing Somthing");
   }
   public void printcolor(){
      System.out.println(this.color);

   }
   public void printprice(){
      System.out.println(this.price);
   }
   public void printType(){
      System.out.println(this.Type);
   }
}

class Student{
   String Name;
   int age;
   public void printInfo(){
      System.out.println(this.Name);
      System.out.println(this.age);
   }
   Student(String Name, int age ){
      this.Name = Name;
      this.age = age;
   }

}


public class OOPS {
   public static void main(String Args[]){
      pen pen1 = new pen();
      pen1.price = 10;
      pen1.color = "Blue";
      pen1.Type = "gel";


      pen pen2 = new pen();
      pen2.price = 10;
      pen2.color = "Black";
      pen2.Type = "gel";
      pen1.printcolor();
      pen2.printcolor();
      pen1.printprice();
      pen2.printprice();
      pen1.printType();
      pen2.printType();

      Student s1 = new Student("tabrej",21);

      // s1.Name = "rahul ray";
      // s1.age = 23;
      s1.printInfo();


   }
    
}
