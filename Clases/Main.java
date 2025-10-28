public class Main {
    public static void main(String[] args) {

        Mesa1 mesa1 = new Mesa1();
        Mesa1 mesa2 = new Mesa1();
        Mesa1 mesa3 = new Mesa1();
        Mesa1 mesa4 = new Mesa1();
        Mesa1 mesa5 = new Mesa1();

        System.out.println("Acciones de la mesa 1:");
        mesa1.ponerObjeto();
        System.out.println("Acciones de la mesa 2:");
        mesa2.limpiar();
        System.out.println("Acciones de la mesa 3:");
        mesa3.comer();
        System.out.println("Acciones de la mesa 4:");
        mesa4.limpiar();
        System.out.println("Acciones de la mesa 5:");
        mesa5.ponerObjeto();

        Silla2 silla1 = new Silla2();
        Silla2 silla2 = new Silla2();
        Silla2 silla3 = new Silla2();
        Silla2 silla4 = new Silla2();
        Silla2 silla5 = new Silla2();

        System.out.println("Acciones de la silla 1:");
        silla1.sentarse();
        System.out.println("Acciones de la silla 2:");
        silla2.mover();
        System.out.println("Acciones de la silla 3:");
        silla3.limpiar();
        System.out.println("Acciones de la silla 4:");
        silla4.sentarse();
        silla4.mover();
        System.out.println("Acciones de la silla 5:");
        silla5.sentarse();
        silla5.limpiar();
        
        Computador3 compu1 = new Computador3();
        Computador3 compu2 = new Computador3();
        Computador3 compu3 = new Computador3();
        Computador3 compu4 = new Computador3();
        Computador3 compu5 = new Computador3();

        System.out.println("Acciones del computador 1:");
        compu1.encender();
        compu1.buscarInformacion();
        System.out.println("\nAcciones del computador 2:");
        compu2.encender();
        System.out.println("\nAcciones del computador 3:");
        compu3.buscarInformacion();
        compu3.apagar();
        System.out.println("\nAcciones del computador 4:");
        compu4.encender();
        compu4.apagar();
        System.out.println("\nAcciones del computador 5:");
        compu5.encender();
        compu5.buscarInformacion();
        compu5.apagar();

        Cargador4 cargador1 = new Cargador4();
        Cargador4 cargador2 = new Cargador4();
        Cargador4 cargador3 = new Cargador4();
        Cargador4 cargador4 = new Cargador4();
        Cargador4 cargador5 = new Cargador4();

        System.out.println("Acciones del cargador 1:");
        cargador1.verificarConexion();
        System.out.println("Acciones del cargador 2:");
        cargador2.cargarDispositivo();
        System.out.println("Acciones del cargador 3:");
        cargador3.verificarConexion();
        System.out.println("Acciones del cargador 4:");
        cargador4.desconectar();
        System.out.println("Acciones del cargador 5:");
        cargador5.cargarDispositivo();

        Loker5 loker1 = new Loker5();
        Loker5 loker2 = new Loker5();
        Loker5 loker3 = new Loker5();
        Loker5 loker4 = new Loker5();
        Loker5 loker5 = new Loker5();

        loker1.guardarObjeto();
        loker2.sacarObjeto();
        loker3.guardarObjeto();
        loker4.sacarObjeto();
        loker5.guardarObjeto();

        Televisor6 televisor1 = new Televisor6();
        Televisor6 televisor2 = new Televisor6();
        Televisor6 televisor3 = new Televisor6();
        Televisor6 televisor4 = new Televisor6();
        Televisor6 televisor5 = new Televisor6();

        televisor1.encender();
        televisor2.cambiarCanal();
        televisor3.visualizarContenido();
        televisor4.apagar();
        televisor5.encender();

        AireAcondicionado7 aireAcondicionado1 = new AireAcondicionado7();
        AireAcondicionado7 aireAcondicionado2 = new AireAcondicionado7();
        AireAcondicionado7 aireAcondicionado3 = new AireAcondicionado7();
        AireAcondicionado7 aireAcondicionado4 = new AireAcondicionado7();
        AireAcondicionado7 aireAcondicionado5 = new AireAcondicionado7();


        aireAcondicionado1.TemperaturaAlta();
        aireAcondicionado2.TemperaturaBaja();

        Telefono8 telefono1 = new Telefono8();
        telefono1.hacerLlamada();
        telefono1.enviarMensaje();

        Escoba9 escoba1 = new Escoba9();
        escoba1.barrer();

        Lampara10 lampara1 = new Lampara10();
        lampara1.encender();
        lampara1.apagar();

        Impresora11 impresora1 = new Impresora11();
        impresora1.imprimirDocumento();
        impresora1.escanearDocumento();

        Lapicero12 lapicero1 = new Lapicero12();
        lapicero1.escribir();
        lapicero1.dibujar();

        Venta13 venta1 = new Venta13();
        venta1.vender();
    
        Persona14 persona1 = new Persona14();
        persona1.presentarse();

        Auriculares15 auriculares1 = new Auriculares15();
        auriculares1.reproducirMusica();

        Teclados16 teclado1 = new Teclados16();
        teclado1.escribirTexto();

        Saco17 saco1 = new Saco17();
        saco1.usarSaco();

        Cartuchera18 cartuchera1 = new Cartuchera18();
        cartuchera1.guardarUtiles();
        cartuchera1.sacarUtiles();

        Recogedor19 recogedor1 = new Recogedor19();
        recogedor1.recogerBasura();

        Gorra20 gorra1 = new Gorra20();
        gorra1.usarGorra();

        Gafas21 gafas1 = new Gafas21();
        gafas1.usarGafas();

        Zapatos22 zapatos1 = new Zapatos22();
        zapatos1.usarZapatos();

        FundasCelular23 funda1 = new FundasCelular23();
        funda1.usarFunda();

        Mouse24 mouse1 = new Mouse24();
        mouse1.usarMouse();

        Cables25 cable1 = new Cables25();
        cable1.usarCable();

        Reloj26 reloj1 = new Reloj26();
        reloj1.mostrarHora();

        Televisor27 televisor27 = new Televisor27();
        televisor2.encender();
        televisor2.visualizarContenido();

        Manillas28 manilla1 = new Manillas28();
        manilla1.usarManilla();

        Block29 block1 = new Block29();
        block1.usarBlock();

        Corrector30 corrector1 = new Corrector30();
        corrector1.usarCorrector();
    }
}

