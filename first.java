import java.util.*;

interface zep{
    int run();
    void printName();
}

class first implements zep{
    public int run(){
        return 0;
    }
    public void printName() {
        System.out.print("ROAF");
    }
    static int i;
    public static void main(String []args){
        System.out.print("ROhab");
        first f= new first();
        sum();
        // f.sum();
        // f.printName();
        System.out.println(args[0]+" "+args[1]);
        // System.out.println(1+1+"Rohan");
        // System.out.println("Rohan"+1+1);
        f.i++;
        System.out.println(f.i);
        first a =new first();
        System.out.println(a.i);
    }
    static void sum(){
        // zep s=new zep();
        // s.printName();
        System.out.println("ROHAAAAAAAA");
    }
}