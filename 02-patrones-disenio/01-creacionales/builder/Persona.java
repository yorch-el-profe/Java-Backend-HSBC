public class Persona {
  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private int edad;
  private String direccion;
  private String estadoCivil;
  private String genero;

  public Persona(PersonaBuilder builder) {
    this.nombre = builder.getNombre();
    this.apellidoPaterno = builder.getApellidoPaterno();
    this.apellidoMaterno = builder.getApellidoMaterno();
    this.edad = builder.getEdad();
    this.direccion = builder.getDireccion();
    this.estadoCivil = builder.getEstadoCivil();
    this.genero = builder.getGenero();
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + ", Paterno: " + apellidoPaterno + ", Materno: " + apellidoMaterno + ", Edad: " + edad
        + ", Direccion: " + direccion + ", Estado Civil:" + estadoCivil;
  }
}