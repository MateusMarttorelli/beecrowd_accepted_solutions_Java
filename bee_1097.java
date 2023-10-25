public class bee_1097
{
    public static void main(String[] args)
    {
        int i = 1, aux = 7;

        while (i <= 9)
        {
            for (int j = aux; j >= (aux-2); j--)
            {
                System.out.printf("I=%d J=%d\n", i, j);
            }
            i += 2;
            aux += 2;
        }
    }
}
