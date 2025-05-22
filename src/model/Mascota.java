package model;

public class Mascota {

  private static int contador = 0;
  private int id;
  private String nombre;
  private String raza;
  private EspecieMascota especieMascota;
  private int edad;
  private String nombreDuenio;


  //constructor de mascota
  public Mascota(String nombre, String raza,
                 EspecieMascota especieMascota, int edad, String nombreDuenio) {

    this.id = ++contador;
    this.nombre = nombre;
    this.raza = raza;
    this.especieMascota = especieMascota;
    this.edad = edad;
    this.nombreDuenio = nombreDuenio;
  }

  // getters
  public String getNombre() {
    return this.nombre;
  }

  public int getId() {
    return this.id;
  }

  public String getRaza() {
    return this.raza;
  }

  public EspecieMascota getEspecie() {
    return this.especieMascota;
  }

  public int getEdad() {
    return this.edad;
  }

  public String getNombreDuenio() {
    return this.nombreDuenio;
  }

  // setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setEspecie(EspecieMascota especieMascota) {
    this.especieMascota = especieMascota;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNombreDuenio(String nombreDuenio) {
    this.nombreDuenio = nombreDuenio;
  }

  //métodos
  @Override
  public String toString() {
    return "Mascota{" +
        "id=" + id +
        ", nombre='" + nombre + '\'' +
        ", raza='" + raza + '\'' +
        ", especie='" + especieMascota + '\'' +
        ", edad='" + edad + '\'' +
        ", nombreDuenio='" + nombreDuenio + '\'' +
        '}';
  }

  public String mostrarDatos() {
    return "ID: " + id + "\n"
        + "Nombre: " + nombre + "\n"
        + "Especie: " + especieMascota + "\n"
        + "Edad: " + edad + "\n"
        + "Raza: " + raza + "\n"
        + "Nombre del dueño: " + nombreDuenio;
  }
}
