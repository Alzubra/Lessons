package lesson2;

import lesson2.objects.A1;

public class Main {

    public static A1 getNNN() {
        String s = "ИМЯ";
        return new A1();
    }


    public static void main(String[] args) {
        int[] mass = new int[4];
        for(int i = 0; i < 4; i = i+1 ) {
            mass[i] = i + 1;
        }

        for(int вещь : mass) {
            System.out.println(вещь);
        }
        A1 name = getNNN();
        System.out.println(name);
    }
}
