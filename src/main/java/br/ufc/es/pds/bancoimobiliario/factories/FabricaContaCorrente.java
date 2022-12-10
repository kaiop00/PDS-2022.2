package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.Cliente;
import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;

public class FabricaContaCorrente {
  private static FabricaContaCorrente uniqueInstance;

  private FabricaContaCorrente() {

  }

  public static synchronized FabricaContaCorrente getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaContaCorrente();
    return uniqueInstance;
  }

  public ContaCorrente criarContaCorrente(double saldo, Cliente cliente) {
    return new ContaCorrente(saldo, cliente);
  }
}
