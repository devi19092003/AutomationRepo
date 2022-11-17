package Loops.Statements;

public class ContinueStatement {

    public static void main(String[] args) {

        //continue statement in for loop :-

        for(int i = 0; i<=100; i++){
            if(i==50){
                continue;
            }
            System.out.println(i);
        }

        //continue statement in nested for loop :-

        for(int i = 0; i<=2; i++){
            //inner loop :-
            for(int j = 0; j<=2; j++){
                if(j==1){
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }

    }

}
