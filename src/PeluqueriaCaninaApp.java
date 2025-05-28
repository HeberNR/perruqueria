import data.DatosPrecargados;
import model.*;
import static model.Turno.puedeCrearTurno;

public class PeluqueriaCaninaApp {

  public static void main(String[] args) {

    Mascota[] mascotas = DatosPrecargados.obtenerMascotas();
    Turno[] turnos = DatosPrecargados.obtenerTurnos();
    Servicio[] servicios = DatosPrecargados.obtenerServicios();

    System.out.println("Bienvenido a la Perruqueria");
    for (int i = 0; i < mascotas.length; i++) {
      System.out.println(mascotas[i].mostrarDatos());
      System.out.println(turnos[i].mostrarDatos());
      System.out.println(servicios[i].mostrarDatos());
    }


    if (puedeCrearTurno("2025-06-03", turnos)) {
      System.out.println("Se puede crear un nuevo turno para el día 2025-06-03");
    } else {
      System.out.println("No se puede crear un nuevo turno para el día 2025-06-03, ya que se ha alcanzado el máximo de turnos diarios.");
    }

    Turno.agruparPorEstado(turnos);

  }
}
