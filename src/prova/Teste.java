/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author ifnmg
 */
public class Teste {
    public static void main(String[] args) {
     Diretor D1 = new Diretor();
        D1.setNome("Sean Penn");
        
        Data DD1 = new Data();
        DD1.setDia(17);
        DD1.setMes(8);
        DD1.setAno(1960);
        
        D1.setData(DD1);
    
        Filmes F1 = new Filmes();
        F1.setNomeFilme("Into The Wild");
                
        Data DF1 = new Data();
        DF1.setDia(11);
        DF1.setMes(9);
        DF1.setAno(2007);
        
        F1.setDataFilme(DF1);
        F1.setDiretor(D1);
        
        F1.InformaGenero("Drama");
        F1.MostrarFilme();
    }
    
}
        
        
      
