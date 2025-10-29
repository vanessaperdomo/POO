public class Reloj26 {
    String marca;
    String color;
    String tipo;

    public void poner() {
        System.out.println("Te pones el reloj de marca " + marca + " de color " + color + " y tipo " + tipo);
    }

    public void mirarHora() {
        System.out.println("Miras la hora del reloj de marca " + marca + " de color " + color);
    }

    public void ajustar() {
        System.out.println("Ajustas la hora del reloj de marca " + marca + " de color " + color);
    }
}
