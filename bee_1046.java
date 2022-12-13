import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int horaInicial, horaFinal, tempoTotal;
        Scanner sc = new Scanner(System.in);

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial > horaFinal)
        {
            tempoTotal = (24 - horaInicial) + horaFinal;
        }
        else if (horaInicial < horaFinal)
        {
            tempoTotal = horaFinal - horaInicial;
        }
        else
        {
            tempoTotal = 24;
        }

        System.out.println("O JOGO DUROU " + tempoTotal + " HORA(S)");
    }
}