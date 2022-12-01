public class Main {
  public static void main(String[] args) throws Exception {
    Persona juan = new PersonaBuilder("Juan", "Perez", "Ortiz")
        .estadoCivil("casado")
        .edad(20)
        .direccion("kajhhasdlkhakjhasdkjashdjkas")
        .construir();

    Persona martin = new PersonaBuilder("Martin", "Lozano", "Garcia")
        .estadoCivil("casado")
        .edad(20)
        .direccion("kajhhasdlkhakjhasdkjashdjkas")
        .construir();

    System.out.println(juan.toString());
  }
}
