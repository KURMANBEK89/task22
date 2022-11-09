import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> san = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            san.add(random.nextInt(100));
        }
        System.out.println(san);

        ArrayList<Integer> jupSan = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        Iterator<Integer> iterator = san.iterator();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                jupSan.add(i);
            } else {
                takSan.add(i);
            }
        }
        System.out.println(jupSan);
        System.out.println(takSan);
    }}
