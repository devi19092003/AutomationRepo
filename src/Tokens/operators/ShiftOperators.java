package Tokens.operators;

public class ShiftOperators {

    public static void main(String[] args) {
        //initial values :-
        int a = 5;
        int b = 7;
        int c = 10;
        int d = 9;
        int e = 2;

        //left shift operator (<<) :-
        System.out.println("value after left shift : "+(a<<2));
        System.out.println("value after left shift : "+(b<<2));
        System.out.println("value after left shift : "+(c<<2));
        System.out.println("value after left shift : "+(d<<2));

        //right shift operator (>>) :-
        System.out.println("value after right shift : "+(a>>2));
        System.out.println("value after right shift : "+(b>>2));
        System.out.println("value after right shift : "+(c>>2));
        System.out.println("value after right shift : "+(d>>2));

        //unsigned right shift operator (>>>) :-
        System.out.println(" value after unsigned right shift : "+(e>>>2));
    }

}
