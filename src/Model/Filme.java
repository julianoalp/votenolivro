/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Juliano
 */
public class Filme {
    String NomeFilme;
    int qntVoto;
    int id;

    public Filme(String NomeFilme, int qntVoto, int id) {
        this.NomeFilme = NomeFilme;
        this.qntVoto = qntVoto;
        this.id = id;
    }

    public Filme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

 
}
