import java.util.Scanner;

public class bee_1008
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
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
