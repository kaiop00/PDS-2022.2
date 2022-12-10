package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.enums.CorPeao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;

public class Peao {
  private IPosicao posicaoPeaoJogo;
  private CorPeao cor;

  public Peao(CorPeao cor, IPosicao posicao) {
    this.posicaoPeaoJogo = posicao;
    this.cor = cor;
  }

}
