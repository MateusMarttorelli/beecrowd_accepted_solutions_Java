
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int nota100, nota50, nota20, nota10, nota5, nota2, nota1, valor, atual;
        
        Scanner sc = new Scanner(System.in);        
        valor = Integer.parseInt(sc.nextLine());
        atual = valor;
        
        nota100 = atual/100;
        atual -= nota100 * 100;
        nota50 = atual/50;
        atual -= nota50 * 50;
        nota20 = atual/20;
        atual -= nota20 * 20;
        nota10 = atual/10;
        atual -= nota10 * 10;
        nota5 = atual/5;
        atual -= nota5 * 5;
        nota2 = atual/2;
        atual -= nota2 * 2;
        nota1 = atual/1;
        atual -= nota1 * 1;
        
        System.out.println(valor);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");        
    }
}
