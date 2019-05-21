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
public class Triangulo  {

    private double A;
    private double B;
    private double H;

    public double getB() {
        return B;
    }

    public double getA() {
        return A;
    }

    public double getH() {
        return H;
    }

    public void setA(double a) {
        this.A = a;
    }

    public void setB(double b) {
        this.B = b;
    }

    public void setH(double h) {
        this.H = h;
    }

    public double CalcularArea(double a) {
        a = (B * H) / 2;
        return a;
    }

}
