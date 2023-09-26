import java.text.DecimalFormat;

class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double novoRaio) {
        if (novoRaio > 0) {
            raio = novoRaio;
        } else {
            System.out.println("O raio deve ser um valor positivo.");
        }
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public boolean saoIguais(Circulo outroCirculo) {
        return this.raio == outroCirculo.getRaio();
    }

    public double calcularAreaSombreada(Circulo outroCirculo) {
        double raioOutroCirculo = outroCirculo.getRaio();
        return Math.abs(this.calcularArea() - outroCirculo.calcularArea());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Círculo - Raio: " + raio + ", Área: " + df.format(calcularArea()) + ", Circunferência: " + df.format(calcularCircunferencia());
    }

    public static Circulo criarAPartirDeCoordenadas(double x, double y, double raio) {
        double distanciaOrigem = Math.sqrt(x * x + y * y);
        if (distanciaOrigem < raio) {
            System.out.println("O ponto está dentro do círculo.");
            return null;
        } else {
            return new Circulo(raio);
        }
    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo(5);
        System.out.println("Círculo 1:");
        System.out.println(c1);
        System.out.println("Diametro: " + c1.calcularDiametro());

        Circulo c2 = new Circulo(7);
        System.out.println("\nCírculo 2:");
        System.out.println(c2);
        System.out.println("Diametro: " + c2.calcularDiametro());

        System.out.println("\nSão iguais? " + c1.saoIguais(c2));

        System.out.println("\nÁrea sombreada entre círculo 1 e círculo 2: " + c1.calcularAreaSombreada(c2));

        Circulo c3 = Circulo.criarAPartirDeCoordenadas(3, 4, 3);
        if (c3 != null) {
            System.out.println("\nCírculo criado a partir das coordenadas (3, 4) com raio 3:");
            System.out.println(c3);
            System.out.println("Diametro: " + c3.calcularDiametro());
        }
    }
}