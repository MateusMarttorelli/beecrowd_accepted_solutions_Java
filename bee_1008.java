import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int n, hora;
        double valor, salario;
        
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        hora = sc.nextInt();
        valor = sc.nextDouble();
        
        salario = hora * valor;
        
        System.out.println("NUMBER = " + n);
        System.out.println(String.format("SALARY = U$ %.2f", salario));
    }
}
