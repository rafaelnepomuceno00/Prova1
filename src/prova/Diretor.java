/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

public class Diretor {
private String nome;
private Data dataDeNascimento;  

public void setNome(String p){
    this.nome=p;
}
public String getNome(){
    return this.nome;
}
public void setData(Data p){
    this.dataDeNascimento=p;
}
public Data getData(){
    return this.dataDeNascimento;
}

public void mostraDiretor(){
    System.out.println("Nome do Diretor: "+this.getNome());
    this.dataDeNascimento.mostraData();
}  
}