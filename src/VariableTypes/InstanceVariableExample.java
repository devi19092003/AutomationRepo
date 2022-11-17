package VariableTypes;

public class InstanceVariableExample {

    //defining instance variable :- (class-level variable)
    int a = 10;
    public int num1 = 10;
    private int num2 = 20;
    protected int num3 = 30;
    int num;


    public void m1(){
        int c = 30;
    }

    public static void main(String[] args) {

        InstanceVariableExample i = new InstanceVariableExample();
        System.out.println(i.a);

        //System.out.println(i.b); => compilation error
        //System.out.println(i.c); => compilation error

        int b = 20;
        System.out.println(b);

       // System.out.println(a); => compilation error
       // System.out.println(c); => compilation error


    }
}
