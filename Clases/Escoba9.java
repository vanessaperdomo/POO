public class Escoba9 {
    String color;
    String material;
    String tipo;

    public void barrer() {
        System.out.println("Barrer el patio con la escoba de " + color);
    }

    public void limpiar() {
        System.out.println("Usas la escoba de " + material + " para limpiar las hiervas");
    }

    public void guardar() {
        System.out.println("Guardas la escoba " + tipo + " de color " + color);
    }
}
