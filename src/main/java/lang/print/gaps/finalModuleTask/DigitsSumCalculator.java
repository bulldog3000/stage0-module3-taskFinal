package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int b, c, d, e;
        e = number / 1000;
        b = (number % 1000) / 100;
        c = (number % 100) / 10;
        d = number % 10;
        System.out.println(e + b + c + d);
    }
}
