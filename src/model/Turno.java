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
  public Turno(String fecha, String hora, EstadoServicio estado, Mascota mascota, Servicio servicio) {
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
    return "Turno{" +
        "id=" + id +
        ", fecha='" + fecha + '\'' +
        ", hora='" + hora + '\'' +
        ", estado='" + estado + '\'' +
        ", mascota=" + mascota +
        ", servicio=" + servicio +
        '}';
  }

  public String mostrarDatos() {
    return "Turno N°: " + id + "\n"
        + "Fecha: " + fecha + " a las " + hora + "\n"
        + "Estado: " + estado + "\n"
        + "Mascota: " + mascota.getNombre() + " (" + mascota.getEspecie() + ")\n"
        + "Nombre del dueño/a: " + mascota.getNombreDuenio() + "\n"
        + "Servicio: " + servicio.getTipoServicio() + " - " + servicio.getDescripcion() + "\n"
        + "Precio: $" + servicio.getPrecio() + "\n"
        + "-------------------------------------\n";
  }

  public boolean esTurnoActivo() {
    return estado == EstadoServicio.PROGRAMADO;
  }

  public static void maxTurnos(Turno[] turnos) {
    if (turnos.length > MAX_TURNOS_DIARIOS) {
      System.out.println("No se pueden agregar más turnos hoy.");
    }

  }


}
