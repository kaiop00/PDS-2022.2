package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.entities.Tabuleiro;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CartasTitulos;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TipoDeCarta;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TiposDePosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaTabuleiro;

import java.util.LinkedList;

public class ControllerTabuleiro {

  private static ControllerTabuleiro uniqueInstance;
  private ControllerPosicao controllerPosicao;
  private ControllerCarta controllerCarta;
  private final FabricaTabuleiro tabuleiroFactory;

  private ControllerTabuleiro() {
    this.tabuleiroFactory = FabricaTabuleiro.getInstance();
    this.controllerPosicao = ControllerPosicao.getInstance();
    this.controllerCarta = ControllerCarta.getInstance();
  }

  public static synchronized ControllerTabuleiro getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerTabuleiro();
    return uniqueInstance;
  }

  public Tabuleiro criarTabuleiro() {
    LinkedList<IPosicao> posicoes = new LinkedList<>();

    // PADRÃO STRATEGY
    posicoes.add(this.controllerPosicao.criarPosicao(0, TiposDePosicao.PONTO_DE_PARTIDA));

    posicoes.add(this.controllerPosicao.criarPosicao(1, TiposDePosicao.TERRENO,
            this.controllerCarta.criarCarta(TipoDeCarta.TITULO, CartasTitulos.LEBLON)));

    posicoes.add(this.controllerPosicao.criarPosicao(26, TiposDePosicao.TERRENO,
            this.controllerCarta.criarCarta(TipoDeCarta.TITULO, CartasTitulos.AV_BRASIL)));

    posicoes.add(this.controllerPosicao.criarPosicao(28, TiposDePosicao.TERRENO,
            this.controllerCarta.criarCarta(TipoDeCarta.TITULO, CartasTitulos.AV_PAULISTA)));

    posicoes.add(this.controllerPosicao.criarPosicao(29, TiposDePosicao.TERRENO,
            this.controllerCarta.criarCarta(TipoDeCarta.TITULO, CartasTitulos.JARDIM_EUROPA)));

    posicoes.add(this.controllerPosicao.criarPosicao(31, TiposDePosicao.TERRENO,
            this.controllerCarta.criarCarta(TipoDeCarta.TITULO, CartasTitulos.COPACABANA)));

    return this.tabuleiroFactory.criarTabuleiro(posicoes);
  }

}
