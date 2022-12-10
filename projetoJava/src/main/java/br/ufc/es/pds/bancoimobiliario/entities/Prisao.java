package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;

public class Prisao implements IPosicao {
  private Integer ID;

  public Prisao(int ID) {
    this.ID = ID;
  }
}
