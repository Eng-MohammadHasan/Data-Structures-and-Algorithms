package ofa;

public class Main {
    public static void main(String[] args) {
        OFA object1 = new OFA(8);
        object1.addIn(25);
        object1.addIn(22);
        object1.addIn(243);
        object1.addIn(-134);
        object1.addIn(0);
        object1.addIn(3);
        object1.addIn(-13433);
        object1.report();

        object1.deleteAt(0);
        object1.report();

        object1.deleteAt(3);
        object1.report();

        object1.deleteIn(3);
        object1.report();

    }
}
