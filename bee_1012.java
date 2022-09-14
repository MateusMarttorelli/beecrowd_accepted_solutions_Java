import java.util.Scanner;

public class Main
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
        
        System.out.println(String.format("TRIANGULO: %.3f", areaTriangulo));  
        System.out.println(String.format("CIRCULO: %.3f", areaCirculo)); 
        System.out.println(String.format("TRAPEZIO: %.3f", areaTrapezio)); 
        System.out.println(String.format("QUADRADO: %.3f", areaQuadrado)); 
        System.out.println(String.format("RETANGULO: %.3f", areaRetangulo)); 
    }   
}
