package Tokens.operators;

public class LogicalOperators {

    public static void main(String[] args) {

        System.out.println("Logical and");
        if((2<3)&&(3>2)){
            System.out.println("both are true 1");
        }

        if((2>3)&&(3>2)){
            System.out.println("both are true 2");
        }

        System.out.println("logical or");

        if((2>3)||(3>2)){
            System.out.println("both are true");
        }

    }

}
