import java.util.Scanner;

public class C {
    private int a;
    private int b;
    private int c;
    private int firstDigit = 1;
    private int lastDigit;
    private int mult;

    public void Metodi1()
    {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    public void Metodi2()
    {
        lastDigit = Math.abs(a)%10;
        System.out.println(lastDigit);
    }

    public void Metodi3()
    {
        for (int i = 10; i < b; i *= 10) {
            firstDigit = b / i;
        }
        System.out.println(firstDigit);
    }

    public void Metodi4() {
        int sum = ((c%9==0) ? 9 : c%9);
        System.out.println(sum);
    }

    public void Metodi5()
    {
        mult = firstDigit * lastDigit;
        System.out.println(mult);
    }

    public void Metodi6()
    {
        System.out.println(firstDigit + mult);
    }
}
