package lesson1;

import lesson1.model.Ferrari;

public class MainForOne {
    public static void main(String[] args) {
        Ferrari f1 = new Ferrari();
        Ferrari f2 = new Ferrari();
        f2.setEngine("v16 #12");
        System.out.println(f1.getEngine() + f1.getNumber());
        System.out.println(f2.getEngine() + f2.getNumber());
    }
}
