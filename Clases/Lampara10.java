public class Lampara10 {
    String color;
    String tipo;
    double precio;

    public void encender() {
        System.out.println("Encender las lamparas de tipo " + tipo + "  y de color " + color);
    }

    public void apagar() {
        System.out.println("Apagar las lamparas de tipo " + tipo + "  y de color " + color);
    }

    public void ajustarBrillo() {
        System.out.println("Ajustar el brillo de las lamparas de tipo " + tipo);
    }
}
