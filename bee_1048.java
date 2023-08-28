import java.util.Scanner;

public class bee_1048
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextFloat();
        double novo_salario;

        if (salario <= 400)
        {
            novo_salario = salario*1.15;
        }
        else if (salario <= 800)
        {
            novo_salario = salario*1.12;
        }
        else if (salario <= 1200)
        {
            novo_salario = salario*1.10;
        }
        else if (salario <= 2000)
        {
            novo_salario = salario*1.07;
        }
        else
        {
            novo_salario = salario*1.04;
        }

        System.out.printf("Novo salario: %.2f\n", novo_salario);
        System.out.printf("Reajuste ganho: %.2f\n", novo_salario - salario);
        System.out.printf("Em percentual: %.0f %%\n", (novo_salario/salario - 1)*100);
    }
}