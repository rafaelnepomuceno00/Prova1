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
public class Data {
    
private int dia;
private int mes;
private int ano;

public void setDia(int d){
    this.dia=d;
}
public int getDia(){
    return this.dia;
}
public void setMes(int m){
    this.mes=m;
}
public int getMes(){
    return this.mes;
}
public void setAno (int a){
    this.ano=a;
}
public int getAno(){
    return this.ano;
}

public void mostraData(){
    System.out.println("dia: "+this.getDia());
    System.out.println("mes: "+this.getMes());
    System.out.println("ano: "+this.getAno());
}
}
