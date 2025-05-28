package model;

public class Servicio {

  private static int contador = 0;
  private int id;
  private TipoServicio tipoServicio;
  private String descripcion;
  private int duracion; //en minutos
  private int precio;

  //constructor servicio

  public Servicio(TipoServicio tipoServicio, String descripcion,
                  int duracion, int precio) {

    this.id = ++contador;
    this.descripcion = descripcion;
    this.tipoServicio = tipoServicio;
    this.duracion = duracion;
    this.precio = precio;
  }

  public int getId() {
    return id;
  }

  public TipoServicio getTipoServicio() {
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

  public void setTipoServicio(TipoServicio tipoServicio) {
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
    return "Servicio{"
        + "id=" + id
        + ", tipoServicio='" + tipoServicio + '\''
        + ", descripcion='" + descripcion + '\''
        + ", duracion=" + duracion +
        ", precio=" + precio
        + '}';
  }

  public String mostrarDatos() {
    return "Tipo de servicio: " + tipoServicio + "\n"
        + "Descripcion: " + descripcion + "\n"
        + "Duracion: " + duracion + " min" + "\n"
        + "Es servicio largo? " + esServicioLargo(duracion) + "\n"
        + "Precio (con IVA incluido): " + calcularPrecioConIVA(precio) + "\n"
        + "-----------------------------------------------\n";
  }

  public static boolean esServicioLargo(int duracion) {
    return (duracion > 60);
  }

  public static double calcularPrecioConIVA(double precioBase) {
    final double IVA = 0.21;
    return precioBase * (1 + IVA);
  }
}

