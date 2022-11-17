package Arrays;

public class FindingArrayClasses {
    public static void main(String[] args) {

        int[] intArray = new int[3];
        byte[] byteArray = new byte[3];
        short[] shortArray = new short[3];
        String[] stringArray = new String[3];
        char[] characterArray = new char[3];
        float[] floatArray = new float[3];
        double[] doubleArray = new double[3];
        boolean[] booleanArray = new boolean[2];

       // int[] arr = new int[]; => wrong
        //int[] arr = new int[0]; => right
       // int[] arr = new int[-8]; => throws exception

        System.out.println("integer array class is : "+intArray.getClass());
        System.out.println("Parent class of integer array : "+intArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("byte array class is : "+byteArray.getClass());
        System.out.println("Parent class of byte array : "+byteArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("short array class is : "+shortArray.getClass());
        System.out.println("Parent class of short array : "+shortArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("string array class is : "+stringArray.getClass());
        System.out.println("Parent class of string array : "+stringArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("character array class is : "+characterArray.getClass());
        System.out.println("Parent class of character array : "+characterArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("float array class is : "+floatArray.getClass());
        System.out.println("Parent class of float array : "+floatArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("double array class is : "+doubleArray.getClass());
        System.out.println("Parent class of double array : "+doubleArray.getClass().getSuperclass());

        System.out.println();

        System.out.println("boolean array class is : "+booleanArray.getClass());
        System.out.println("Parent class of boolean array : "+booleanArray.getClass().getSuperclass());

    }

}
