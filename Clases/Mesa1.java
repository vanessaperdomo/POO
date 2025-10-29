public class Mesa1 {
    String color;
    double tamano;
    String material;
    String modelo;

    public void ponerObjeto() {  
        System.out.println("El objeto ha sido colocado en la mesa de color " + color);
    }

    public void comer() {
        System.out.println("El material de esta mesa es " + material);
    }

    public void limpiar() {
        System.out.println("Esta mesa es de modelo " + modelo);
    }
}
