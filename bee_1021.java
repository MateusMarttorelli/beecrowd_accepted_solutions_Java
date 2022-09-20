import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int notas, moedas, notas100, notas50, notas20, notas10, notas5, notas2, moedas1Real, moedas50, moedas25, moedas10, moedas5, moedas1Centavo;
        double valorTotal;
        Scanner sc = new Scanner(System.in);
        
        valorTotal = sc.nextDouble();
        notas = (int)valorTotal;
        moedas = (int)((valorTotal - notas) * 100);
        
        notas100 = notas/100;
        notas -= notas100 * 100;        
        notas50 = notas/50;
        notas -= notas50 * 50;        
        notas20 = notas/20;
        notas -= notas20 * 20;        
        notas10 = notas/10;
        notas -= notas10 * 10;        
        notas5 = notas/5;
        notas -= notas5 * 5;        
        notas2 = notas/2;
        notas -= notas2 * 2;
        
        moedas1Real = notas;
        notas -= moedas1Real * 1;
        moedas50 = moedas/50;
        moedas -= moedas50 * 50;
        moedas25 = moedas/25;
        moedas -= moedas25 * 25;
        moedas10 = moedas/10;
        moedas -= moedas10 * 10;
        moedas5 = moedas/5;
        moedas -= moedas5 * 5;
        moedas1Centavo = moedas;
        
        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1Real + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas1Centavo + " moeda(s) de R$ 0.01");        
    }
}
