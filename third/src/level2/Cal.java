package level2;

public class Cal implements Calculate {

    @Override
    public double calculate(double x, char operate, double y) {
        double a = 0;
        switch (operate) {
            case '+': {
                a = x + y;
                break;
            }
            case '-': {
                a = x - y;
            }
            case '*': {
                a = x * y;
                break;
            }
            case '/': {
                a = x / y;
                break;
            }
        }
        return a;
    }
}
