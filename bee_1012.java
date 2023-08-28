import java.util.Scanner;

public class bee_1012
{
    public static void main(String[] args)
    {
        double a, b, c;
        final double PI = 3.14159;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
                
        areaTriangulo = (a * c) /2.0;
        areaCirculo = PI * Math.pow(c, 2);
        areaTrapezio = ((a + b) * c) / 2.0;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    }   
}
