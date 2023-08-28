import java.util.Scanner;

public class bee_1043
{
    public static void main(String[] args)
    {
        double a, b, c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a < b+c && b < a+c && c < a+b)
        {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else
        {
            double area = ((a+b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}