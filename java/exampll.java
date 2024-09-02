

class Animal {
    void makeSound() {
        System.out.println("An animal makes a sound.");
    }
}

class Lion extends Animal {
 
    void makeSound() {
        
        System.out.println("The lion roars.");
    }
}

class Tiger extends Animal {
  
    void makeSound() {
        System.out.println("The tiger growls.");
    }
}

class Bear extends Animal {
    
    void makeSound() {
        System.out.println("The bear roars.");
    }
}

public class exampll {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal bear = new Bear();

        lion.makeSound();  // Calls the Lion's makeSound method
        tiger.makeSound(); // Calls the Tiger's makeSound method
        bear.makeSound();  // Calls the Bear's makeSound method
    }
}
















// import java.util.*;

// class person{
//     String name;
//     int age;
//     void walk(){
//         System.out.println( name + " you are hero ");
//     }
//     void talk(){
//         System.out.println(name + " you are not hero ");

//     }

// }



// public class exampll{

// public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);





//     String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
// for (int i = 0; i < cars.length; i++) {
//   System.out.println(cars[i]);
// }
//     // for (int i = 0; i < 10; i++) {
//     //     if (i == 4) {
//     //       continue;
//     //     }
//     //     System.out.println(i);
//     //   }

//     // for (int i = 1; i <= 2; i++) {
//     //     System.out.println("Outer: " + i); // Executes 2 times
        
//     //     // Inner loop
//     //     for (int j = 1; j <= 3; j++) {
//     //       System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//     //     }
//     //   } 

//     // int i = 0;
//     // do {
//     //   System.out.println(i);
//     //   i++;
//     // }
//     // while (i < 5);



//     // int day = sc.nextInt();

//     // switch (day) {
//     //     case 1:
//     //         System.out.println("hello ");
            
//     //         break;
//     //         case 2:
//     //         System.out.println("suwar ");
            
//     //         break;
//     //         case 3:
//     //         System.out.println("harami ");
            
//     //         break;
//     //         case 4:
//     //         System.out.println("bsdk ");
            
//     //         break;
//     //         case 5:
//     //         System.out.println("mc ");
            
//     //         break;
//     //         case 6:
//     //         System.out.println("bc ");
            
//     //         break;
            
    
//     //     default:
//     //     System.out.println("baak");
//     //         break;
//     // }


    
// //     int time = 22;
// // if (time < 10) {
// //   System.out.println("Good morning.");
// // } else if (time < 18) {
// //   System.out.println("Good day.");
// // } else {
// //   System.out.println("Good evening.");
// // }
// // Outputs "Good evening."
//     // person p1 = new person();
//     // p1.age = 19;
//     // p1.name= "Tabrej Alam";

//     // person p2 = new person();
    

//     // p2.age = 20;
//     // p2.name = "rakesh";


//     // System.out.println(p1.age);
//     // System.out.println(p1.name);
//     // p1.walk();
//     // p2.talk();
// }
// }