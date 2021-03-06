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
public class Login extends Pessoa{
    
    private String cargo;
    private String nickname;
    private String senha;

    public Login(String cargo, String nickname, String senha, String nome, String cpf, Endereco endereco, LocalDate nascimento, Contatos contatos) {
        super(nome, cpf, endereco, nascimento, contatos);
        this.cargo = cargo;
        this.nickname = nickname;
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Login{" + "cargo=" + cargo + ", nickname=" + nickname + ", senha=" + senha + '}';
    }
    
    
    
}
