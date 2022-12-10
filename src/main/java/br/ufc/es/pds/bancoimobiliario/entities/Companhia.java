package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicaoComCarta;

public class Companhia implements IPosicaoComCarta {
  private Integer ID;
  private ICarta carta;

  public Companhia(int ID, ICarta carta) {
    this.carta = carta;
    this.ID = ID;
  }

  @Override
  public ICarta getCarta() {
    return this.carta;
  }
}
