public class Cartuchera18 {
    String color;
    String material;

    public void guardarLapices() {
        System.out.println("Guarda los lapices en la cartuchera de " + color);
    }

    public void abrir() {
        System.out.println("Abre la cartuchera de material " + material);
    }

    public void cerrar() {
        System.out.println("Cierra la cartuchera de color " + color);
    }
}
