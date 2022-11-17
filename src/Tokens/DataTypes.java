package Tokens;

public class DataTypes {

    public static void main(String[] args) {

        byte b = 1;
        byte c = -128;
        byte a = 127;

       // byte d = -129; => out of range for byte data type
       // byte e = 128; => out of range for byte data type

        short s = 1;

       // short s1 = -32769; => out of range for short data type
      //  short s2 = 32768; => out of range for short data type

        int i = 10;
        long l = 100;
        float f = 10.5f;
        double d = 456;

        char ch = 'x';
        char ch1 = 65;
        char ch2 = 255;

       // char ch3 = 10;

       // int char = 10; => wrong

        boolean b1 = true;

       // boolean b2 = 56; => wrong
       // boolean b3 = "hello"; => wrong
       // boolean b4 = 'c'; => wrong

    }

}
