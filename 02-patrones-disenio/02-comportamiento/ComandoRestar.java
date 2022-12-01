public class ComandoRestar extends ComandoCalculadora implements Comando {
  public ComandoRestar(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    return acumulador - valor;
  }
}
