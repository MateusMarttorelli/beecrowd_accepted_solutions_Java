import java.util.Scanner;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> cidade = new HashMap<Integer, String>();

        cidade.put(61, "Brasilia");
        cidade.put(71, "Salvador");
        cidade.put(11, "Sao Paulo");
        cidade.put(21, "Rio de Janeiro");
        cidade.put(32, "Juiz de Fora");
        cidade.put(19, "Campinas");
        cidade.put(27, "Vitoria");
        cidade.put(31, "Belo Horizonte");

        Integer ddd = sc.nextInt();

        System.out.println(cidade.getOrDefault(ddd, "DDD nao cadastrado"));
    }
}