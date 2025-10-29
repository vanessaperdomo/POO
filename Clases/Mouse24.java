public class Mouse24 {
    String marca;
    String color;
    String tipo;

    public void conectar() {
        System.out.println("Conecta el tipo de mouse: " + tipo + ", marca: " + marca + ", color: " + color + " a los computadores");
    }

    public void mover() {
        System.out.println("Mueve los de color " + color + " a una caja");
    }

    public void click() {
        System.out.println("Haces click con el mouse");
    }
}
