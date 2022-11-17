package VariableTypes;

import accessmodifiers.DefaultAccessModifier;
import accessmodifiers.PrivateAccessModifier;

public class LocalVariableExample {

    int num1;
    static int num2;

    //local variable declaration :-
    public void m1(){

        int b = 40;
        final int c = 90;
        int a;

        System.out.println(b);
        System.out.println(c);
       // System.out.println(a); => wrong

        //modifiers cannot be used with local variables
       // public int a = 10;
       // protected int d = 56;
      //  private int e = 45;
      //  static int a = 90;
    }

    public static void main(String[] args) {
       LocalVariableExample lv = new LocalVariableExample();
        //System.out.println(lv.b);
        //System.out.println(lv.c);

        System.out.println("value of num1 :"+lv.num1);
        System.out.println("value of num2 :"+num2);

        PrivateAccessModifier pvt = new PrivateAccessModifier();
        //cannot access private data members and methods in another class
        //System.out.println(pvt.a);
        //System.out.println(pvt.b);
        //pvt.m1();

        DefaultAccessModifier def = new DefaultAccessModifier();
        //cannot access default data members in any other package
        //System.out.println(def.a);
        //System.out.println(def.num);
    }

}
