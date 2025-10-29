public class Block29 {
    String tamaño;
    String color;
    int hojas;

    public void escribir() {
        System.out.println("Escribes en el block de color " + color);
    }

    public void guardar() {
        System.out.println("Guardas el block de tamaño " + tamaño + " con " + hojas + " hojas");
    }
}