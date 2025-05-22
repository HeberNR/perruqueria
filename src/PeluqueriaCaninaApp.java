import model.*;

import java.util.Scanner;

public class PeluqueriaCaninaApp {

  public static void main(String[] args) {
   String[] mascotas = new String[2];
   String[] turnos = new String[10];
   Scanner sc = new Scanner(System.in);

   /* public Mascota(String nombre, String raza,
                 EspecieMascota especieMascota, int edad, String nombreDuenio) */

   do {
     EspecieMascota especie = null;
     for (int i = 0; i < mascotas.length; i++){
       System.out.println("Ingrese el nombre de la mascota: ");
       String nombreAnimal = sc.nextLine();
       System.out.println("Ingrese la raza de la mascota: ");
       String razaAnimal = sc.nextLine();
       System.out.println("Ingrese la especie de la mascota: ");
       String especieAnimal = sc.nextLine();
       if (especieAnimal.equalsIgnoreCase("perro")) {
         especie = EspecieMascota.PERRO;
       } else if (especieAnimal.equalsIgnoreCase("gato")) {
         especie = EspecieMascota.GATO;
       } else {
         especie = EspecieMascota.VACA;
       }
       System.out.println("Ingrese la edad del animal: ");
       int edadAnimal = sc.nextInt();
       sc.nextLine();
       System.out.println("Ingrese el nombre del dueño de la mascota: ");
       String duenioMascota = sc.nextLine();

       Mascota mascota = new Mascota(nombreAnimal, razaAnimal, especie , edadAnimal, duenioMascota);
       System.out.println(mascota.mostrarDatos());
     }
   } while(mascotas.length < 2 );


  }
}
