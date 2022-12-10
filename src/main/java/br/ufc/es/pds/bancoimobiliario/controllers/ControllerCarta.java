package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.entities.enums.CartasTitulos;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TipoDeCarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaCarta;

public class ControllerCarta {

  private static ControllerCarta uniqueInstance;
  public FabricaCarta fabricaCarta;

  private ControllerCarta() {
    this.fabricaCarta = FabricaCarta.getInstance();
  }

  public static synchronized ControllerCarta getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerCarta();

    return uniqueInstance;
  }

  public ICarta criarCarta(TipoDeCarta tipoDeCarta, CartasTitulos cartasTitulos) {
    return this.fabricaCarta.criarCarta(tipoDeCarta, cartasTitulos);
  }
}
