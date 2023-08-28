import java.util.Scanner;

public class bee_1020
{
    public static void main(String[] args)
    {
        int tempo, aux, anos, meses, dias;        
        Scanner sc = new Scanner(System.in);
        
        tempo = sc.nextInt();
        aux = tempo;
        
        anos = aux/365;
        aux -= anos * 365;
        
        meses = aux/30;
        aux -= meses * 30;
        
        dias = aux;
        
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)%n", anos, meses, dias);
    }   
}
