package Tokens.operators;

public class LogicalOperatorsExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c = 10;
        int d = 9;
        int e = 20;

        //logical AND :-

        if((a<=b)&&(c>=d)){
            System.out.println("&& got success!");
        }else {
            System.out.println("&& condition got false!!");
        }

        //logical OR :-

        if((a<=10)||(b>=20)){
            System.out.println("|| got success!");
        }else{
            System.out.println("|| condition got false!!");
        }

    }

}
