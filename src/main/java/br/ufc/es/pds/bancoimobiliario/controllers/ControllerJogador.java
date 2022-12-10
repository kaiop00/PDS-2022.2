package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.controllers.interfaces.IControllerJogador;
import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;
import br.ufc.es.pds.bancoimobiliario.entities.Jogador;
import br.ufc.es.pds.bancoimobiliario.entities.Peao;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaJogador;

public class ControllerJogador implements IControllerJogador {

  private static ControllerJogador uniqueInstance;

  private final FabricaJogador fabricaJogador;

  private ControllerJogador() {
    this.fabricaJogador = FabricaJogador.getInstance();
  }

  public static synchronized ControllerJogador getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerJogador();
    return uniqueInstance;
  }

  @Override
  public Jogador criarJogador(int ID, Peao peao, ContaCorrente contaCorrente, String nome) {
    return this.fabricaJogador.criarJogador(ID, peao, contaCorrente, nome);
  }
}
