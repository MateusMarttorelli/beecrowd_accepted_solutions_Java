import java.util.Scanner;

public class bee_1071
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int maior, menor;
        int soma = 0;

        if (x > y)
        {
            maior = x;
            menor = y;
        }
        else
        {
            maior = y;
            menor = x;
        }

        for (int num = menor + 1; num < maior; num++)
        {
            if (num % 2 != 0)
            {
                soma += num;
            }
        }

        System.out.println(soma);
    }
}
