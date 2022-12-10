package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.entities.Jogo;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaJogo;

public class ControllerJogo {
  private static ControllerJogo uniqueInstance;

  private final FabricaJogo fabricaJogo;

  private ControllerJogo() {
    this.fabricaJogo = FabricaJogo.getInstance();
  }

  public static synchronized ControllerJogo getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerJogo();
    return uniqueInstance;
  }

  public Jogo criarJogo(int quantidadeDeJogadores) {
    return this.fabricaJogo.criarJogo(quantidadeDeJogadores);
  }

}
