import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int codigo, quantidade;
        float preco, valorTotal = 0f;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++)
        {
            codigo = sc.nextInt();
            quantidade = sc.nextInt();
            preco = sc.nextFloat();
            valorTotal += quantidade * preco;
        }
        
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTotal));
    }
}
