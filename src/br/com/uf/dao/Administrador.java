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
public class Administrador {
    
    private String nome;
    private int senha;

    @Override
    public String toString() {
        return "Administrador{" + "nome=" + nome + ", senha=" + senha + '}';
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    
}
