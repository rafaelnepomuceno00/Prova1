/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

public class Filmes {
    private String NomeFilme;
    private Diretor diretor;
    private Data DataLançamento;
    private String Genero;
    
    public String getNomeFilme(){
        return this.NomeFilme;
    }
    
    public Diretor getDiretor(){
        return this.diretor;
    }
    
    public Data getDataFilme(){
        return this.DataLançamento;                
    }
    
    public String getGenero(){
        return this.Genero;
    }
    
    public void setNomeFilme(String NF){
        this.NomeFilme = NF;
    }
    
    public void setDiretor(Diretor D){
        this.diretor = D;
    }
    
    public void setDataFilme(Data DL){
        this.DataLançamento = DL;
    }
    
    public void setGenero(String G){
        this.Genero = G;
    }
    
    public void MostrarFilme(){
        System.out.println("Nome: " + getNomeFilme());
        
       
        this.diretor.mostraDiretor();
        this.getDataFilme().mostraData();
        System.out.println("Genero: " + this.getGenero());
    }
    
    public boolean InformaGenero(String g){
        
        setGenero(g);
        
        if((g == "Terror")||(g == "Romance")||(g == "Ação")){
            this.setGenero(g);
            return true;
        }
        else{
            return false;
        }
    }
}
