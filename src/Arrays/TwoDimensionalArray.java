package Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        //ways of declaring 2d array :-

        int[][] x;
        int [][]y;
        int z[][];
        int []a[];
        int[] []b;
        int[] c[];
        int[][]d;

        //int[]e []d; => invalid

        //initializing 2d array :-
        int[][] arr = new int[2][2];

        //assigning values in an array :-
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;

        int[][] arr1 = new int[][]{{11,12,13},{14,15,16},{17,18,19}};

        //fetching values from 2d array :-

        for(int i = 0; i<=arr1.length-1;i++){
            for (int j = 0; j<=arr1.length-1; j++) {
                System.out.println(arr1[i][j]);
            }
            System.out.println();
        }

        String[][] name = new String[][]{{"Pradip","Sonali"},{"Pravesh","Hanumant"}};

        for(int i = 0; i<=name.length-1;i++){
            for (int j = 0; j<=name.length-1; j++) {
                System.out.println(name[i][j]);
            }
            System.out.println();
        }

        String s = "It Edge";
        System.out.println(s.length());


    }

}
