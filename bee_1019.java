import java.util.Scanner;

public class bee_1019
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
        
        segundos = aux;
        
        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
    }   
}
