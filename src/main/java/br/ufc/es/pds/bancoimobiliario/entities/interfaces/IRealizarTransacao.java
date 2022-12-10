package br.ufc.es.pds.bancoimobiliario.entities.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.Titulo;

public interface IRealizarTransacao {
  void comprar(Titulo titulo);
  void vender(Titulo titulo);
  void pagar(Titulo titulo);
}
