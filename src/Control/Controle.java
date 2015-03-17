/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Filme;
import Model.Model;
import Model.Usuario;
import Model.filmesApresentados;
import java.util.Random;
import java.util.Vector;
import java.util.Random;
import java.util.regex.*; 

/**
 *
 * @author Juliano
 */
public class Controle {

    Model tudo;
    public Vector<Usuario> ListadeUsuarios = new Vector();
    private Vector<Filme> ListadeFilmes = new Vector();

    public Model getTudo() {
        return tudo;
    }

    public void setTudo(Model tudo) {
        this.tudo = tudo;
    }

    public Vector<Usuario> getListadeUsuarios() {
        return ListadeUsuarios;
    }

    public void setListadeUsuarios(Vector<Usuario> ListadeUsuarios) {
        this.ListadeUsuarios = ListadeUsuarios;
    }

    public Vector<Filme> getListadeFilmes() {
        return ListadeFilmes;
    }

    public void setListadeFilmes(Vector<Filme> ListadeFilmes) {
        this.ListadeFilmes = ListadeFilmes;
    }

    public void addfilme() throws Exception {
            ListadeFilmes.add(new Filme("Harry Potter", 0, 0));
            ListadeFilmes.add(new Filme("Senhor dos Aneis", 0, 1));
            ListadeFilmes.add(new Filme("Cronicas de Narnia", 0, 2));
            ListadeFilmes.add(new Filme("Se beber nao case", 0, 3));
            ListadeFilmes.add(new Filme("Homem de Ferro 2", 0, 4));
      
    }
    private Pattern p = Pattern.compile("regex");
    public boolean validaEmail(String email){  
        return p.matcher(email).matches();
    }   

    public boolean ComparaEmail(String email, Usuario usuario) {
        return email != usuario.getEmail();
    }

    public boolean terminou(int contadorVotos) {
        if (contadorVotos < 5) {
            return false;
        } else {
            return true;
        }
    }

    public void fazVotacao(int escolha, Usuario user) {
        if (escolha == 1) {
            filmesApresentados filmes = mostraOpcoes();
            Filme filmeEscolhido = filmes.getFilmesApresentados()[1];
            int idFilme = filmeEscolhido.getId();
            int alteraVotoFilme = ListadeUsuarios.get(user.getId()).getListaFilmesVotados().get(idFilme).getQntVoto();
            ListadeUsuarios.get(user.getId()).getListaFilmesVotados().get(idFilme).setQntVoto(alteraVotoFilme + 1);
        } else if (escolha == 2) {
            filmesApresentados filmes = mostraOpcoes();
            Filme filmeEscolhido = filmes.getFilmesApresentados()[2];
            int idFilme = filmeEscolhido.getId();
            int alteraVotoFilme = ListadeUsuarios.get(user.getId()).getListaFilmesVotados().get(idFilme).getQntVoto();
            ListadeUsuarios.get(user.getId()).getListaFilmesVotados().get(idFilme).setQntVoto(alteraVotoFilme + 1);
        } else {
            System.out.println("Escolha invalida!");
        }
    }

    public void addFilmeListadeFilmes(Filme filme, String nome) {
        int index = 0;
        Usuario user = ListadeUsuarios.get(index);
        while (nome != ListadeUsuarios.get(index).getNome()) {
            index = index + 1;
            user = ListadeUsuarios.get(index);
        }
        user.getListaFilmesVotados().add(filme);
    }

    public int geranumeroRandomico() {
        Random gerador = new Random();
        int numero = gerador.nextInt(4);
        return numero;
    }

    //public void compara
    public filmesApresentados mostraOpcoes() {
        int index = geranumeroRandomico();
        int index1 = geranumeroRandomico();
        while (index1 == index) {
            index1 = geranumeroRandomico();
        }

        filmesApresentados filmes = null;
        filmes.getFilmesApresentados()[1] = ListadeFilmes.get(index);
        filmes.getFilmesApresentados()[2] = ListadeFilmes.get(index1);
        return filmes;
    }

    public void adicionaUsuario(String nome, String email) {
        ListadeUsuarios.add(new Usuario(nome, email));
    }

    public Vector<Filme> rankPorUsuario(int id) {
        Usuario user = ListadeUsuarios.elementAt(id);
        return user.getListaFilmesVotados();
    }

    public Vector<Filme> rankGeral() {
        return ListadeFilmes;
    }

}
