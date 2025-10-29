public class Computador3 {
    String marca;
    String modelo;
    double precio;
    String procesador;

    public void encender() {  
        System.out.println("El computador " + marca + " modelo " + modelo + " se ha encendido");
    }

    public void buscarInformacion() {  
        System.out.println("El computador con procesador " + procesador + " ir a configuracion para ver su informacion");
    }

    public void apagar() {
        System.out.println("Apagar los computadores de la " + marca + " y modelo " + modelo);
    }
}
