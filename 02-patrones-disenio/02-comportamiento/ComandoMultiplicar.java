public class ComandoMultiplicar extends ComandoCalculadora implements Comando {
  public ComandoMultiplicar(float acumulador, float valor) {
    super(acumulador, valor);
  }

  public float ejecutar() {
    return acumulador * valor;
  }
}
