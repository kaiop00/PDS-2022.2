package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.Jogo;

public class FabricaJogo {

  private static FabricaJogo uniqueInstance;

  private FabricaJogo() {
  }

  public static synchronized FabricaJogo getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaJogo();
    return uniqueInstance;
  }

  public Jogo criarJogo(int quantidadeDeJogadores) {
    return new Jogo(quantidadeDeJogadores);
  }

}
