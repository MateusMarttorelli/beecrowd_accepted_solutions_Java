import java.util.Scanner;

public class Main
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
        
        dias = aux/1;
        
        System.out.println(String.format("%d ano(s)\n%d mes(es)\n%d dia(s)", anos, meses, dias));
    }   
}
