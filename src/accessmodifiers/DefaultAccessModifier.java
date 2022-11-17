package accessmodifiers;

public class DefaultAccessModifier {

    //default access
    int a = 56;
    int num = 67;

    public static void main(String[] args) {
        DefaultAccessModifier def = new DefaultAccessModifier();
        System.out.println(def.a);
        System.out.println(def.num);
    }

}
