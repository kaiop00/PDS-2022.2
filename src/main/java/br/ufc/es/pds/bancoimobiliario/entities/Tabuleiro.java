package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;

import java.util.List;

public class Tabuleiro {
  private List<IPosicao> posicoes;

  public Tabuleiro(List<IPosicao> posicoes) {
    this.posicoes = posicoes;
  }

  public List<IPosicao> getPosicoes() {
    return posicoes;
  }
}
