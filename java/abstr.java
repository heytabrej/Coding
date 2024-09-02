abstract class Bank {
    abstract int getrateofinterest();
    
}
class SBI extends Bank{
    int getrateofinterest(){
        return 7;
    }
}

class IOB extends Bank{
   int getrateofinterest(){
      return 8;
    }
}

class abstr{
    public static void main(String[] args){
        Bank b;
        b = new SBI();
        System.out.println("The rate of interest in SBI is : " + b.getrateofinterest());

        b = new IOB();
        System.out.println("The rate of interest in IOB is : " + b.getrateofinterest());
}
}