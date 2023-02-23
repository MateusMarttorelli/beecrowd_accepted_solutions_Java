import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int valor, pares = 0, impares = 0, positivos = 0, negativos = 0;

        for (int i = 0; i < 5; i++)
        {
            valor = sc.nextInt();
            if (valor % 2 == 0)
            {
                pares++;
            }
            else
            {
                impares++;
            }

            if (valor > 0)
            {
                positivos++;
            }
            else if (valor < 0)
            {
                negativos++;
            }
        }

        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
    }
}