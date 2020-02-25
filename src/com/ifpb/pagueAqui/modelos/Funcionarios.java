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
public class Funcionarios extends Pessoa{
    
    private String matricula;
    private int cod;

    public Funcionarios(String matricula, int cod, String nome, String cpf, Endereco endereco, LocalDate nascimento, Contatos contatos) {
        super(nome, cpf, endereco, nascimento, contatos);
        this.matricula = matricula;
        this.cod = cod;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Funcionarios{" + "matricula=" + matricula + ", cod=" + cod + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.matricula);
        hash = 41 * hash + this.cod;
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
        final Funcionarios other = (Funcionarios) obj;
        if (this.cod != other.cod) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }
    
    
    
}
