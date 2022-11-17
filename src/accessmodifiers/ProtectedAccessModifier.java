package accessmodifiers;

public class ProtectedAccessModifier {

    protected int number = 45;
    protected String name = "sara";

    public static void main(String[] args) {
       ProtectedAccessModifier prot = new ProtectedAccessModifier();
        System.out.println(prot.name);
        System.out.println(prot.number);
    }

}
