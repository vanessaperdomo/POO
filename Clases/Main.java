public class Main {
    public static void main(String[] args) {

        System.out.println("Clase 1: Mesa");
        Mesa1 mesa1 = new Mesa1(); mesa1.color = "Marron"; mesa1.material = "Madera"; mesa1.modelo = "Clásico"; mesa1.tamano = 1.5; mesa1.ponerObjeto();
        Mesa1 mesa2 = new Mesa1(); mesa2.color = "Negro"; mesa2.material = "Metal"; mesa2.modelo = "Moderno"; mesa2.tamano = 1.2; mesa2.limpiar();
        Mesa1 mesa3 = new Mesa1(); mesa3.color = "Blanco"; mesa3.material = "Plástico"; mesa3.modelo = "Compacto"; mesa3.tamano = 1.0; mesa3.comer();
        Mesa1 mesa4 = new Mesa1(); mesa4.color = "Gris"; mesa4.material = "Vidrio"; mesa4.modelo = "Elegante"; mesa4.tamano = 2.0; mesa4.limpiar();
        Mesa1 mesa5 = new Mesa1(); mesa5.color = "Beige"; mesa5.material = "Madera"; mesa5.modelo = "Rustico"; mesa5.tamano = 1.8; mesa5.ponerObjeto();

        System.out.println("Clase 2: Silla");
        Silla2 silla1 = new Silla2(); silla1.color = "negra"; silla1.material = "cuero"; silla1.modelo = "oficina"; silla1.sentarse();
        Silla2 silla2 = new Silla2(); silla2.color = "blanca"; silla2.material = "plastico"; silla2.modelo = "de comedor"; silla2.limpiar();
        Silla2 silla3 = new Silla2(); silla3.color = "negra"; silla3.material = "metal"; silla3.modelo = "plegable"; silla3.mover();
        Silla2 silla4 = new Silla2(); silla4.color = "azul"; silla4.material = "tela"; silla4.modelo = "rustica"; silla4.sentarse();
        Silla2 silla5 = new Silla2(); silla5.color = "marron"; silla5.material = "madera"; silla5.modelo = "rustica"; silla5.limpiar();

        System.out.println("Clase 3: Computador");
        Computador3 comp1 = new Computador3(); comp1.marca = "HP"; comp1.modelo = "Pavilion"; comp1.precio = 2249900; comp1.procesador = "Intel core i5"; comp1.encender();
        Computador3 comp2 = new Computador3(); comp2.marca = "Lenovo"; comp2.modelo = "Lenovo V14 G3"; comp2.precio = 2204073; comp2.procesador = "AMD Ryzen 7"; comp2.buscarInformacion();
        Computador3 comp3 = new Computador3(); comp3.marca = "Lenovo"; comp3.modelo = "Legion Pro 5"; comp3.precio = 8399002; comp3.procesador = "AMD Ryzen 9"; comp3.apagar();
        Computador3 comp4 = new Computador3(); comp4.marca = "Asus"; comp4.modelo = "VivoBook"; comp4.precio = 2700000; comp4.procesador = "Intel i3"; comp4.encender();
        Computador3 comp5 = new Computador3(); comp5.marca = "Acer"; comp5.modelo = "Aspire 5"; comp5.precio = 2500000; comp5.procesador = "AMD Ryzen 3"; comp5.buscarInformacion();

        System.out.println("Clase 4: Cargador");
        Cargador4 cargador1 = new Cargador4(); cargador1.marca = "Samsung"; cargador1.modelo = "EP-TA800"; cargador1.potencia = 25; cargador1.cargarDispositivo();
        Cargador4 cargador2 = new Cargador4(); cargador2.marca = "Apple"; cargador2.modelo = "A2344"; cargador2.potencia = 20; cargador2.verificarConexion();
        Cargador4 cargador3 = new Cargador4(); cargador3.marca = "Xiaomi"; cargador3.modelo = "MDY-11-EZ"; cargador3.potencia = 33; cargador3.desconectar();
        Cargador4 cargador4 = new Cargador4(); cargador4.marca = "Lenovo"; cargador4.modelo = "LA65NS2-01"; cargador4.potencia = 65; cargador4.cargarDispositivo();
        Cargador4 cargador5 = new Cargador4(); cargador5.marca = "Asus"; cargador5.modelo = "ADP-45EW"; cargador5.potencia = 45; cargador5.verificarConexion();

        System.out.println("Clase 5: Loker");
        Loker5 loker1 = new Loker5(); loker1.color = "Azul"; loker1.material = "Metal"; loker1.ubicacion = "entrada principal"; loker1.abrir();
        Loker5 loker2 = new Loker5(); loker2.color = "Gris"; loker2.material = "Acero"; loker2.ubicacion = "pasillo A"; loker2.guardarObjetos();
        Loker5 loker3 = new Loker5(); loker3.color = "Rojo"; loker3.material = "Plástico reforzado"; loker3.ubicacion = "zona deportiva"; loker3.cerrar();
        Loker5 loker4 = new Loker5(); loker4.color = "Verde"; loker4.material = "Hierro"; loker4.ubicacion = "bloque B"; loker4.abrir();
        Loker5 loker5 = new Loker5(); loker5.color = "Negro"; loker5.material = "Aluminio"; loker5.ubicacion = "salón de instructores"; loker5.guardarObjetos();

        System.out.println("Clase 6: Televisor");
        Televisor6 tv1 = new Televisor6(); tv1.marca = "Samsung"; tv1.modelo = "2023"; tv1.pulgadas = 50; tv1.encender();
        Televisor6 tv2 = new Televisor6(); tv2.marca = "LG"; tv2.modelo = "2024"; tv2.pulgadas = 55; tv2.cambiarCanal();
        Televisor6 tv3 = new Televisor6(); tv3.marca = "Samsung"; tv3.modelo = "2024"; tv3.pulgadas = 65; tv3.apagar();
        Televisor6 tv4 = new Televisor6(); tv4.marca = "Hisense"; tv4.modelo = "2023"; tv4.pulgadas = 58; tv4.encender();
        Televisor6 tv5 = new Televisor6(); tv5.marca = "Caixun"; tv5.modelo = "2022"; tv5.pulgadas = 50; tv5.cambiarCanal();
        
        System.out.println("Clase 7: Aire Acondicionado");
        AireAcondicionado7 aire1 = new AireAcondicionado7(); aire1.marca = "LG"; aire1.modelo = "Dual Inverter"; aire1.color = "Blanco"; aire1.encender();
        AireAcondicionado7 aire2 = new AireAcondicionado7(); aire2.marca = "Samsung"; aire2.modelo = "WindFree Plus"; aire2.color = "Gris"; aire2.ajustarTemperatura();
        AireAcondicionado7 aire3 = new AireAcondicionado7(); aire3.marca = "Haceb"; aire3.modelo = "2022"; aire3.color = "Blanco"; aire3.apagar();
        AireAcondicionado7 aire4 = new AireAcondicionado7(); aire4.marca = "Midea"; aire4.modelo = "2025"; aire4.color = "Plata"; aire4.encender();
        AireAcondicionado7 aire5 = new AireAcondicionado7(); aire5.marca = "Whirlpool"; aire5.modelo = "2020"; aire5.color = "Negro"; aire5.ajustarTemperatura();

        System.out.println("Clase 8: Celular");
        Celular8 cel1 = new Celular8(); cel1.marca = "Samsung"; cel1.modelo = "Galaxy S24"; cel1.color = "Negro"; cel1.encender();
        Celular8 cel2 = new Celular8(); cel2.marca = "Xiaomi"; cel2.modelo = "Redmi Note 13"; cel2.color = "Azul"; cel2.tomarFoto();
        Celular8 cel3 = new Celular8(); cel3.marca = "Apple"; cel3.modelo = "iPhone 15"; cel3.color = "Blanco"; cel3.apagar();
        Celular8 cel4 = new Celular8(); cel4.marca = "Motorola"; cel4.modelo = "Edge 50"; cel4.color = "Gris"; cel4.encender();
        Celular8 cel5 = new Celular8(); cel5.marca = "OPPO"; cel5.modelo = "Reno11 F"; cel5.color = "Verde"; cel5.tomarFoto();

        System.out.println("Clase 9: Escoba");
        Escoba9 e1 = new Escoba9(); e1.color = "Roja"; e1.material = "Plastico"; e1.tipo = "De piso"; e1.barrer();
        Escoba9 e2 = new Escoba9(); e2.color = "Verde"; e2.material = "Madera"; e2.tipo = "Exterior"; e2.limpiar();
        Escoba9 e3 = new Escoba9(); e3.color = "Azul"; e3.material = "Metal"; e3.tipo = "De taller"; e3.guardar();
        Escoba9 e4 = new Escoba9(); e4.color = "Negra"; e4.material = "Plastico"; e4.tipo = "De baño"; e4.barrer();
        Escoba9 e5 = new Escoba9(); e5.color = "Gris"; e5.material = "Madera"; e5.tipo = "De casa"; e5.guardar();

        System.out.println("Clase 10: Lampara");
        Lampara10 l1 = new Lampara10(); l1.color = "Blanca"; l1.tipo = "De escritorio"; l1.precio = 12000; l1.encender();
        Lampara10 l2 = new Lampara10(); l2.color = "Negra"; l2.tipo = "De pie"; l2.precio = 18000; l2.apagar();
        Lampara10 l3 = new Lampara10(); l3.color = "Azul"; l3.tipo = "Colgante"; l3.precio = 15000; l3.ajustarBrillo();
        Lampara10 l4 = new Lampara10(); l4.color = "Roja"; l4.tipo = "De mesa"; l4.precio = 20000; l4.encender();
        Lampara10 l5 = new Lampara10(); l5.color = "Amarilla"; l5.tipo = "De pie"; l5.precio = 27300; l5.apagar();

        System.out.println("Clase 11: Impresora");
        Impresora11 i1 = new Impresora11(); i1.marca = "HP"; i1.modelo = "2024"; i1.imprimir();
        Impresora11 i2 = new Impresora11(); i2.marca = "Canon"; i2.modelo = "2021"; i2.escanear();
        Impresora11 i3 = new Impresora11(); i3.marca = "Epson"; i3.modelo = "2019"; i3.copiar();
        Impresora11 i4 = new Impresora11(); i4.marca = "Brother"; i4.modelo = "2022"; i4.imprimir();
        Impresora11 i5 = new Impresora11(); i5.marca = "Samsung"; i5.modelo = "2023"; i5.escanear();

        System.out.println("Clase 12: Lapicero");
        Lapicero12 lap1 = new Lapicero12(); lap1.color = "Azul"; lap1.marca = "Bic"; lap1.escribir();
        Lapicero12 lap2 = new Lapicero12(); lap2.color = "Negro"; lap2.marca = "Faber"; lap2.dibujar();
        Lapicero12 lap3 = new Lapicero12(); lap3.color = "Rojo"; lap3.marca = "Pilot"; lap3.escribir();
        Lapicero12 lap4 = new Lapicero12(); lap4.color = "Verde"; lap4.marca = "Maped"; lap4.escribir();
        Lapicero12 lap5 = new Lapicero12(); lap5.color = "Rosa"; lap5.marca = "Staedtler"; lap5.dibujar();

        System.out.println("Clase 13: Ventanas");
        Ventana13 v1 = new Ventana13(); v1.color = "Blanco"; v1.tamano = "Grande"; v1.abrir();
        Ventana13 v2 = new Ventana13(); v2.color = "Gris"; v2.tamano = "Pequeña"; v2.cerrar();
        Ventana13 v3 = new Ventana13(); v3.color = "Azul"; v3.tamano = "Mediana"; v3.abrir();
        Ventana13 v4 = new Ventana13(); v4.color = "Rojo"; v4.tamano = "Grande"; v4.cerrar();
        Ventana13 v5 = new Ventana13(); v5.color = "Verde"; v5.tamano = "Pequeña"; v5.abrir();

        System.out.println("Clase 14: Persona");
        Persona14 p1 = new Persona14(); p1.nombre = "Mariana c"; p1.edad = 18; p1.identificacion = "12213456789"; p1.presentarse();
        Persona14 p2 = new Persona14(); p2.nombre = "Danna"; p2.edad = 17; p2.identificacion = "98765432131"; p2.presentarse();
        Persona14 p3 = new Persona14(); p3.nombre = "Emily"; p3.edad = 17; p3.identificacion = "45612378973"; p3.presentarse();
        Persona14 p4 = new Persona14(); p4.nombre = "Luisa"; p4.edad = 18; p4.identificacion = "1234567899"; p4.presentarse();
        Persona14 p5 = new Persona14(); p5.nombre = "Laura"; p5.edad = 19; p5.identificacion = "1075228306"; p5.presentarse();

        System.out.println("Clase 15: Auricular");
        Auricular15 a1 = new Auricular15(); a1.marca = "Sony"; a1.color = "Rosado"; a1.escuchar();
        Auricular15 a2 = new Auricular15(); a2.marca = "Lenovo"; a2.color = "Negro"; a2.cargar();
        Auricular15 a3 = new Auricular15(); a3.marca = "Iphone"; a3.color = "Blanco"; a3.cargar();
        Auricular15 a4 = new Auricular15(); a4.marca = "JBL"; a4.color = "Azul"; a4.llamar();
        Auricular15 a5 = new Auricular15(); a5.marca = "Diadema gamer"; a5.color = "Negro"; a5.cargar();

        System.out.println("Clase 16: Teclado");
        Teclados16 teclado1 = new Teclados16(); teclado1.marca = "Logitech"; teclado1.tipo = "Mecanico"; teclado1.teclas = 104; teclado1.escribir();
        Teclados16 teclado2 = new Teclados16(); teclado2.marca = "Microsoft"; teclado2.tipo = "Membrana"; teclado2.teclas = 105; teclado2.escribir();
        Teclados16 teclado3 = new Teclados16(); teclado3.marca = "Razer"; teclado3.tipo = "Mecanico"; teclado3.teclas = 108; teclado3.conectar();
        Teclados16 teclado4 = new Teclados16(); teclado4.marca = "Corsair"; teclado4.tipo = "Mecanico"; teclado4.teclas = 104; teclado4.limpiar();
        Teclados16 teclado5 = new Teclados16(); teclado5.marca = "HP"; teclado5.tipo = "Membrana"; teclado5.teclas = 102; teclado5.conectar();

        System.out.println("Clase 17: Saco");
        Saco17 saco1 = new Saco17(); saco1.color = "Rojo"; saco1.talla = "M"; saco1.material = "Algodon"; saco1.usar();
        Saco17 saco2 = new Saco17(); saco2.color = "Azul"; saco2.talla = "L"; saco2.material = "Lana"; saco2.lavar();
        Saco17 saco3 = new Saco17(); saco3.color = "Negro"; saco3.talla = "S"; saco3.material = "Cuero"; saco3.guardar();
        Saco17 saco4 = new Saco17(); saco4.color = "Verde"; saco4.talla = "XL"; saco4.material = "Sintético"; saco4.usar();
        Saco17 saco5 = new Saco17(); saco5.color = "Amarillo"; saco5.talla = "M"; saco5.material = "Lino"; saco5.lavar();

        System.out.println("Clase 18: Cartuchera");
        Cartuchera18 cartuchera1 = new Cartuchera18(); cartuchera1.color = "Rojo"; cartuchera1.material = "Cuero"; cartuchera1.abrir();
        Cartuchera18 cartuchera2 = new Cartuchera18(); cartuchera2.color = "Azul"; cartuchera2.material = "Plastico"; cartuchera2.cerrar();
        Cartuchera18 cartuchera3 = new Cartuchera18(); cartuchera3.color = "Verde"; cartuchera3.material = "Tela"; cartuchera3.guardarLapices();
        Cartuchera18 cartuchera4 = new Cartuchera18(); cartuchera4.color = "Amarillo"; cartuchera4.material = "Nailon"; cartuchera4.abrir();
        Cartuchera18 cartuchera5 = new Cartuchera18(); cartuchera5.color = "Negro"; cartuchera5.material = "Sintetico"; cartuchera5.cerrar();

        System.out.println("Clase 19: Recogedor");
        Recogedor19 recogedor1 = new Recogedor19(); recogedor1.color = "Rojo"; recogedor1.material = "Plastico"; recogedor1.recoger();
        Recogedor19 recogedor2 = new Recogedor19(); recogedor2.color = "Azul"; recogedor2.material = "Metal"; recogedor2.limpiar();
        Recogedor19 recogedor3 = new Recogedor19(); recogedor3.color = "Verde"; recogedor3.material = "Madera"; recogedor3.guardar();
        Recogedor19 recogedor4 = new Recogedor19(); recogedor4.color = "Amarillo"; recogedor4.material = "Plastico"; recogedor4.limpiar();
        Recogedor19 recogedor5 = new Recogedor19(); recogedor5.color = "Negro"; recogedor5.material = "Metal"; recogedor5.recoger();

        System.out.println("Clase 20: Gorra");
        Gorra20 gorra1 = new Gorra20(); gorra1.color = "Rojo"; gorra1.marca = "Nike"; gorra1.talla = "M"; gorra1.quitar();
        Gorra20 gorra2 = new Gorra20(); gorra2.color = "Azul"; gorra2.marca = "Adidas"; gorra2.talla = "L"; gorra2.usar();
        Gorra20 gorra3 = new Gorra20(); gorra3.color = "Negra"; gorra3.marca = "Puma"; gorra3.talla = "S"; gorra3.ajustar();
        Gorra20 gorra4 = new Gorra20(); gorra4.color = "Verde"; gorra4.marca = "Reebok"; gorra4.talla = "XL"; gorra4.quitar();
        Gorra20 gorra5 = new Gorra20(); gorra5.color = "Amarilla"; gorra5.marca = "Under Armour"; gorra5.talla = "M"; gorra5.usar();
        
        System.out.println("Clase 21: Gafas");
        Gafas21 gafas1 = new Gafas21(); gafas1.marca = "Ray-Ban"; gafas1.color = "Negro"; gafas1.tipo = "Polarizadas"; gafas1.poner();
        Gafas21 gafas2 = new Gafas21(); gafas2.marca = "Oakley"; gafas2.color = "Azul"; gafas2.tipo = "De sol"; gafas2.quitar();
        Gafas21 gafas3 = new Gafas21(); gafas3.marca = "Prada"; gafas3.color = "Rojo"; gafas3.tipo = "Graduadas"; gafas3.limpiar();
        Gafas21 gafas4 = new Gafas21(); gafas4.marca = "Gucci"; gafas4.color = "Verde"; gafas4.tipo = "Polarizadas"; gafas4.poner();
        Gafas21 gafas5 = new Gafas21(); gafas5.marca = "Versace"; gafas5.color = "Amarillo"; gafas5.tipo = "De sol"; gafas5.quitar();
        
        System.out.println("Clase 22: Zapatos");
        Zapatos22 zapato1 = new Zapatos22(); zapato1.talla = "42"; zapato1.color = "Negro"; zapato1.marca = "Nike"; zapato1.poner();
        Zapatos22 zapato2 = new Zapatos22(); zapato2.talla = "40"; zapato2.color = "Blanco"; zapato2.marca = "Adidas"; zapato2.caminar();
        Zapatos22 zapato3 = new Zapatos22(); zapato3.talla = "41"; zapato3.color = "Marrón"; zapato3.marca = "Puma"; zapato3.poner();
        Zapatos22 zapato4 = new Zapatos22(); zapato4.talla = "43"; zapato4.color = "Azul"; zapato4.marca = "Reebok"; zapato4.caminar();
        Zapatos22 zapato5 = new Zapatos22(); zapato5.talla = "39"; zapato5.color = "Gris"; zapato5.marca = "New Balance"; zapato5.poner();
        
        System.out.println("Clase 23: Cuaderno");
        Cuaderno23 cuaderno1 = new Cuaderno23(); cuaderno1.marca = "Moleskine"; cuaderno1.tipo = "Rayado"; cuaderno1.abrir();
        Cuaderno23 cuaderno2 = new Cuaderno23(); cuaderno2.marca = "Oxford"; cuaderno2.tipo = "Cuadriculado"; cuaderno2.escribir();
        Cuaderno23 cuaderno3 = new Cuaderno23(); cuaderno3.marca = "Papelera"; cuaderno3.tipo = "Liso"; cuaderno3.abrir();
        Cuaderno23 cuaderno4 = new Cuaderno23(); cuaderno4.marca = "Norma"; cuaderno4.tipo = "Rayado"; cuaderno4.escribir();
        Cuaderno23 cuaderno5 = new Cuaderno23(); cuaderno5.marca = "Stabler"; cuaderno5.tipo = "Cuadriculado"; cuaderno5.abrir();

        System.out.println("Clase 24: Mouse");
        Mouse24 mouse1 = new Mouse24(); mouse1.marca = "Logitech"; mouse1.color = "Negro"; mouse1.tipo = "Inalámbrico"; mouse1.conectar();
        Mouse24 mouse2 = new Mouse24(); mouse2.marca = "Microsoft"; mouse2.color = "Azul"; mouse2.tipo = "Óptico"; mouse2.mover();
        Mouse24 mouse3 = new Mouse24(); mouse3.marca = "Razer"; mouse3.color = "Verde"; mouse3.tipo = "Gamer"; mouse3.click();
        Mouse24 mouse4 = new Mouse24(); mouse4.marca = "HP"; mouse4.color = "Rojo"; mouse4.tipo = "Inalámbrico"; mouse4.conectar();
        Mouse24 mouse5 = new Mouse24(); mouse5.marca = "Dell"; mouse5.color = "Gris"; mouse5.tipo = "Óptico"; mouse5.mover();
        
        System.out.println("Clase 25: Cable");
        Cables25 cable1 = new Cables25(); cable1.tipo = "USB"; cable1.color = "Negro"; cable1.conectar();
        Cables25 cable2 = new Cables25(); cable2.tipo = "HDMI"; cable2.color = "Rojo"; cable2.desconectar();
        Cables25 cable3 = new Cables25(); cable3.tipo = "Ethernet"; cable3.color = "Azul"; cable3.enrollar();
        Cables25 cable4 = new Cables25(); cable4.tipo = "Lightning"; cable4.color = "Blanco"; cable4.conectar();
        Cables25 cable5 = new Cables25(); cable5.tipo = "USB-C"; cable5.color = "Gris"; cable5.desconectar();

        System.out.println("Clase 26: Reloj");
        Reloj26 reloj1 = new Reloj26(); reloj1.marca = "Casio"; reloj1.color = "Negro"; reloj1.tipo = "Digital"; reloj1.poner();
        Reloj26 reloj2 = new Reloj26(); reloj2.marca = "Rolex"; reloj2.color = "Dorado"; reloj2.tipo = "Analogico"; reloj2.mirarHora();
        Reloj26 reloj3 = new Reloj26(); reloj3.marca = "Fossil"; reloj3.color = "Plateado"; reloj3.tipo = "Smartwatch"; reloj3.ajustar();
        Reloj26 reloj4 = new Reloj26(); reloj4.marca = "Seiko"; reloj4.color = "Azul"; reloj4.tipo = "Automatico"; reloj4.poner();
        Reloj26 reloj5 = new Reloj26(); reloj5.marca = "Citizen"; reloj5.color = "Negro"; reloj5.tipo = "Solar"; reloj5.mirarHora();
        
        System.out.println("Clase 27: Termo de agua");
        Termo27 termo1 = new Termo27(); termo1.color = "Rojo"; termo1.material = "Acero"; termo1.llenar();
        Termo27 termo2 = new Termo27(); termo2.color = "Azul"; termo2.material = "Plastico"; termo2.beber();
        Termo27 termo3 = new Termo27(); termo3.color = "Negro"; termo3.material = "Aluminio"; termo3.limpiar();
        Termo27 termo4 = new Termo27(); termo4.color = "Verde"; termo4.material = "Acero"; termo4.llenar();
        Termo27 termo5 = new Termo27(); termo5.color = "Amarillo"; termo5.material = "Plastico"; termo5.beber();

        System.out.println("Clase 28: Manilla");
        Manillas28 manilla1 = new Manillas28(); manilla1.color = "Rojo"; manilla1.material = "Cuero"; manilla1.poner();
        Manillas28 manilla2 = new Manillas28(); manilla2.color = "Azul"; manilla2.material = "Plastico"; manilla2.quitar();
        Manillas28 manilla3 = new Manillas28(); manilla3.color = "Negro"; manilla3.material = "Metal"; manilla3.ajustar();
        Manillas28 manilla4 = new Manillas28(); manilla4.color = "Verde"; manilla4.material = "Cuero"; manilla4.poner();
        Manillas28 manilla5 = new Manillas28(); manilla5.color = "Amarillo"; manilla5.material = "Plastico"; manilla5.quitar();
        
        System.out.println("Clase 29: Block");
        Block29 block1 = new Block29(); block1.tamaño = "Oficio"; block1.color = "Blanco"; block1.hojas = 100; block1.escribir();
        Block29 block2 = new Block29(); block2.tamaño = "Oficio"; block2.color = "Blanco cafe clarito"; block2.hojas = 50; block2.guardar();
        Block29 block3 = new Block29(); block3.tamaño = "Carta"; block3.color = "gris"; block3.hojas = 80; block3.escribir();
        Block29 block4 = new Block29(); block4.tamaño = "Carta"; block4.color = "Rosado"; block4.hojas = 120; block4.guardar();
        Block29 block5 = new Block29(); block5.tamaño = "Oficio"; block5.color = "Azul clarito"; block5.hojas = 40; block5.escribir();
    
        System.out.println("Clase 30: Corrector");
        Bolso30 bolso1 = new Bolso30(); bolso1.color = "Negro"; bolso1.material = "Cuero"; bolso1.tamaño = 25.5; bolso1.abrir();
        Bolso30 bolso2 = new Bolso30(); bolso2.color = "Rojo"; bolso2.material = "Sintético"; bolso2.tamaño = 30.0; bolso2.guardarObjetos();
        Bolso30 bolso3 = new Bolso30(); bolso3.color = "Azul"; bolso3.material = "Nailon"; bolso3.tamaño = 28.7; bolso3.abrir();
        Bolso30 bolso4 = new Bolso30(); bolso4.color = "Verde"; bolso4.material = "Cuero"; bolso4.tamaño = 22.0; bolso4.guardarObjetos();
        Bolso30 bolso5 = new Bolso30(); bolso5.color = "Amarillo"; bolso5.material = "Sintético"; bolso5.tamaño = 26.3; bolso5.abrir();
    }
}
