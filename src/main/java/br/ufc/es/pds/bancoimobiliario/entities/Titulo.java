package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.enums.CorCarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;

import java.util.List;

abstract public class Titulo implements ICarta {
  protected Double aluguel;
  protected Double cadaCasa;
  protected Double aluguelComHotel;
  protected List<Double> aluguelComCasas;
  protected CorCarta corCarta;
}
