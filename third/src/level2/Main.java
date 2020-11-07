package level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入算式(以空格间隔每个字符)");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] temp = in.split(" ");
        double x = Double.parseDouble(temp[0]);
        double y = Double.parseDouble(temp[2]);
        char operate = temp[1].charAt(0);
        Cal cal = new Cal();
        double a = cal.calculate(x, operate, y);
        System.out.println("计算结果为：" + a);
    }
}
