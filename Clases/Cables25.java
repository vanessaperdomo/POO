public class Cables25 {
    String tipo;
    String color;

    public void conectar() {
        System.out.println("Conectas el cable de tipo " + tipo);
    }

    public void desconectar() {
        System.out.println("Desconectas el cable de tipo " + tipo + "  y de color " + color);
    }

    public void enrollar() {
        System.out.println("Enrollas el cable de tipo " + tipo + "  y de color " + color);
    }
}
