package Tokens.ConditionalStatements;

public class ElseIfStatement {

    public static void main(String[] args) {

        if(2>3){
            System.out.println("condition is true");
        }else if(3>2){
            System.out.println("3 is greater than 2");
        }else {
            System.out.println("both are false");
        }

        if(2>3){
            System.out.println("condition is true");
        }else if(3<2){
            System.out.println("3 is less than 2");
        }else {
            System.out.println("both are false");
        }

    }

}
