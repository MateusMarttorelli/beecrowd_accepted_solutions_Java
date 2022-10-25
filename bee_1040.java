import java.util.Scanner;
import  java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        double[] av = new double[4];
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.0");

        for (int i = 0; i < 4; i++)
        {
            av[i] = sc.nextDouble();
        }

        double media = (2*av[0] + 3*av[1] + 4*av[2] + 1*av[3]) / 10;

        System.out.println("Media: " + dc.format(media));
        if (media < 5)
        {
            System.out.println("Aluno reprovado.");
        }
        else if (media >= 7)
        {
            System.out.println("Aluno aprovado.");
        }
        else
        {
            System.out.println("Aluno em exame.");

            double exame = sc.nextFloat();
            double mediaFinal = (media + exame) / 2;

            System.out.println("Nota do exame: " + dc.format(exame));
            if (mediaFinal >= 5)
            {
                System.out.println("Aluno aprovado.");
            }
            else
            {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + dc.format(mediaFinal));
        }
    }
}