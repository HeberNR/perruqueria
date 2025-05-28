import model.*;

import static model.Turno.agruparPorEstado;

public class PeluqueriaCaninaApp {
  public static void main(String[] args) {
    Mascota[] mascotas = DatosPrecargados.mascotas;
    Turno[] turnos = DatosPrecargados.turnos;
    Servicio[] servicios = DatosPrecargados.servicios;

    // Buscar mascota por nombre
    String nombreBuscado = "Luna"; // cambiar por scanner
    boolean encontrada = false;
    for (Mascota m : mascotas) {
      if (m.getNombre().equalsIgnoreCase(nombreBuscado)) {
        System.out.println("Mascota encontrada: " + m);
        encontrada = true;
      }
    }
    if (!encontrada) {
      System.out.println("Mascota no encontrada.");
    }

    // Contar mascotas por especie
    EspecieMascota especieBuscada = EspecieMascota.GATO; // cambiar por scanner
    int contador = 0;
    for (Mascota m : mascotas) {
      if (m.getEspecie() == especieBuscada) {
        contador++;
      }
    }
    System.out.println("Cantidad de mascotas de especie " + especieBuscada + ": " + contador);

    // Mostrar si los servicios son largos
    for (Servicio s : servicios) {
      System.out.println("Servicio: " + s.getDescripcion() + " - Largo: " + s.esServicioLargo());
    }

    // Mostrar si el turno está activo
    for (Turno t : turnos) {
      System.out.println(t.mostrarDatos());
    }


    // Contar cantidad de turnos por estado
    agruparPorEstado(turnos);

    // Validar cantidad de turnos por día
    for (int i = 0; i < turnos.length; i++) {
      int conteo = 0;
      String fechaActual = turnos[i].getFecha();
      for (int j = 0; j < turnos.length; j++) {
        if (turnos[j].getFecha().equals(fechaActual)) {
          conteo++;
        }
      }
      if (conteo > Turno.MAX_TURNOS_DIARIOS) {
        System.out.println("¡Exceso de turnos el " + fechaActual + ": " + conteo + " turnos!");
      }
    }
  }
}
