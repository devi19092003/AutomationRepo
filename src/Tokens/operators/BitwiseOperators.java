package Tokens.operators;

public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        //bitwise AND :-
        System.out.println("a&b :"+(a&b));

        //bitwise OR :-
        System.out.println("a|b :"+(a|b));

        //bitwise XOR :-
        System.out.println("a^b :"+(a^b));

        //bitwise not :-
        System.out.println("value of a :"+a);
        System.out.println("value after negation of a : "+~a);

        System.out.println("value of b :"+b);
        System.out.println("value after negation of b : "+~b);

        System.out.println(~101);
    }

}
