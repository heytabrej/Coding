public class bits {
    public static void main(String[] args){
        int a = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);

        // if ((bitMask & a) == 0){

        //   System.out.println("bit was a zero");
        // }else{
        //     System.out.println("bit was one");
        // }

        int newnumber = bitMask | a;
        int number = notbitMask & a;
        System.out.println(newnumber);
        System.out.println(number);

    }
    
}
