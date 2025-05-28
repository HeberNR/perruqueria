package model;

public class Turno {

  private static int contador = 0;
  private int id;
  private String fecha;
  private String hora;
  private EstadoServicio estado;
  private Mascota mascota;
  private Servicio servicio;
  public static final int MAX_TURNOS_DIARIOS = 10;


  //constructor de turno
  public Turno(String fecha, String hora, EstadoServicio estado,
               Mascota mascota, Servicio servicio) {
    this.id = ++contador;
    this.fecha = fecha;
    this.hora = hora;
    this.estado = estado;
    this.mascota = mascota;
    this.servicio = servicio;
  }

  // getters and setters

  public int getId() {
    return id;
  }

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public EstadoServicio getEstado() {
    return estado;
  }

  public void setEstado(EstadoServicio estado) {
    this.estado = estado;
  }

  public Mascota getMascota() {
    return mascota;
  }

  public void setMascota(Mascota mascota) {
    this.mascota = mascota;
  }

  public Servicio getServicio() {
    return servicio;
  }

  public void setServicio(Servicio servicio) {
    this.servicio = servicio;
  }

  @Override
  public String toString() {
    return "Turno{"
        + "id=" + id
        + ", fecha='" + fecha + '\''
        + ", hora='" + hora + '\''
        + ", estado='" + estado + '\''
        + ", mascota=" + mascota
        + ", servicio=" + servicio
        + '}';
  }

  public String mostrarDatos() {
    String datos = "────────────────────────────────────────────\n";
    datos += "📋 Turno N°: " + id + "\n";
    datos += "📅 Fecha: " + fecha + " a las " + hora + "\n";
    datos += "📌 Estado: " + estado + " (Activo: " + (esTurnoActivo() ? "Sí" : "No") + ")\n";
    datos += "🐾 Mascota: " + mascota.getNombre() + " (" + mascota.getEspecie() + ")\n";
    datos += "👤 Dueño/a: " + mascota.getNombreDuenio() + "\n";
    datos += "🧼 Servicio: " + servicio.getTipoServicio() + " - " + servicio.getDescripcion() + "\n";
    datos += "⏱️ Duración: " + servicio.getDuracion() + " minutos (" + (servicio.esServicioLargo() ? "Largo" : "Corto") + ")\n";
    datos += "💲 Precio: $" + servicio.getPrecio() + "\n";
    datos += "💲 IVA incluido: $" + servicio.calcularPrecioConIVA(servicio.getPrecio()) + "\n";
    datos += "────────────────────────────────────────────\n";

    return datos;
  }



  public boolean esTurnoActivo() {
    return this.estado == EstadoServicio.PROGRAMADO;
  }

    public static boolean puedeCrearTurno(String fecha, Turno[] turnos) {
    int contadorTurnos = 0;
    for (Turno turno : turnos) {
      if (turno != null && turno.getFecha().equals(fecha)) {
        contadorTurnos++;
      }
    }
    return contadorTurnos < MAX_TURNOS_DIARIOS;
  }

  public static void agruparPorEstado(Turno[] turnos) {
    int programados = 0;
    int realizados = 0;
    int cancelados = 0;

    for (Turno turno : turnos) {
      if (turno != null) {
        switch (turno.getEstado()) {
          case PROGRAMADO:
            programados++;
            break;
          case REALIZADO:
            realizados++;
            break;
          case CANCELADO:
            cancelados++;
            break;
        }
      }
    }
    System.out.println("Resumen de turnos por estado:");
    System.out.println("Programados: " + programados);
    System.out.println("Realizados: " + realizados);
    System.out.println("Cancelados: " + cancelados);
  }
}