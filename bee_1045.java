import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double a, b, c, aux;
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(b > a)
        {
            aux = a;
            a = b;
            b = aux;
        }
        if(b > c)
        {
            aux = c;
            c = b;
            b = aux;
        }
        if(c > a)
        {
            aux = a;
            a = c;
            c = aux;
        }

        if (a >= b + c)
        {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else
        {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)))
            {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)))
            {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)))
            {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (a == b && b == c)
            {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (a == b || b == c || a == c)
            {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}