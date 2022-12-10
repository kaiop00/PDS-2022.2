package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IJogador;

import java.util.ArrayList;
import java.util.List;

public class Jogador extends Cliente implements IJogador {
  private Integer ID;
  private String nome;
  private Peao peao;
  private ContaCorrente contaCorrente;
  private List<Titulo> titulos;
  private List<ICarta> cartas;
  private int quantidadeDeJogadasIguais;

  public Jogador(int ID, Peao peao, ContaCorrente contaCorrente, String nome) {
    this.ID = ID;
    this.titulos = new ArrayList<>();
    this.cartas = new ArrayList<>();
    this.quantidadeDeJogadasIguais = 0;
    this.peao = peao;
    this.contaCorrente = contaCorrente;
    this.nome = nome;
  }

  @Override
  public void moverPeao() {

  }

  @Override
  public void realizarJogada() {

  }

  @Override
  public void pagarMulta() {

  }

  @Override
  public void receberMulta() {

  }

  public void setContaCorrente(ContaCorrente contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  public Integer getID() {
    return ID;
  }
}
