package br.ufc.es.pds.bancoimobiliario.controllers.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.enums.TiposDePosicao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;

public interface IControllerPosicao {
  IPosicao criarPosicao(int ID, TiposDePosicao tiposDePosicao, ICarta carta);
}
