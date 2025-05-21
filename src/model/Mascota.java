package model;

public class Mascota {

  private int id;
  private String nombre;
  private String raza;
  private String especie;
  private String edad;
  private String nombreDuenio;


  //constructor de mascota
  public Mascota(int id, String nombre, String raza,
                  String especie, String edad, String nombreDuenio) {

    id++;
    this.id = id;
    this.nombre = nombre;
    this.raza = raza;
    this.especie = especie;
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

  public String getEspecie() {
    return this.especie;
  }

  public String getEdad() {
    return this.edad;
  }

  public String getNombreDuenio() {
    return this.nombreDuenio;
  }

  // setters
  public void setId (int id) {
    this.id = id;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
  }

  public void setEdad(String edad) {
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
        ", especie='" + especie + '\'' +
        ", edad='" + edad + '\'' +
        ", nombreDuenio='" + nombreDuenio + '\'' +
        '}';
  }

  public String mostrarDatos() {
    return "ID: " + id + "\n"
        + "Nombre: " + nombre + "\n"
        + "Especie: " + especie + "\n"
        + "Edad: " + edad + "\n"
        + "Raza: " + raza + "\n"
        + "Nombre del dueño: " + nombreDuenio;
  }
}
