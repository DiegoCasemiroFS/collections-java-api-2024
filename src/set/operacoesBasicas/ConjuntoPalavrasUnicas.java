package set.operacoesBasicas;

/*
adicionarPalavra(String palavra): Adiciona uma palavra ao conjunto.
removerPalavra(String palavra): Remove uma palavra do conjunto.
verificarPalavra(String palavra): Verifica se uma palavra está presente no conjunto.
exibirPalavrasUnicas(): Exibe todas as palavras únicas do conjunto.
 */

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

  private Set<PalavrasUnicas> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra){
    palavrasUnicasSet.add(new PalavrasUnicas(palavra));
  }

  public void removerPalavra(String palavra){
    PalavrasUnicas palavrasParaRemover = null;
    if (!palavrasUnicasSet.isEmpty()){
      for(PalavrasUnicas p : palavrasUnicasSet){
        if (p.getPalavras() == palavra){
          palavrasParaRemover = p;
          break;
        }
      }
      palavrasUnicasSet.remove(palavrasParaRemover);
    } else {
      System.out.println("Não existem palavras na lista");
    }
  }

  public void verificarPalavra(String palavra){
    if (!palavrasUnicasSet.isEmpty()){
      for (PalavrasUnicas p : palavrasUnicasSet){
        if (p.getPalavras() == palavra){
          System.out.println("A palavra " + palavra + " esta presente na lista");
        }
      }
    } else {
      System.out.println("Não existem palavras na lista");
    }
  }

  public void exibirPalavrasUnicas(){
    if (!palavrasUnicasSet.isEmpty()){
      System.out.println(palavrasUnicasSet);
    } else {
      System.out.println("Não existem palavras na lista");
    }
  }


  public static void main(String[] args) {

    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("Diego");
    conjuntoPalavrasUnicas.adicionarPalavra("Luisa");
    conjuntoPalavrasUnicas.adicionarPalavra("Ila");
    conjuntoPalavrasUnicas.adicionarPalavra("Sergio");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    conjuntoPalavrasUnicas.verificarPalavra("Diego");

    conjuntoPalavrasUnicas.removerPalavra("Ila");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();

  }
}
