import java.util.Scanner;

public class bee_1047
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int hInicial = entrada.nextInt();
        int mInicial = entrada.nextInt();
        int hFinal = entrada.nextInt();
        int mFinal = entrada.nextInt();
        int mTotaisInicial = (hInicial*60) + mInicial;
        int mTotaisFinal = (hFinal*60) + mFinal;
        int mTotaisDia = (24*60);
        int resultado;

        if(mTotaisFinal > mTotaisInicial)
        {
            resultado = mTotaisFinal - mTotaisInicial;
        }
        else if(mTotaisInicial > mTotaisFinal)
        {
            resultado = (mTotaisDia - mTotaisInicial) + (mTotaisFinal);
        }
        else
        {
            resultado = mTotaisDia;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
    }
}