import java.util.Scanner;

public class bee_1041
{
    public static void main(String[] args)
    {
        double x, y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0)
        {
            System.out.println("Origem");
        }
        else if (x == 0)
        {
            System.out.println("Eixo Y");
        }
        else if (y == 0)
        {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0)
        {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("Q3");
        }
        else
        {
            System.out.println("Q4");
        }
    }
}