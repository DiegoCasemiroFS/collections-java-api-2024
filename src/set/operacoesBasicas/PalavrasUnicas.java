package set.operacoesBasicas;

import java.util.Objects;

public class PalavrasUnicas {

  private String palavras;

  public PalavrasUnicas(String palavras) {
    this.palavras = palavras;
  }

  public String getPalavras() {
    return palavras;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalavrasUnicas that = (PalavrasUnicas) o;
    return Objects.equals(palavras, that.palavras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(palavras);
  }

  @Override
  public String toString() {
    return "PalavrasUnicas{" +
        "palavras='" + palavras + '\'' +
        '}';
  }
}
