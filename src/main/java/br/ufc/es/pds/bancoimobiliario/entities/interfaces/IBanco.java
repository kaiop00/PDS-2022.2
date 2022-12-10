package br.ufc.es.pds.bancoimobiliario.entities.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.Cliente;
import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;

public interface IBanco {
  ContaCorrente adicionarContaCorrente(Cliente cliente);
}
