package VariableTypes;

public class StaticKeyword {

    //defining a static variable :-
    static int a = 10;
    static int b = 20;

    //non-static method / normal method :-
    public void m1(){
        int c = 30;
        m2();
    }

    //static method :- (class-level method)
    public static void m2(){
       // static int n = 45;
        System.out.println("hello I am static method");
      //  m1();
    }

    //main is a static method
    public static void main(String[] args) {
        StaticKeyword sk = new StaticKeyword();

        System.out.println(a);
        System.out.println(StaticKeyword.b);

        //for normal method :-
        sk.m1();

        //for static method :-
        m2();
        StaticKeyword.m2();
        sk.m2();


    }

}
