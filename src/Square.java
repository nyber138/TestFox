import java.util.Scanner;

public class Square implements Measurable
{
    Scanner scan = new Scanner(System.in);

    public double getPerimeter()
    {
        System.out.println("Gimmie a number baby");

        long radius = scan.nextLong();

        return 4 * radius;
    }

    public double getArea()
    {
        System.out.println("Gimmie a number baby");

        long radius = scan.nextLong();

        return radius * radius;
    }

    @Override
    public boolean foxTime()
    {
        return true;
    }
}
