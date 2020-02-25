/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.pagueAqui.modelos;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author kiel
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private LocalDate nascimento;
    private Contatos contatos;

    public Pessoa(String nome, String cpf, Endereco endereco, LocalDate nascimento, Contatos contatos) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nascimento = nascimento;
        this.contatos = contatos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpg() {
        return cpf;
    }

    public void setCpg(String cpg) {
        this.cpf = cpg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpg=" + cpf + ", endereco=" + endereco + ", nascimento=" + nascimento + ", contatos=" + contatos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
    
    
    
}
