import model.*;

import static model.Turno.agruparPorEstado;

public class PeluqueriaCaninaApp {
  public static void main(String[] args) {
    Mascota[] mascotas = DatosPrecargados.mascotas;
    Turno[] turnos = DatosPrecargados.turnos;
    Servicio[] servicios = DatosPrecargados.servicios;

    buscarMascotaPorNombre(mascotas, "Luna");
    contarMascotasPorEspecie(mascotas, EspecieMascota.GATO);
    mostrarServiciosLargos(servicios);
    mostrarTurnos(turnos);
    agruparPorEstado(turnos);
    validarTurnosPorDia(turnos);
  }

  private static void buscarMascotaPorNombre(Mascota[] mascotas, String nombreBuscado) {
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
  }

  private static void contarMascotasPorEspecie(Mascota[] mascotas, EspecieMascota especie) {
    int contador = 0;
    for (Mascota m : mascotas) {
      if (m.getEspecie() == especie) {
        contador++;
      }
    }
    System.out.println("Cantidad de mascotas de especie " + especie + ": " + contador);
  }

  private static void mostrarServiciosLargos(Servicio[] servicios) {
    for (Servicio s : servicios) {
      System.out.println("Servicio: " + s.getDescripcion() + " - Largo: " + s.esServicioLargo());
    }
  }

  private static void mostrarTurnos(Turno[] turnos) {
    for (Turno t : turnos) {
      System.out.println(t.mostrarDatos());
    }
  }

  private static void validarTurnosPorDia(Turno[] turnos) {
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
