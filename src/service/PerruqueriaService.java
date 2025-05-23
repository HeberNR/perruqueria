package service;

import model.EspecieMascota;
import model.Mascota;

import java.util.Scanner;

public class PerruqueriaService {

  public static void agregarMascota(String[] mascotas, Scanner sc) {
    // Implementar la lógica para agregar una mascota
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
    } while(mascotas.length < 5 );
  }
  public static void buscarMascotaPorNombre(String[] mascotas, Scanner sc) {
    System.out.println("Ingrese el nombre de la mascota a buscar: ");
    String nombreMascota = sc.nextLine();
    boolean encontrado = false;
    for (String mascota : mascotas) {
      if (mascota.equalsIgnoreCase(nombreMascota)) {
        System.out.println("Mascota encontrada: " + mascota);
        encontrado = true;
        break;
      }
    }
    if (!encontrado) {
      System.out.println("Mascota no encontrada.");
    }
  }

  public static void contarMascotasPorEspecie(Mascota[] mascotas) {
    int contadorPerros = 0;
    int contadorGatos = 0;
    int contadorVacas = 0;

    for (int i = 0; i < mascotas.length; i++) {
      if (mascotas[i] != null && mascotas[i].getEspecie() == EspecieMascota.PERRO){
        contadorPerros++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == EspecieMascota.GATO) {
        contadorGatos++;
      } else if (mascotas[i] != null && mascotas[i].getEspecie() == EspecieMascota.VACA) {
        contadorVacas++;
      }
    }
  }

}
