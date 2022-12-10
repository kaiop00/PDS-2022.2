package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.controllers.interfaces.IControllerPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TiposDePosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaPosicao;

public class ControllerPosicao implements IControllerPosicao {

  private static ControllerPosicao uniqueInstance;

  private final FabricaPosicao fabricaPosicao;

  private ControllerPosicao() {
    this.fabricaPosicao = FabricaPosicao.getInstance();
  }

  public static synchronized ControllerPosicao getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerPosicao();

    return uniqueInstance;
  }

  public IPosicao criarPosicao(int ID, TiposDePosicao tiposDePosicao, ICarta carta) {
    return this.fabricaPosicao.criarPosicao(ID, tiposDePosicao, carta);
  }

  public IPosicao criarPosicao(int ID, TiposDePosicao tiposDePosicao) {
    return this.fabricaPosicao.criarPosicao(ID, tiposDePosicao);
  }
}
