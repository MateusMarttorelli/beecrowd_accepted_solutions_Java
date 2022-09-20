import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int tempo, aux, horas, minutos, segundos;        
        Scanner sc = new Scanner(System.in);
        
        tempo = sc.nextInt();
        aux = tempo;
        
        horas = aux/3600;
        aux -= horas * 3600;
        
        minutos = aux/60;
        aux -= minutos * 60;
        
        segundos = aux/1;
        
        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));        
    }   
}
