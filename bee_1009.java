import java.util.Scanner;

public class bee_1009
{
    public static void main(String[] args)
    {
        String nome;
        double salarioFixo, vendasTotais, salarioFinal;
        Scanner sc = new Scanner(System.in);
        
        nome = sc.nextLine();
        salarioFixo = Double.parseDouble(sc.nextLine());
        vendasTotais = Double.parseDouble(sc.nextLine());
        salarioFinal = salarioFixo + (vendasTotais * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);
    }
}
