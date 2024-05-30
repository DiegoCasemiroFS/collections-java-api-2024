package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
adicionarNumero(int numero): Adiciona um número à lista.
ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
 */

public class OrdenacaoValores {

  private List<Valores> valoresList;

  public OrdenacaoValores() {
    this.valoresList = new ArrayList<>();
  }

  public void adicionarNumero(int numeros) {
    Valores valor = new Valores(numeros);
    this.valoresList.add(valor);
  }

  public List<Valores> ordenarAscendente() {
    List<Valores> numerosAscendente = new ArrayList<>(valoresList);
    if (!valoresList.isEmpty()) {
      Collections.sort(numerosAscendente);
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Valores> ordenarDescendente() {
    List<Valores> numerosAscendente = new ArrayList<>(valoresList);
    if (!valoresList.isEmpty()) {
      numerosAscendente.sort(Collections.reverseOrder());
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    OrdenacaoValores valores = new OrdenacaoValores();

    valores.adicionarNumero(31);
    valores.adicionarNumero(17);
    valores.adicionarNumero(12);
    valores.adicionarNumero(19);

    System.out.println(valores.ordenarAscendente());
    System.out.println(valores.ordenarDescendente());
  }
}
