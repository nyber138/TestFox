import java.util.Scanner;

public class Circle implements Measurable
{
    Scanner scan = new Scanner(System.in);

    public double getPerimeter()
    {
        System.out.println("Gimmie a number baby");

        long radius = scan.nextLong();

        return Math.PI * radius * 2;
    }

    public double getArea()
    {
        System.out.println("Gimmie a number baby");

        long radius = scan.nextLong();

        return Math.PI * radius * radius;
    }

    @Override
    public boolean foxTime()
    {
        return false;
    }
}
