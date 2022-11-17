package Arrays;

public class ArrayDeclarations {

    public static void main(String[] args) {

        //ways of declaring single dimensional array:-
        int a = 45; //normal variable

        int[] x; //most recommended
        int []y;
        int z[];

        //initializing array :-
        int[] array = new int[3];
        x = new int[20];
        y = new int[2];

        // array element assignments :-
        y[0] = 10;
        y[1] = 20;
        //y[2] = 56; => throws exception array index out of bound

        z = new int[5];
        //z[0] = 11.67; => wrong
        //z[1] = true; => wrong
        //z[2] = false; => wrong
       // z[3] = 't'; => this is allowed
        //z[4] = "test"; => wrong

        System.out.println("value of array z at 0th position :"+z[0]);
        System.out.println("value of array z at 1st position :"+z[1]);
        System.out.println("value of array z at 2nd position :"+z[2]);
        System.out.println("value of array z at 3rd position :"+z[3]);
        System.out.println("value of array z at 4th position :"+z[4]);

        boolean[] booleans = new boolean[2];

        System.out.println("value of boolean array at 1st position :"+booleans[0]);
        System.out.println("value of boolean array at 2nd position :"+booleans[1]);

        float[] floats = new float[2];
        double[] doubles = new double[2];

        System.out.println("value of float array at 1st position :"+floats[0]);
        System.out.println("value of float array at 2nd position:"+floats[1]);

        System.out.println("value of double array at 1st position :"+doubles[0]);
        System.out.println("value of double array at 2nd position:"+doubles[1]);

        int[] b;
        b = new int[7];
        b[0] = 11;
        b[1] = 12;
        b[2] = 13;
        b[3] = 14;
        b[4] = 15;
        b[5] = 16;
        b[6] = 17;

        char[] arr = new char[8];
        arr[0] = 'F' ;
        arr[1] = 'L' ;
        arr[2] = 'O';
        arr[3] = 'W' ;
        arr[4] = 'E';
        arr[5] = 'R';
        arr[6] = 'S';
        arr[7] = 'S';

       // int[] arr1 = new int[5000];

    }

}
