public class ComandoSumar extends ComandoCalculadora implements Comando {
  public ComandoSumar(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    return acumulador + valor;
  }
}
