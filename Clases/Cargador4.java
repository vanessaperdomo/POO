public class Cargador4 {
    String marca;
    String modelo;
    double potencia;

    public void cargarDispositivo() {  
        System.out.println("Cargar todos los dispositivos con el cargador " + marca + " modelo " + modelo);
    }

    public void desconectar() {
        System.out.println("Desconectar todos los cargadores de " + marca + " modelo " + modelo);
    }

    public void verificarConexion() {
        System.out.println("Verificando la conexión del cargador de " + potencia + "W.");
    }
}
