package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.Companhia;
import br.ufc.es.pds.bancoimobiliario.entities.PontoDePartida;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.Prisao;
import br.ufc.es.pds.bancoimobiliario.entities.Terreno;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TiposDePosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;

public class FabricaPosicao {

  private static FabricaPosicao uniqueInstance;

  private FabricaPosicao() { }

  public static synchronized FabricaPosicao getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaPosicao();
    return uniqueInstance;
  }

  public IPosicao criarPosicao(int ID, TiposDePosicao tiposDePosicao, ICarta carta) {
    if (tiposDePosicao == TiposDePosicao.TERRENO) {
      return new Terreno(ID, carta);
    } else if (tiposDePosicao == TiposDePosicao.COMPANHIA) {
      return new Companhia(ID, carta);
    }
    return new Prisao(ID);
  }

  public IPosicao criarPosicao(int ID, TiposDePosicao tiposDePosicao) {
    if (tiposDePosicao == TiposDePosicao.PONTO_DE_PARTIDA) {
      return new PontoDePartida(ID);
    } else if (tiposDePosicao == TiposDePosicao.PRISAO) {
      return new Prisao(ID);
    }
    return null;
  }
}
