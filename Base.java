/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Laboratorio #4
Eliazar Canastuj
carnet: 23384
*/
import java.util.*;
import java.io.*;


public class Base implements Paquete{
    Scanner teclado = new Scanner(System.in);
    Random numaleatorio = new Random();
    

    private String usuario;
    private String contrasena;

    private String fecha;
    private String vuelta;
    private int boletos;
    private String aerolinea;

    private String tarjeta;
    private int cuotas;
    private String clase;

    private int asiento = numaleatorio.nextInt(40);
    private int maletas = 1;

    private int opt;


    public Base(String usuario, String contrasena){
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    /*a. Definir fecha de viaje.
b. Definir si es ida y vuelta o solo ida.
c. Definir cantidad de boletos.
d. Definir aerolínea*/

    @Override
    public void reservaViaje() {
        System.out.println("En que fecha es su viaje? dia/mes/año");
        this.fecha = teclado.nextLine();
        System.out.println("Su viaje es ida y vuelta o solo ida?");
        this.vuelta = teclado.nextLine();
        System.out.println("Ingrese la cantidad de boletos: ");
        this.boletos = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la aerolinea: ");
        this.aerolinea = teclado.nextLine();

        System.out.println("------------------------------");
        System.out.println("Usuario: "+this.usuario);
        System.out.println("Fecha de vuelo: "+this.fecha);
        System.out.println("Tipo de vuelo: "+this.vuelta);
        System.out.println("Cantidad de boletos: "+this.boletos);
        System.out.println("Aerolinea: "+this.aerolinea);
        System.out.println("------------------------------");
    }

/*Definir número de tarjeta.
b. Definir cantidad de cuotas (1 = un solo pago, hasta 24 cuotas). (No premium)
c. Definir clase para vuelo (Coach o Primera Clase) (No premium)*/
    @Override
    public void confirmacionPago() {
        System.out.println("Ingrese su numero de tarjeta");
        this.tarjeta = teclado.nextLine();
        System.out.println("Ingrese la cantidad de cuotas (1 = un solo pago, hasta 24 cuotas)");
        this.cuotas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese la clase de su vuelo (Coach o Primera Clase)");
        this.clase = teclado.nextLine();

    }

    @Override
    public int seleccionAsiento() {
        return this.asiento;
    }

    @Override
    public int cantidadMaletas() {
        return this.asiento;
    }


/*a. Modificar el tipo de cliente. (No premium)
b. Aplicar cupón de 10% de descuento. (No premium).
c. Cambiar contraseña.
*/
    @Override
    public void modificarPerfil() {
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Modificar el tipo de cliente");
        System.out.println("2. Aplicar cupón de 10% de descuento");
        System.out.println("3. Cambiar contraseña");

        this.opt = teclado.nextInt();
        teclado.nextLine();
        switch(opt){
            case 1:
                System.out.println("Ahora es un cliente vip");
                break;

            case 2:
                System.out.println("Se aplico un 10% de descuento");
                break;

            case 3:
                System.out.println("Ingrese su contraseña actual:");
                String contra = teclado.nextLine();
                if(contra == this.contrasena){
                    System.out.println("Ingrese la nueva contraseña:");
                    this.contrasena = teclado.nextLine();
                }else{
                    System.out.println("contraseña incorrecta");
                }
                break;
            default:
                System.out.println("Esa opcion no existe");

        }
    }

    public String getNombre(){
        return "Base"+";"+this.usuario+";"+this.contrasena+";"+this.fecha+";"+this.vuelta+";"+this.boletos+";"+this.aerolinea+";"+this.tarjeta+";"+this.cuotas+";"+this.clase+";"+"1"+";"+"1";
    }

}