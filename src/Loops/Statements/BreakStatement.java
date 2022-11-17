package Loops.Statements;

public class BreakStatement {

    public static void main(String[] args) {

        //break statement in for loop :-

        for(int i = 0; i<=100; i++){
            System.out.println(i);
            if(i==50){
                break;
            }
        }

        //break statement in nested for loop :-

        for(int i = 0; i<=2; i++){
            //inner loop :-
            for(int j = 0; j<=2; j++){
                if(j==1){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }

    }

}
