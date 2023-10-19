import java.util.Objects;
import java.util.Scanner;

public class bee_1094
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, cobaias = 0, coelhos = 0, ratos = 0, sapos = 0;

        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            String[] input;
            int quantidade;
            String tipo_animal;

            input = sc.nextLine().split(" ");
            quantidade = Integer.parseInt(input[0]);
            tipo_animal = input[1];

            if (Objects.equals(tipo_animal, "C"))
            {
                coelhos += quantidade;
            }
            else if (Objects.equals(tipo_animal, "R"))
            {
                ratos += quantidade;
            }
            else
            {
                sapos += quantidade;
            }

            cobaias += quantidade;
        }

        double percentual_coelho = (double) coelhos * 100 / cobaias;
        double percentual_ratos = (double) ratos * 100 / cobaias;
        double percentual_sapos = (double) sapos * 100 / cobaias;

        System.out.printf("Total: %d cobaias\n", cobaias);
        System.out.printf("Total de coelhos: %d\n", coelhos);
        System.out.printf("Total de ratos: %d\n", ratos);
        System.out.printf("Total de sapos: %d\n", sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentual_coelho);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentual_ratos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentual_sapos);
    }
}