/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import static java.util.Collections.list;
import java.util.Vector;


/**
 import votenolivro.FilmeUsuario;
import votenolivro.Usuario;
*
 * @author Juliano
 */
public class Model {
    Vector<Usuario> listaDeUsuarios;
    Vector<Filme> listaDeFilmes;

    public Model(Vector<Usuario> listaDeUsuarios, Vector<Filme> listaDeFilmes ) {
        this.listaDeUsuarios = listaDeUsuarios;
        this.listaDeFilmes = listaDeFilmes;
    }
    

    
    
}
