import java.util.Scanner;

public class bee_1051
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double imposto, renda = sc.nextDouble();

        if (renda <= 2000)
        {
            imposto = 0;
        }
        else if (renda <= 3000)
        {
            imposto = (renda - 2000) * 0.08;
        }
        else if (renda <= 4500)
        {
            imposto = ((renda - 3000) * 0.18) + 80;
        }
        else
        {
            imposto = ((renda - 4500) * 0.28) + 350;
        }

        if (imposto == 0)
        {
            System.out.println("Isento");
        }
        else
        {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}