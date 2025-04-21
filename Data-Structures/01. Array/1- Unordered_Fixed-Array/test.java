package ufa;

import java.util.Scanner;

public class test {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        UFA object1 = new UFA(8);
        System.out.println(object1.isFull());
        System.out.println(object1.isEmpty());

        object1.Add(111);
        object1.Add(232);
        object1.Add(32);
        object1.Add(52);
        object1.Add(72);
        object1.report();
        System.out.println("**************************************************");
        // object1.report();
        // System.out.println("------------");
        // object1.addFirst_Shift(3);
        // object1.report();
        // object1.delete(2);
        // UFA obj = new UFA(9);
        // obj.Add(10);
        // obj.Add(15);
        // obj.Add(8);
        // obj.Add(17);
        // obj.Add(20);
        // obj.report();
        // System.out.println(obj.delete(15));
        // obj.report();
        // System.out.println("the result of search operation is :" + obj.search(20));
        // obj.addFirst_Shift(33);
        // obj.report();
        object1.deleteFirst_Shifting();

        object1.report();
        System.out.println("*****************************************");
        object1.deleteLast();
        object1.report();

    }
}
