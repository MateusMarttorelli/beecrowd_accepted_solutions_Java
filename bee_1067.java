import java.util.Scanner;

public class bee_1067
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        for (int i = 1; i <= num; i += 2)
        {
            System.out.println(i);
        }
    }
}