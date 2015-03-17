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
public class filmesApresentados extends Filme {

    public filmesApresentados(String NomeFilme, int qntVoto, int id) {
        super(NomeFilme, qntVoto, id);
    }
    Filme[] filmesApresentados;

    //public Filme[] getFilmesApresentados() {
      //  return filmesApresentados;
    //}

    public void setFilmesApresentados(Filme[] filmesApresentados) {
        this.filmesApresentados = filmesApresentados;
    }

    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String NomeFilme) {
        this.NomeFilme = NomeFilme;
    }

    public int getQntVoto() {
        return qntVoto;
    }

    public void setQntVoto(int qntVoto) {
        this.qntVoto = qntVoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme[] getFilmesApresentados() {
        return filmesApresentados;
        }
    
    
    
}
