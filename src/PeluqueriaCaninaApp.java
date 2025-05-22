import model.*;


public class PeluqueriaCaninaApp {

  public static void main(String[] args) {
    // Crear mascotas
    Mascota mascota1 = new Mascota("Varian", "Naranja", EspecieMascota.GATO, 2, "Heber");
    Mascota mascota2 = new Mascota("Oliver", "Cruza calle con vereda", EspecieMascota.PERRO, 1, "Lourdes");
    Mascota mascota3 = new Mascota("Lobo", "Labrador", EspecieMascota.PERRO, 3, "Lourdes");

    // Crear servicios
    Servicio servicio1 = new Servicio(TipoServicio.DESPARASITACION, "Desparasitación de pulgas y garrapatas", 30, 5000);
    Servicio servicio2 = new Servicio(TipoServicio.BAÑO, "Baño y corte de pelo", 60, 10000);
    Servicio servicio3 = new Servicio(TipoServicio.PELUQUERIA, "Corte de pelo y peinado", 45, 8000);

    // Crear turno
    Turno turno1 = new Turno("2025-05-20", "09:00", EstadoServicio.REALIZADO, mascota3, servicio3);
    Turno turno2 = new Turno("2025-05-21", "10:00", EstadoServicio.PROGRAMADO, mascota1, servicio1);
    Turno turno3 = new Turno("2025-05-22", "10:30", EstadoServicio.PROGRAMADO, mascota2, servicio2);

    // Mostrar datos de las mascotas
    System.out.println(turno1.mostrarDatos());
    System.out.println("-------------------------");
    System.out.println(turno2.mostrarDatos());
    System.out.println("-------------------------");
    System.out.println(turno3.mostrarDatos());
  }
}
