import java.util.Scanner;

public class bee_1013
{
    public static void main(String[] args)
    {
        int a, b, c, maiorAB, maiorABC;  
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        maiorAB = ((a + b) + Math.abs(a - b)) / 2;
        maiorABC = ((maiorAB + c) + Math.abs(maiorAB - c)) / 2;
        
        System.out.println(maiorABC + " eh o maior");
    }
}
