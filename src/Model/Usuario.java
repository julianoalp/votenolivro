/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Vector;

/**
 *
 * @author Juliano
 */
public class Usuario  {
    private String nome;
    private String email;
    private int voto;
    private Vector<Filme> listaFilmesVotados;
    private int id;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getVoto() {
        return voto;
    }

    public Vector<Filme> getListaFilmesVotados() {
        return listaFilmesVotados;
    }

    public int getId() {
        return id;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void setListaFilmesVotados(Vector<Filme> listaFilmesVotados) {
        this.listaFilmesVotados = listaFilmesVotados;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Usuario(String nome, String email, int voto, Vector<Filme> listaFilmesVotados){
        this.nome = nome;
        this.email = email;
        this.voto = voto;
        this.listaFilmesVotados = listaFilmesVotados;
    }

    
    
}
