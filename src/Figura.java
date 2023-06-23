public class Figura {
    public double calcularDistancia(Punto p1, Punto p2) {
        double distancia = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2) + Math.pow(p2.z - p1.z, 2));
        return distancia;
    }
    }

