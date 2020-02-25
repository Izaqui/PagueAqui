/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.pagueAqui.modelos;

/**
 *
 * @author kiel
 */
public class Endereco {
    
    private String nomeRua;
    private String nomeBairro;
    private String nomeCidade;
    private int numeroCasa;

    public Endereco(String nomeRua, String nomeBairro, String nomeCidade, int numeroCasa) {
        this.nomeRua = nomeRua;
        this.nomeBairro = nomeBairro;
        this.nomeCidade = nomeCidade;
        this.numeroCasa = numeroCasa;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nomeRua=" + nomeRua + ", nomeBairro=" + nomeBairro + ", nomeCidade=" + nomeCidade + ", numeroCasa=" + numeroCasa + '}';
    }
    
    
    
}
