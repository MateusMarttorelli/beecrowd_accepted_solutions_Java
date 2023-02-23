import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int num, i = 0;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        while (i < 6)
        {
            if (num % 2 != 0)
            {
                System.out.println(num);
                i++;
            }
            num++;
        }
    }
}