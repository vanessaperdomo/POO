public class AireAcondicionado7 {
    String marca;
    String modelo;
    String color;

    public void encender() {
        System.out.println("Encendiendo aire acondicionado marca " + marca);
    }

    public void ajustarTemperatura() {
        System.out.println("Ajustando la temperatura del modelo " + modelo);
    }

    public void apagar() {
        System.out.println("Apagando el aire acondicionado color " + color);
    }
}
