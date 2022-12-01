public class PersonaBuilder {

  private String nombre;
  private String apellidoPaterno;
  private String apellidoMaterno;
  private String estadoCivil;
  private int edad;
  private String direccion;
  private String genero;

  public PersonaBuilder(String nombre, String apellidoPaterno, String apellidoMaterno) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
  }

  public PersonaBuilder estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

  public PersonaBuilder edad(int edad) {
    this.edad = edad;
    return this;
  }

  public PersonaBuilder direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

  public PersonaBuilder genero(String genero) {
    this.genero = genero;
    return this;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public int getEdad() {
    return edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public String getGenero() {
    return genero;
  }

  public void validar() throws Exception {
    if (edad < 18) {
      throw new Exception("La edad debe ser mayor a 18");
    }
  }

  public Persona construir() throws Exception {
    validar();
    return new Persona(this);
  }
}
