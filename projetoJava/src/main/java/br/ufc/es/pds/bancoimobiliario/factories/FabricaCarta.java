package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.Reves;
import br.ufc.es.pds.bancoimobiliario.entities.Sorte;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CartasTitulos;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TipoDeCarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.entities.titulos.*;

public class FabricaCarta {

  private static FabricaCarta uniqueInstance;

  private FabricaCarta() {
  }

  public static synchronized FabricaCarta getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaCarta();
    return uniqueInstance;
  }

  public ICarta criarCarta(TipoDeCarta tipoDeCarta, CartasTitulos cartasTitulos) {
    if (tipoDeCarta == TipoDeCarta.TITULO) {
      return switch (cartasTitulos) {
        case AV_BRASIL -> new AvBrasil();
        case AV_PAULISTA -> new AvPaulista();
        case JARDIM_EUROPA -> new JardimEuropa();
        case COPACABANA -> new Copacabana();
        case LEBLON -> new Leblon();
      };
    } else if (tipoDeCarta == TipoDeCarta.SORTE) {
      return new Sorte();
    }
    return new Reves();
  }

}
