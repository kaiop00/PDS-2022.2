package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;

public class PontoDePartida implements IPosicao {
  private Integer ID;
  public PontoDePartida(int ID) {
    this.ID = ID;
  }
}
