import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del punto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("z1: ");
        double z1 = scanner.nextDouble();
        Punto p1 = new Punto(x1, y1, z1);

        System.out.println("Ingrese las coordenadas del punto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();
        System.out.print("z2: ");
        double z2 = scanner.nextDouble();
        Punto p2 = new Punto(x2, y2, z2);

        System.out.println("Ingrese las coordenadas del punto P3:");
        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();
        System.out.print("z3: ");
        double z3 = scanner.nextDouble();
        Punto p3 = new Punto(x3, y3, z3);

        System.out.println("Ingrese las coordenadas del punto P4:");
        System.out.print("x4: ");
        double x4 = scanner.nextDouble();
        System.out.print("y4: ");
        double y4 = scanner.nextDouble();
        System.out.print("z4: ");
        double z4 = scanner.nextDouble();
        Punto p4 = new Punto(x4, y4, z4);

        Piramide piramide = new Piramide();
        double volumen = piramide.calcularVolumen(p1, p2, p3, p4);
        double areaSuperficial = piramide.calcularAreaSuperficial(p1, p2, p3, p4);

        System.out.println("El volumen de la pirámide es: " + volumen);
        System.out.println("El área superficial de la pirámide es: " + areaSuperficial);
    }
}