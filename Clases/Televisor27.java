public class Televisor27 {
    private String marca;
    private String modelo;
    private String resolucion;

    public void encender(){
        System.out.println("El televisor esta prendido");
    }

    public void visualizarContenido(){
        System.out.println("Visualizando contenido en resolución " + resolucion + " en el televisor " + marca + " modelo " + modelo + ".");
    }
}
