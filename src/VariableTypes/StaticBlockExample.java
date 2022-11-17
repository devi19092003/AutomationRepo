package VariableTypes;

public class StaticBlockExample {

    static int a ;
    static int b ;

    //a = 10; => wrong way to initialize static data members
   // b = 20; => wrong way to initialize static data members

    //defining a static block :-
     static {
         //right way to initialize static data members :-
        a = 10;
        b = 20;
        System.out.println("Hi I am a static Block!!");
    }


    public static void main(String[] args) {

        System.out.println("Hi I am main method!!");

    }

}
