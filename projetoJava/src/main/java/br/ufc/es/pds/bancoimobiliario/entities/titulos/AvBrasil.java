package br.ufc.es.pds.bancoimobiliario.entities.titulos;

import br.ufc.es.pds.bancoimobiliario.entities.Titulo;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorCarta;

import java.util.ArrayList;

public class AvBrasil extends Titulo {
  public AvBrasil() {
    this.aluguel = 12.0;
    this.aluguelComHotel = 900.0;
    this.cadaCasa = 100.0;
    this.corCarta = CorCarta.AMARELA;
    this.aluguelComCasas = new ArrayList<>(){
      {
        add(60.0);
        add(180.0);
        add(500.0);
        add(700.0);
      }
    };
  }
}
