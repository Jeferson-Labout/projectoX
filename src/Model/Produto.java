package Model;

import java.math.BigDecimal;

public class Produto {
    public int cod;
    public String nome;
    public String tamanho;
    public String cor;
    public int qdt;
    public BigDecimal valorDeCusto;
    public BigDecimal valorDeVenda;
    public BigDecimal lucro;
    public int qtdMinimaEstoque;
    public int qtdMaximaEstoque;
    public String fornecedor;

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getCor() {
        return cor;
    }

    public int getQdt() {
        return qdt;
    }

    public BigDecimal getValorDeCusto() {
        return valorDeCusto;
    }

    public BigDecimal getValorDeVenda() {
        return valorDeVenda;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public int getQtdMinimaEstoque() {
        return qtdMinimaEstoque;
    }

    public int getQtdMaximaEstoque() {
        return qtdMaximaEstoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQdt(int qdt) {
        this.qdt = qdt;
    }

    public void setValorDeCusto(BigDecimal valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public void setValorDeVenda(BigDecimal valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    public void setQtdMinimaEstoque(int qtdMinimaEstoque) {
        this.qtdMinimaEstoque = qtdMinimaEstoque;
    }

    public void setQtdMaximaEstoque(int qtdMaximaEstoque) {
        this.qtdMaximaEstoque = qtdMaximaEstoque;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the Cod
     */
   
}
