/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uf.dao;

/**
 *
 * @author Mateus Allen
 */
public class Livro {
    private String titulo;
    private String descricao;
    private int codigo;
    private int renovacao;
    private String dataAlugou;
    private int qnt;

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", descricao=" + descricao + ", codigo=" + codigo + ", renovacao=" + renovacao + ", dataAlugou=" + dataAlugou + ", qnt=" + qnt + '}';
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getRenovacao() {
        return renovacao;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public String getDataAlugou() {
        return dataAlugou;
    }

    public void setDataAlugou(String dataAlugou) {
        this.dataAlugou = dataAlugou;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }
    
    
    
    
 
}
