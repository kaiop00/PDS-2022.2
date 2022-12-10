package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.controllers.ControllerPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.Peao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorPeao;

public class FabricaPeao {

  private static FabricaPeao uniqueInstance;

  private final ControllerPosicao controllerPosicao;

  private FabricaPeao() {
    this.controllerPosicao = ControllerPosicao.getInstance();
  }

  public static synchronized FabricaPeao getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaPeao();
    return uniqueInstance;
  }

  public Peao criarPeao(CorPeao cor, IPosicao posicao) {
    return new Peao(cor, posicao);
  }
}
