import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String[] linhaDiaInicial = sc.nextLine().split(" ");
        String[] linhaHorarioInicial = sc.nextLine().replace(" ", "").split(":");
        String[] linhaDiaFinal = sc.nextLine().split(" ");
        String[] linhaHorarioFinal = sc.nextLine().replace(" ", "").split(":");

        int diaInicial = Integer.parseInt(linhaDiaInicial[1]);
        int diaFinal = Integer.parseInt(linhaDiaFinal[1]);
        int horaInicial = Integer.parseInt(linhaHorarioInicial[0]);
        int horaFinal = Integer.parseInt(linhaHorarioFinal[0]);
        int minutoInicial = Integer.parseInt(linhaHorarioInicial[1]);
        int minutoFinal = Integer.parseInt(linhaHorarioFinal[1]);
        int segundoInicial = Integer.parseInt(linhaHorarioInicial[2]);
        int segundoFinal = Integer.parseInt(linhaHorarioFinal[2]);
        int dias = diaFinal - diaInicial;
        int horas = horaFinal - horaInicial;
        int minutos = minutoFinal - minutoInicial;
        int segundos = segundoFinal - segundoInicial;

        if (segundos < 0)
        {
            segundos += 60;
            minutos--;
        }
        if (minutos < 0)
        {
            minutos += 60;
            horas--;
        }
        if (horas < 0)
        {
            horas += 24;
            dias--;
        }

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

    }
}
