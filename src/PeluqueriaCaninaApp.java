import java.util.Scanner;

import data.DatosPrecargados;
import model.*;


public class PeluqueriaCaninaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Mascota[] mascotas = DatosPrecargados.obtenerMascotas();
    Turno[] turnos = DatosPrecargados.obtenerTurnos();
    Servicio[] servicios = DatosPrecargados.obtenerServicios();


    System.out.println("Bienvenido a la Perruqueria");
    for (int i = 0; i < mascotas.length; i++) {
      System.out.println(mascotas[i].mostrarDatos());
      System.out.println(turnos[i].mostrarDatos());
      System.out.println(servicios[i].mostrarDatos());
    }
  }
}
