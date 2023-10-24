public class bee_1096
{
    public static void main(String[] args)
    {
        int i = 1;

        while (i <= 9)
        {
            for (int j = 7; j >= 5; j--)
            {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            i += 2;
        }
    }
}
