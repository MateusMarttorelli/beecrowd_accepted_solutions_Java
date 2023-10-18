import java.util.Scanner;

public class bee_1080
{
    static public void main(String[] args)
    {
        int maior = 0;
        int posicao_maior = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++)
        {
            int num = Integer.parseInt(sc.nextLine());

            if (num > maior)
            {
                maior = num;
                posicao_maior = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicao_maior);
    }
}
