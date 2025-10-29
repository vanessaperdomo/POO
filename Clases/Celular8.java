public class Celular8 {
    String marca;
    String modelo;
    String color;

    public void encender() {
        System.out.println("Encender todos los celulares con la marca " + marca);
    }

    public void tomarFoto() {
        System.out.println("Tomando una foto con el celular " + marca + " de color " + color);
    }

    public void apagar() {
        System.out.println("Apagando el celular " + modelo + " de la marca " + marca);
    }
}
