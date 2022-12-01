public abstract class ComandoCalculadora {
  protected float acumulador;
  protected float valor;

  public ComandoCalculadora(float acumulador, float valor) {
    this.acumulador = acumulador;
    this.valor = valor;
  }

  public float deshacer() {
    return acumulador;
  }
}
