package model;

public class DatosPrecargados {

  public static Mascota[] mascotas = {
      new Mascota("Laura", "Holstein",
          EspecieMascota.VACA, 2, "Pedro Martinez"),
      new Mascota("Firulais", "Labrador",
          EspecieMascota.PERRO, 5, "Juan Perez"),
      new Mascota("Varian", "Naranjoso",
          EspecieMascota.GATO, 1, "Heber Ramirez"),
      new Mascota("Bobby", "Bulldog",
          EspecieMascota.PERRO, 4, "Carlos Garcia"),
      new Mascota("Pascualito", "Siames",
          EspecieMascota.GATO, 2, "Ana Torres")
  };

  public static Turno[] turnos = {
      new Turno("2025-06-01", "10:00", EstadoServicio.REALIZADO,
          mascotas[0], new Servicio(TipoServicio.BAÑO, "Baño completo", 90, 500)),
      new Turno("2025-06-01", "11:00", EstadoServicio.CANCELADO,
          mascotas[1], new Servicio(TipoServicio.PELUQUERIA, "Corte de pelo", 45, 800)),
      new Turno("2025-06-01", "12:00", EstadoServicio.REALIZADO,
          mascotas[2], new Servicio(TipoServicio.BAÑO, "Baño y corte", 60, 1000)),
      new Turno("2025-06-02", "13:00", EstadoServicio.PROGRAMADO,
          mascotas[3], new Servicio(TipoServicio.DESPARASITACION, "Corte de uñas", 15, 200)),
      new Turno("2025-06-02", "14:00", EstadoServicio.CANCELADO,
          mascotas[4], new Servicio(TipoServicio.BAÑO, "Baño y secado", 30, 600)),
      new Turno("2025-06-02", "15:00", EstadoServicio.CANCELADO,
          mascotas[0], new Servicio(TipoServicio.BAÑO, "Corte de pelo", 45, 800)),
      new Turno("2025-06-03", "16:00", EstadoServicio.REALIZADO,
          mascotas[1], new Servicio(TipoServicio.PELUQUERIA, "Baño completo", 30, 500)),
      new Turno("2025-06-03", "17:00", EstadoServicio.CANCELADO,
          mascotas[2], new Servicio(TipoServicio.DESPARASITACION, "Corte de uñas", 15, 200)),
      new Turno("2025-06-03", "18:00", EstadoServicio.PROGRAMADO,
          mascotas[3], new Servicio(TipoServicio.BAÑO, "Baño y corte", 60, 1000)),
      new Turno("2025-06-03", "19:00", EstadoServicio.CANCELADO,
          mascotas[4], new Servicio(TipoServicio.PELUQUERIA, "Baño y secado", 30, 600)),
      new Turno("2025-06-01", "19:00", EstadoServicio.PROGRAMADO,
          mascotas[4], new Servicio(TipoServicio.PELUQUERIA, "Baño y secado", 30, 600))
  };

  public static Servicio[] servicios = {
      new Servicio(TipoServicio.BAÑO, "Baño completo", 90, 500),
      new Servicio(TipoServicio.PELUQUERIA, "Corte de pelo", 45, 600),
      new Servicio(TipoServicio.DESPARASITACION, "Corte de uñas", 15, 200),
      new Servicio(TipoServicio.BAÑO, "Baño y corte", 100, 1000),
      new Servicio(TipoServicio.PELUQUERIA, "Baño y secado", 30, 800)
  };
}
