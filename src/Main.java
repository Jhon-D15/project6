import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double radio;
        double longitud;
        double area;

        System.out.println("ingrese la medida del radio en cm");
        radio = lector.nextDouble();

        longitud = (2*radio*3.1416);
        area = ((longitud*radio)/2);

        System.out.println("area total del circulo es:"+" "+area+" "+"cm^2");
        System.out.println("la longitud del circulo es:"+" "+longitud+" "+"cm^3");

    }
}