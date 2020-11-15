package Lv1;

import java.util.Scanner;

public class Cal_fb implements FB {

    @Override
    public int cal_fb(int a) {
        int num1 = 0;
        int num2 = 1;
        if (a == 0) {
            num2 = 0;
        } else {
            for (int i = 1; i < a; i++) {
                int temp = num1;
                num1 = num2;
                num2 += temp;
            }
        }
        return num2;
    }
}
