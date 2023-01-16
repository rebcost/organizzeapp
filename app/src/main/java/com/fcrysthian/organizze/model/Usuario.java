package com.fcrysthian.organizze.model;

import com.fcrysthian.organizze.config.ConfiguracaoFirebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private String idUsuario;
    private Double totalDespesas = 0.00;
    private Double totalReceitas = 0.00;


    public Usuario() {
    }

    @Exclude
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Exclude
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(Double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public Double getTotalReceitas() {
        return totalReceitas;
    }

    public void setTotalReceitas(Double totalReceitas) {
        this.totalReceitas = totalReceitas;
    }

    public void salvar(){
        DatabaseReference firebase = ConfiguracaoFirebase.getFirebaseDatabase();
        firebase.child("usuarios").child(this.idUsuario).setValue(this);
    }
}
