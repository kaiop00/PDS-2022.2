package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.Tabuleiro;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;

import java.util.LinkedList;

public class FabricaTabuleiro {
  private static FabricaTabuleiro uniqueInstance;

  private FabricaTabuleiro() {
  }

  public static synchronized FabricaTabuleiro getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaTabuleiro();
    return uniqueInstance;
  }

  public Tabuleiro criarTabuleiro(LinkedList<IPosicao> posicoes) {
    return new Tabuleiro(posicoes);
  }
}
