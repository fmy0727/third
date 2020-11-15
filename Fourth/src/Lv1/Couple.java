package Lv1;

import java.util.Scanner;

public class Couple {
    private int num = 0;

    private void count(int num) {
        this.num += num;
        System.out.println("亲爱的，已经帮你计数了");
    }

    private void getCount() {
        System.out.println("亲爱的，计数结果是：" + num);
    }

    private void fb() {
        System.out.println("亲爱的，你想知道斐波那契数列第几项呢？");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Cal_fb cal_fb = new Cal_fb();
        System.out.println("亲爱的，斐波那契数列第" + n + "项是：" + cal_fb.cal_fb(n));
    }

    public void start() {
        System.out.println("亲爱的,你想我帮你做什么？");
        System.out.println("1.帮你计数，累加number\n2.告诉你计数结果\n3.帮你算斐波那契数列第n项");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 1: {
                System.out.println("亲爱的，输入你想累加的数字");
                Scanner s2 = new Scanner(System.in);
                int n2 = s2.nextInt();
                count(n2);
                break;
            }
            case 2: {
                getCount();
                break;
            }
            case 3: {
                fb();
                break;
            }
        }
    }
}
