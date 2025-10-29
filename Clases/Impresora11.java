public class Impresora11 {
    String marca;
    String modelo;

    public void imprimir() {
        System.out.println("Imprimir los documentos en la impresora " + marca + " y " + modelo);
    }

    public void escanear() {
        System.out.println("Escanear documento con la impresora " + marca + " y " + modelo);
    }

    public void copiar() {
        System.out.println("Copiar documento con la impresora " + marca);
    }
}
