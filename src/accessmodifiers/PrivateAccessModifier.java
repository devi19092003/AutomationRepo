package accessmodifiers;

public class PrivateAccessModifier {

    //private fields :-
    private int a = 10;
    private int b = 20;

    //defining a private method :-
    private void m1(){
        int c = 10;
        System.out.println(c);
    }

    public static void main(String[] args) {
        PrivateAccessModifier pvt = new PrivateAccessModifier();
        System.out.println(pvt.a);
        System.out.println(pvt.b);
        pvt.m1();

        //default access variables can be used in other class within the same package
        DefaultAccessModifier def = new DefaultAccessModifier();
        System.out.println(def.num);
        System.out.println(def.a);

        ProtectedAccessModifier prot = new ProtectedAccessModifier();
        System.out.println(prot.name);
        System.out.println(prot.number);
    }

}
