package Tokens.operators;

public class DecrementExample {

    public static void main(String[] args) {

        //unary operators :- post decrement

        int a1 = 10;
        System.out.println("value of a1 : "+a1);

        int b1 = a1;
        System.out.println("value of b1 : "+b1);

        b1 = a1--;
        System.out.println("value of b1 after change : "+b1);

        int c1 = a1;
        System.out.println("value of c1 : "+c1);

        int d1 = b1;
        System.out.println("value of d1 : "+d1);


        //unary operators :- post decrement

        int a = 10;
        System.out.println("value of a : "+a);

        int b = a;
        System.out.println("value of b : "+b);

        b = --a;
        System.out.println("value of b after change : "+b);

        int c = a;
        System.out.println("value of c : "+c);

        int d = b;
        System.out.println("value of d : "+d);

    }

}
