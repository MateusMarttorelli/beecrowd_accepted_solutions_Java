import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        HashMap<Integer, Double> lanche = new HashMap<Integer, Double>();
        Scanner sc = new Scanner(System.in);
        int opcao, x;

        lanche.put(1, 4.00);
        lanche.put(2, 4.50);
        lanche.put(3, 5.00);
        lanche.put(4, 2.00);
        lanche.put(5, 1.50);

         opcao = sc.nextInt();
         x = sc.nextInt();

        System.out.printf("Total: R$ %.2f\n", lanche.get(opcao) * x);
    }
}