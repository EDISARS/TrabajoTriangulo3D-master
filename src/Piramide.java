class Piramide extends Figura {
    Triangulo triangulo;
    public double calcularVolumen(Punto p1, Punto p2, Punto p3, Punto p4) {
        Triangulo trianguloBase = new Triangulo();
        double areaBase = trianguloBase.calcularArea(p1, p2, p3);
        double altura = calcularDistancia(p4, Triangulo.calcularBaricentro(p1, p2, p3));
        double volumen = (areaBase * altura) / 3;
        return volumen;
    }

    public double calcularAreaSuperficial(Punto p1, Punto p2, Punto p3, Punto p4) {
        Triangulo trianguloBase = new Triangulo();
        double areaBase = trianguloBase.calcularArea(p1, p2, p3);
        double lado1 = calcularDistancia(p1, p2);
        double lado2 = calcularDistancia(p2, p3);
        double lado3 = calcularDistancia(p3, p1);
        double areaLateral = lado1 + lado2 + lado3;
        double areaSuperficial = areaBase + areaLateral;
        return areaSuperficial;
    }
}
