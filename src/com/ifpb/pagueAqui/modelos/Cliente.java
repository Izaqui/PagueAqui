/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.pagueAqui.modelos;

import java.time.LocalDate;


/**
 *
 * @author kiel
 */
public class Cliente extends Pessoa{
    
    private int codCliente;
    private FormasPagamento formasPagamento;
    private float valor;
    private String prazo;
    private float juros;

    public Cliente(int codCliente, FormasPagamento formasPagamento, float valor, String prazo, float juros, String nome, String cpf, Endereco endereco, LocalDate nascimento, Contatos contatos) {
        super(nome, cpf, endereco, nascimento, contatos);
        this.codCliente = codCliente;
        this.formasPagamento = formasPagamento;
        this.valor = valor;
        this.prazo = prazo;
        this.juros = juros;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public FormasPagamento getFormasPagamento() {
        return formasPagamento;
    }

    public void setFormasPagamento(FormasPagamento formasPagamento) {
        this.formasPagamento = formasPagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codCliente=" + codCliente + ", formasPagamento=" + formasPagamento + ", valor=" + valor + ", prazo=" + prazo + ", juros=" + juros + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.codCliente;
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
        final Cliente other = (Cliente) obj;
        return this.codCliente == other.codCliente;
    }
    
    
    
    
}
