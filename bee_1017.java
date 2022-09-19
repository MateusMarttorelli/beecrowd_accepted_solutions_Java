import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int horas, velocidadeMedia;
        double combustivelGasto;
        
        Scanner sc = new Scanner(System.in);
        
        horas = sc.nextInt();
        velocidadeMedia = sc.nextInt();
        combustivelGasto = (horas * velocidadeMedia) / 12.0;
        
        System.out.println(String.format("%.3f", combustivelGasto));
    } 
}
