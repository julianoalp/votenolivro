/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Control.Controle;
import Model.Filme;
import Model.Usuario;
import Model.filmesApresentados;
import java.util.Vector;
import org.json.JSONObject;
import java.util.Scanner;
import corejava.Console;

/**
 *
 * @author Juliano
 */
public class View {
    public View(){
        System.out.println("teste");
    }
    Controle control;
    
    public void inicia() throws Exception{
        
        System.out.println("Bem vindo a BlueSoft - O Sistema de Gestão para o seu negócio.");
        System.out.println("");
        String nome = Console.readLine("Qual seu nome?");
        String email = Console.readLine("Qual seu email?");
        
        control.addfilme();
       // vota();
        
    }
    
    public void imprimeRankGeral(){
        Vector<Filme> rankGeral;
        rankGeral = control.rankGeral();
        for (int i=0; i<5;i++){
            System.out.println("Filme "+ rankGeral.elementAt(i).getNomeFilme()+" tem "+ rankGeral.elementAt(i).getQntVoto() + " votos.");   
            
        }
     }
     public void vota(){
         filmesApresentados filmes;
         filmes = control.mostraOpcoes();
         System.out.println("Opcao 1 - "+ filmes.getFilmesApresentados()[1].getNomeFilme());
         System.out.println("Opcao 2 - "+ filmes.getFilmesApresentados()[2].getNomeFilme());
         int opcao = Console.readInt("Dentre estas opcoes qual filme voce mais gosta?");
         if (opcao !=1 || opcao!= 2){
             System.out.println("Opcao Invalida");
         }
         while (opcao!=1 || opcao!=2){
             opcao = Console.readInt("Dentre estas opcoes qual filme voce mais gosta?");
         }
     }
    
           /**
     *
     * @return
     * @throws Exception
     */
    Usuario user;
    public JSONObject getJson() throws Exception{
        JSONObject j = new JSONObject();
        j.put("id", user.getId());
        j.put("email", user.getEmail());
        j.put("nome", user.getNome());
        j.put("Filmes Votados:", user.getListaFilmesVotados());
        
        return null;
    }
}
