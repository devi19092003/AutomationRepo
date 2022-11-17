package Arrays;

public class ArrayLiterals {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        char[] chars = new char[]{'i','n','d','i','a'};
        boolean[] booleans = new boolean[]{true,false};
        byte[] bytes = new byte[]{3,4,5};
        short[] shorts = new short[]{101,102};

        //finding size of above arrays :-
        System.out.println("size of integer array :"+arr.length);
        System.out.println("size of character array :"+chars.length);
        System.out.println("size of boolean array :"+booleans.length);
        System.out.println("size of short array :"+shorts.length);

        //fetching values from arrays using for loop :-

        for(int i = 0;i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }

        for(int i = 0;i<chars.length; i++){
            System.out.println(chars[i]);
        }

        //using for each loop to fetch values in an array :-
        for (boolean a : booleans){
            System.out.println(a);
        }

    }

}
