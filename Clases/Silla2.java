public class Silla2 {
    String color;
    String material;
    String modelo;

    public void sentarse() {  
        System.out.println("Te sientas comodamente en la silla " + modelo);
    }

    public void mover() {
        System.out.println("Mueves la silla " + color + " hacia otro lugar");
    }

    public void limpiar() {
        System.out.println("Limpias la silla hecha de " + material + " para mantenerla en buen estado");
    }
}

