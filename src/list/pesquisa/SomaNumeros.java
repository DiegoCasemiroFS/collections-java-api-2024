package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

  private List<Numero> numeroList;

  public SomaNumeros() {
    this.numeroList = new ArrayList<>();
  }

  public void adicionarNumero(int numero){
    Numero valor = new Numero(numero);
    this.numeroList.add(valor);
  }

  public void calcularSoma(){
    int soma = 0;
    if(!numeroList.isEmpty()){
      for(Numero n : numeroList){
        soma += n.getValor();
      }
        System.out.println("A soma dos valores e: " + soma);
    } else {
      System.out.println("Não existem numeros para serem somados");
    }

  }

  public void encontrarMaiorNumero(){
    int maiorNumero = 0;
    if(!numeroList.isEmpty()){
      for(Numero m : numeroList){
        if (maiorNumero < m.getValor()){
          maiorNumero = m.getValor();
        }
      }
      System.out.println("o maior numero e: " + maiorNumero);
    } else {
      System.out.println("Não existem numeros nesta lista");
    }

  }
  public void encontrarMenorNumero(){
    if(!numeroList.isEmpty()){
    int menorNumero = numeroList.get(0).getValor();
      for(Numero m : numeroList){
        if (menorNumero > m.getValor()){
          menorNumero = m.getValor();
        }
      }
      System.out.println("o menor numero e: " + menorNumero);
    } else {
      System.out.println("Não existem numeros nesta lista");
    }

  }
  public void exibirNumeros(){
    if(!numeroList.isEmpty()){
        System.out.println("Os numeros da lista sao: " + numeroList);
    } else {
      System.out.println("Não existem numeros nesta lista");
    }
  }

  public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(20);
    somaNumeros.adicionarNumero(50);

    somaNumeros.calcularSoma();

    somaNumeros.encontrarMaiorNumero();
    somaNumeros.encontrarMenorNumero();

    somaNumeros.exibirNumeros();

  }
}