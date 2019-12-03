/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.uf.dao;

import java.util.ArrayList;

/**
 *
 * @author Mateus Allen
 */
public class Universitario {
    
    private String nome;
    private String idade;
    private String curso;
    private String email;
    private int matricula;
    private int senha;

    @Override
    public String toString() {
        return "Universitario{" + "nome=" + nome + ", idade=" + idade + ", curso=" + curso + ", email=" + email + ", matricula=" + matricula + ", senha=" + senha + ", livro=" + livro + '}';
    }
    private ArrayList<Livro> livro = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSneha() {
        return senha;
    }

    public void setSneha(int sneha) {
        this.senha = sneha;
    }
    
  
    
}
