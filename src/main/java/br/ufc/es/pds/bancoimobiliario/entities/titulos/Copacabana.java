package br.ufc.es.pds.bancoimobiliario.entities.titulos;

import br.ufc.es.pds.bancoimobiliario.entities.Titulo;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorCarta;

import java.util.ArrayList;

public class Copacabana extends Titulo {
  public Copacabana() {
    this.aluguel = 22.0;
    this.aluguelComHotel = 750.0;
    this.cadaCasa = 100.0;
    this.corCarta = CorCarta.AMARELA;
    this.aluguelComCasas = new ArrayList<>(){
      {
        add(110.0);
        add(330.0);
        add(800.0);
        add(975.0);
      }
    };
  }
}
