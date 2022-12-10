package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.controllers.ControllerTabuleiro;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IJogo;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicaoComCarta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Jogo implements IJogo {
  private Dados dados;
  private Banco banco;
  private List<ICarta> cartas;
  private Tabuleiro tabuleiro;
  private List<Jogador> jogadores;
  private Jogador jogadorAtual;
  private int posicaoJogadorAtual;
  private Integer quantidadeDeJogadores;
  private boolean iniciado;

  ControllerTabuleiro controllerTabuleiro;

  public Jogo(int quantidadeDeJogadores) {
    assert(quantidadeDeJogadores >= 2 && quantidadeDeJogadores <= 6);

    this.iniciado = false;

    this.posicaoJogadorAtual = -1;

    this.dados = Dados.getInstance();

    this.quantidadeDeJogadores = quantidadeDeJogadores;

    this.jogadores = new LinkedList<>();

    this.banco = new Banco();

    this.controllerTabuleiro = ControllerTabuleiro.getInstance();

    this.tabuleiro = this.controllerTabuleiro.criarTabuleiro();

    this.cartas = new ArrayList<>();
    this.tabuleiro.getPosicoes().forEach(posicao -> {
      if (posicao instanceof IPosicaoComCarta) {
        this.cartas.add(((IPosicaoComCarta) posicao).getCarta());
      }
    });
  }

  @Override
  public void jogar() {
    this.iniciado = true;
    this.jogadorAtual = this.jogadores.get(this.posicaoJogadorAtual);
  }

  @Override
  public void sair() {
    this.iniciado = true;
  }

  @Override
  public void status() {
    //
  }

  @Override
  public boolean adicionarJogador(Jogador jogador) {
    if (this.jogadores.size() < this.quantidadeDeJogadores) {
      this.jogadores.add(jogador);
      jogador.setContaCorrente(this.banco.adicionarContaCorrente(jogador));
      return true;
    } else {
      return false;
    }
  }

  public Jogador proximoJogador() {
    this.posicaoJogadorAtual++;
    if (this.posicaoJogadorAtual >= this.quantidadeDeJogadores) {
      this.posicaoJogadorAtual = 0;
    }
    this.jogadorAtual = this.jogadores.get(this.posicaoJogadorAtual);
    return this.jogadorAtual;
  }

  public DadosRolados rolarDados() {
    return this.dados.rolarDados();
  }
}
