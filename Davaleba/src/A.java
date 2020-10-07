import java.util.Scanner;

public class A {
    private int x;

    public A()
    {
        System.out.println("Hello");
    }

    public void Metodi1()
    {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }

    public void Metodi2()
    {
        System.out.println(x + 12);
    }

    public void Metodi3()
    {
        if (x%2==0)
            System.out.println("luwi");
        else
            System.out.println("kenti");
    }
}
