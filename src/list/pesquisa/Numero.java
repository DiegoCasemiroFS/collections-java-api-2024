package list.pesquisa;

public class Numero {
  private int valor;

  public Numero(int valor) {
    this.valor = valor;
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return "{" + valor + "}";
  }
}
