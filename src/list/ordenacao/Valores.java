package list.ordenacao;

public class Valores implements Comparable<Valores>{

  private int valores;

  public Valores(int valores) {
    this.valores = valores;
  }

  @Override
  public int compareTo(Valores v) {
    return Integer.compare(valores, v.getValores());
  }

  public int getValores() {
    return valores;
  }

  @Override
  public String toString() {
    return "Valores{" +
        "valores=" + valores +
        '}';
  }

}
