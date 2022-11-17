package Tokens.operators;

public class TernaryOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int max = (a>b) ? a : b;
        System.out.println("maximum is = "+max);

        int min = (a<b) ? a : b;
        System.out.println("minimum is = "+min);



    }

}
