public class Loker5 {
    String color;
    String material;
    String ubicacion;

    public void abrir() {
        System.out.println("Abres el loker de color " + color + " ubicado en " + ubicacion + ".");
    }

    public void guardarObjetos() {
        System.out.println("Guardas tus pertenencias en el loker de " + material + ".");
    }

    public void cerrar() {
        System.out.println("Cierras el loker con seguridad que esta a la " + ubicacion );
    }
}
