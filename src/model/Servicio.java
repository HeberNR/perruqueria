package model;

public class Servicio {
  private int id;
  private String tipoServicio;
  private String descripcion;
  private int duracion; //en minutos
  private int precio;

  //constructor servicio

  public Servicio (int id, String tipoServicio, String descripcion,
                   int duracion, int precio) {
    id++;
    this.id = id;
    this.descripcion = descripcion;
    this.tipoServicio = tipoServicio;
    this.duracion = duracion;
    this.precio = precio;
  }

  public int getId() {
    return id;
  }

  public String getTipoServicio() {
    return tipoServicio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getDuracion() {
    return duracion;
  }

  public int getPrecio() {
    return precio;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTipoServicio(String tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Servicio{" +
        "id=" + id +
        ", tipoServicio='" + tipoServicio + '\'' +
        ", descripcion='" + descripcion + '\'' +
        ", duracion=" + duracion +
        ", precio=" + precio +
        '}';
  }

  public String mostrarDatos() {
    return "ID: " + id + "\n"
        + "Tipo de servicio: " + tipoServicio + "\n"
        + "Descripcion: " + descripcion + "\n"
        + "Duracion: " + duracion + "\n"
        + "Precio: " + precio;
  }
}
