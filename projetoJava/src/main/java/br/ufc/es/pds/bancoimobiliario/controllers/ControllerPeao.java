package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.controllers.interfaces.IControllerPeao;
import br.ufc.es.pds.bancoimobiliario.entities.Peao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorPeao;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaPeao;

public class ControllerPeao implements IControllerPeao {

  private static ControllerPeao uniqueInstance;

  private final FabricaPeao fabricaPeao;

  private ControllerPeao() {
    this.fabricaPeao = FabricaPeao.getInstance();
  }

  public static synchronized ControllerPeao getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerPeao();

    return uniqueInstance;
  }

  @Override
  public Peao criarPeao(CorPeao cor, IPosicao posicao) {
    return this.fabricaPeao.criarPeao(cor, posicao);
  }
}
