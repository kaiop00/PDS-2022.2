package br.ufc.es.pds.bancoimobiliario.entities.titulos;

import br.ufc.es.pds.bancoimobiliario.entities.Titulo;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorCarta;

import java.util.ArrayList;

public class Leblon extends Titulo {
  public Leblon() {
    this.aluguel = 6.0;
    this.aluguelComHotel = 500.0;
    this.cadaCasa = 50.0;
    this.corCarta = CorCarta.ROSEA;
    this.aluguelComCasas = new ArrayList<>(){
      {
        add(30.0);
        add(90.0);
        add(170.0);
        add(400.0);
      }
    };
  }
}
