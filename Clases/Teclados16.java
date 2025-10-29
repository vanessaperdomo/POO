public class Teclados16 {
    String marca;
    String tipo;
    int teclas;

    public void escribir() {
        System.out.println("Con que marca de teclado " + marca + " estas escribiendo");
    }

    public void limpiar() {
        System.out.println("Limpia todos los teclados de tipo " + tipo);
    }

    public void conectar() {
        System.out.println("Conectaste el teclado " + marca);
    }
}
