package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int b, c, d;
        b = number / 100;
        c = (number % 100) / 10;
        d = number % 10;
        System.out.println(d +""+ c +""+ b);
    }
}
