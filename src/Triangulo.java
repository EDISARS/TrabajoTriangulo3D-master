class Triangulo extends Figura {
    Punto punto;
    public double calcularArea(Punto p1, Punto p2, Punto p3) {
        double lado1 = calcularDistancia(p1, p2);
        double lado2 = calcularDistancia(p2, p3);
        double lado3 = calcularDistancia(p3, p1);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
}

    public static Punto calcularBaricentro(Punto p1, Punto p2, Punto p3) {
        double x = (p1.x + p2.x + p3.x) / 3;
        double y = (p1.y + p2.y + p3.y) / 3;
        double z = (p1.z + p2.z + p3.z) / 3;
        return new Punto(x, y, z);
    }
}
