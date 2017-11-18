package lesson2;

public class Main {

    public static void main(String[] args) {
        int[] mass = new int[4];
        for(int i = 0; i < 4; i = i+1 ) {
            mass[i] = i + 1;
        }

        for(int вещь : mass) {
            System.out.println(вещь);
        }
    }
}
