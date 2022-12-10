package br.ufc.es.pds.bancoimobiliario.entities.titulos;

import br.ufc.es.pds.bancoimobiliario.entities.Titulo;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorCarta;

import java.util.ArrayList;

public class JardimEuropa extends Titulo {
  public JardimEuropa() {
    this.aluguel = 10.0;
    this.aluguelComHotel = 750.0;
    this.cadaCasa = 100.0;
    this.corCarta = CorCarta.AMARELA;
    this.aluguelComCasas = new ArrayList<>(){
      {
        add(50.0);
        add(150.0);
        add(450.0);
        add(625.0);
      }
    };
  }
}
