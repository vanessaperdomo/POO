public class Televisor6 {
    String marca;
    String modelo;
    int pulgadas;

    public void encender() {
        System.out.println("Encender todos los televisores de marca " + marca);
    }

    public void cambiarCanal() {
        System.out.println("Cambiar el canal del televisor de marca " + marca + " y modelo " + modelo);
    }

    public void apagar() {
        System.out.println("Apagar todos los televisores de marca " + marca + " y modelo " + modelo );
    }
}
