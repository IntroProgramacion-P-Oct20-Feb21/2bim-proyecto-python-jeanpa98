/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.util.Scanner;

/**
 *
 * @author JEanpa
 */
public class Proyecto_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String opcion2;
        int contadorCuentas = 1;
        boolean bandera = true;

        do {
            System.out.println("________ Menú de opciones______________");
            System.out.println("*Ingrese 1 para crear una cuenta en Facebook\n"
                    + "*Ingrese 2 para crear una cuenta de Twitter\n"
                    + "*Ingrese 3 para crear una cuenta en Whatsapp\n"
                    + "*Ingrese 4 para crear una cuenta en Telegram\n"
                    + "*Ingrese 5 para crear una cuenta en Signal\n"
                    + "*Ingrese 6 para crear una cuenta en Instagram\n"
                    + "*Ingrese 7 para crear una cuenta en Flickr: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println(crearFacebook());
                    break;
                case 2:
                    crearTwitter();
                    break;
                case 3:
                    System.out.println(crearWhatsapp());
                    break;
                case 4:
                    crearTelegram();
                    break;                
                case 5:
                    System.out.println(crearSignal());
                    break;
                case 6:
                    crearInstagram();
                    break;
                case 7:
                    System.out.println(crearFlickr());
                    break;
                default:
                    System.out.println("Existe un error, el valor no se encuentra "
                            + "en los parametros establecidos");
                           
                    contadorCuentas = contadorCuentas + 1;
                    break;
            }
            System.out.println("Escriba SI para crear mas cuentas\n"
                    + "Escriba NO para dejar de crear mas cuentas: ");
            opcion2 = entrada.nextLine();
            opcion2 = opcion2.toUpperCase();
            if (opcion2.equals("NO")) {
                bandera = false;
               System.out.printf("________Resultado de Campaña________\n%s\n"
                , obtenerMensaje(contadorCuentas));
            } 
            else {
                contadorCuentas = contadorCuentas + 1;
            }
        } while (bandera);
    }

    public static String crearFacebook() {
      
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String correoUsuario;
        String cadena;
        System.out.println("Usted escogió la opción crear cuenta en Facebook"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        cadena = String.format("Resumen de cuenta creada en Facebook\n"
                + "Nombre del usuario: %s\n"
                + "Edad del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, edadUsuario, ciudadUsuario, paisUsuario,
                correoUsuario);
        return cadena;
    }

    public static void crearTwitter() {
     
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String nombres;
        String apellidos;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String idiomaUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Twitter\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar los nombres completos del Usuario: ");
        nombres = entrada.nextLine();
        System.out.println("Ingresar los apellidos completos del Usuario: ");
        apellidos = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el idioma que habla el Usuario: ");
        idiomaUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Twitter\n"
                + "Nombre del Usuario: %s\n"
                + "Nombres completos del Usuario: %s"
                + "Apellidos completos de usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Idioma del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, nombres, apellidos, edadUsuario,
                ciudadUsuario, paisUsuario, idiomaUsuario, correoUsuario);
    }

    public static String crearWhatsapp() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        int edadUsuario;
        String ciudadUsuario;
        String paisUsuario;
        String cadena;
        System.out.println("Usted escogió la opción crear cuenta en Whatsapp"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        cadena = String.format("Resumen de cuenta creada en Whatsapp\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n",
                nombreUsuario, numeroTelefono, edadUsuario, ciudadUsuario,
                paisUsuario);
        return cadena;
    }

    public static void crearTelegram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        String ciudadUsuario;
        String paisUsuario;
        String areaInteres;
        System.out.println("Usted escogió la opción crear cuenta en Telegram"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el área de interés del Usuario: ");
        areaInteres = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Telegram\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Área de interés del usuario: %s\n",
                nombreUsuario, numeroTelefono, ciudadUsuario, paisUsuario,
                areaInteres);
    }

    public static String crearSignal() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String numeroTelefono;
        String ciudadUsuario;
        String paisUsuario;
        String hobbyPri;
        String cadena;
        System.out.println("Usted escogió la opción crear cuenta en Signal\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar el número de teléfono del Usuario: ");
        numeroTelefono = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar el país donde se ubica el Usuario: ");
        paisUsuario = entrada.nextLine();
        System.out.println("Ingresar el hobby principal: ");
        hobbyPri = entrada.nextLine();
        cadena = String.format("Resumen de cuenta creada en Signal\n"
                + "Nombre del usuario: %s\n"
                + "Número del teléfono del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "País del usuario: %s\n"
                + "Hobby principal del usuario: %s\n",
                nombreUsuario, numeroTelefono, ciudadUsuario, paisUsuario,
                hobbyPri);
        return cadena;
    }

    public static void crearInstagram() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String ciudadUsuario;
        int edadUsuario;
        String correoUsuario;
        System.out.println("Usted escogió la opción crear cuenta en Instagram"
                + "\nIngresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar la ciudad donde se ubica el Usuario: ");
        ciudadUsuario = entrada.nextLine();
        System.out.println("Ingresar la edad del Usuario: ");
        edadUsuario = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        System.out.printf("Resumen de cuenta creada en Instagram\n"
                + "Nombre del usuario: %s\n"
                + "Ciudad del usuario: %s\n"
                + "Edad del usuario: %d\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, ciudadUsuario, edadUsuario, correoUsuario);
    }

    public static String crearFlickr() {
        Scanner entrada = new Scanner(System.in);
        String nombreUsuario;
        String correoUsuario;
        String cadena;
        System.out.println("Usted escogió la opción crear cuenta en Flickr\n"
                + "Ingresar el nombre de Usuario: ");
        nombreUsuario = entrada.nextLine();
        System.out.println("Ingresar correo del Usuario: ");
        correoUsuario = entrada.nextLine();
        cadena = String.format("Resumen de cuenta creada en Flickr\n"
                + "Nombre del usuario: %s\n"
                + "Correo del usuario: %s\n",
                nombreUsuario, correoUsuario);
        return cadena;
    }

    public static String obtenerMensaje(int contadorCuentas) {
        String cadena = "";
        String[] mensajeFinal = {"Campaña con poca afluencia",
            "Campaña moderada siga adelante", "Excelente campaña"};
        if ((contadorCuentas >= 1) && (contadorCuentas <= 5)) {
            cadena = mensajeFinal[0];
        } else {
            if ((contadorCuentas >= 6) && (contadorCuentas <= 15)) {
                cadena = mensajeFinal[1];
            } else {
                if (contadorCuentas >= 16) {
                    cadena = mensajeFinal[2];
                }
            }
        }
        return cadena;
    }
    
}
    
   

