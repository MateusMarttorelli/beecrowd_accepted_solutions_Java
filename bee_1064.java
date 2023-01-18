import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int positivos = 0;
        double num, media = 0;

        for (int i = 0; i < 6; i++)
        {
            num = sc.nextDouble();
            if (num > 0)
            {
                positivos++;
                media += num;
            }
        }

        media /= positivos;

        System.out.println(positivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}