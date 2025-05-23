import model.*;

import java.util.Scanner;

import static service.PerruqueriaService.agregarMascota;

public class PeluqueriaCaninaApp {

  public static void main(String[] args) {
    Mascota[] mascotas = new Mascota[5];
    Turno[] turnos = new Turno[10];
    Scanner sc = new Scanner(System.in);

    // Crear un objeto de la clase Mascota
    mascotas[0] = new Mascota("Laura", "Holstein",
        EspecieMascota.VACA, 2, "Pedro Martinez");
    mascotas[1] = new Mascota("Firulais", "Labrador",
        EspecieMascota.PERRO, 5, "Juan Perez");
    mascotas[2] = new Mascota("Varian", "Naranjoso",
        EspecieMascota.GATO, 1, "Heber Ramirez");
    mascotas[3] = new Mascota("Bobby", "Bulldog",
        EspecieMascota.PERRO, 4, "Carlos Garcia");
    mascotas[4] = new Mascota("Pascualito", "Siames",
        EspecieMascota.GATO, 2, "Ana Torres");

    // Crear un objeto de la clase Turno
    turnos[0] = new Turno("2023-10-01", "10:00", EstadoServicio.PROGRAMADO,
        mascotas[0], new Servicio(TipoServicio.BAÑO, "Baño completo", 30, 500));
    turnos[1] = new Turno("2023-10-02", "11:00", EstadoServicio.PROGRAMADO,
        mascotas[1], new Servicio(TipoServicio.PELUQUERIA, "Corte de pelo", 45, 800));
    turnos[2] = new Turno("2023-10-03", "12:00", EstadoServicio.PROGRAMADO,
        mascotas[2], new Servicio(TipoServicio.BAÑO, "Baño y corte", 60, 1000));
    turnos[3] = new Turno("2023-10-04", "13:00", EstadoServicio.PROGRAMADO,
        mascotas[3], new Servicio(TipoServicio.DESPARASITACION, "Corte de uñas", 15, 200));
    turnos[4] = new Turno("2023-10-05", "14:00", EstadoServicio.PROGRAMADO,
        mascotas[4], new Servicio(TipoServicio.BAÑO, "Baño y secado", 30, 600));
    turnos[5] = new Turno("2023-10-06", "15:00", EstadoServicio.PROGRAMADO,
        mascotas[0], new Servicio(TipoServicio.BAÑO, "Corte de pelo", 45, 800));
    turnos[6] = new Turno("2023-10-07", "16:00", EstadoServicio.PROGRAMADO,
        mascotas[1], new Servicio(TipoServicio.PELUQUERIA, "Baño completo", 30, 500));
    turnos[7] = new Turno("2023-10-08", "17:00", EstadoServicio.PROGRAMADO,
        mascotas[2], new Servicio(TipoServicio.DESPARASITACION, "Corte de uñas", 15, 200));
    turnos[8] = new Turno("2023-10-09", "18:00", EstadoServicio.PROGRAMADO,
        mascotas[3], new Servicio(TipoServicio.BAÑO, "Baño y corte", 60, 1000));
    turnos[9] = new Turno("2023-10-10", "19:00", EstadoServicio.PROGRAMADO,
        mascotas[4], new Servicio(TipoServicio.PELUQUERIA, "Baño y secado", 30, 600));

    System.out.println("Bienvenido a la Perruqueria");
    for (int i = 0; i < mascotas.length; i++) {
      System.out.println(mascotas[i].mostrarDatos());
      System.out.println(turnos[i].mostrarDatos());
    }


    //agregarMascota(mascotas, sc);
  }
}
