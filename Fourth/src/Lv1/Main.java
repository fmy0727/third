package Lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Couple couple = new Couple();
        while (a == 0) {
            System.out.println("亲爱的，需要我帮忙吗？（1.需要 2.不用）");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            switch (n) {
                case 1: {
                    couple.start();
                    break;
                }
                case 2: {
                    System.out.println("亲爱的再见");
                    a++;
                    break;
                }
            }
        }
    }
}
