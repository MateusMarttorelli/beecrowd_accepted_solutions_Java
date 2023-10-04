import java.util.Scanner;

public class bee_1079
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++)
        {
            double a, b, c;
            double media;

            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = ((a*2) + (b*3) + (c*5)) / 10;
            System.out.printf("%.1f\n", media);
        }
    }
}
