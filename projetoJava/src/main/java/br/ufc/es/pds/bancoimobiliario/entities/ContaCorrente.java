package br.ufc.es.pds.bancoimobiliario.entities;

public class ContaCorrente {
  private Double saldo;
  private Cliente cliente;

  public ContaCorrente(double saldo, Cliente cliente) {
    this.saldo = saldo;
    this.cliente = cliente;
  }

  public double getSaldo() {
    return this.saldo;
  }
}
