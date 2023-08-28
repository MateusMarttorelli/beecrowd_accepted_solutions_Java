import java.util.Scanner;

public class bee_1017
{
    public static void main(String[] args)
    {
        int horas, velocidadeMedia;
        double combustivelGasto;
        
        Scanner sc = new Scanner(System.in);
        
        horas = sc.nextInt();
        velocidadeMedia = sc.nextInt();
        combustivelGasto = (horas * velocidadeMedia) / 12.0;
        
        System.out.printf("%.3f%n", combustivelGasto);
    } 
}
