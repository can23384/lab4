/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #6
Eliazar Canastuj
carnet: 23384
*/


import java.util.*;
import java.io.*;


public class main{

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese nombre de usuario:");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese una contraseña:");
        String contrasena = teclado.nextLine();

        Base user = new Base(nombre, contrasena);



        boolean hola = true;
        while(hola){
            System.out.println("Seleccione un modo: ");
            System.out.println("1. Modo reservas");
            System.out.println("2. Modo confirmacion");
            System.out.println("3. Modo perfil");
            System.out.println("4. Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch(opcion){
                case 1:
                    user.reservaViaje();
                    break;
                case 2:
                    user.confirmacionPago();
                    break;
                case 3:
                    user.modificarPerfil();
                    break;
                case 4:
                    //guardar en el .csv
                    String nombreArchivo = "vuelos.csv";
                    String encabezado = "tipo;contrasena;fecha de vuelo;vuelta; cantidad de boletos;aerolinea;tarjeta;cuotas;clase de vuelo;cantidad de asientos; cantidad de maletas";

                    try{
                        FileWriter escritor = new FileWriter(nombreArchivo, false);
                        escritor.write(encabezado + "\n");

                        escritor.write(user.getNombre() + "\n");
    
                        escritor.close();

                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                    //YA SE GUARDO EL ARCHIVO
                    hola = false;                    
                    user.getNombre();
                    break;
            }
        }

    }
}