/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author Robson
 */
public class metodos {
    double resultado;
    
     public double somar(double a, double b) {
        
         this.resultado = a + b;
        return resultado;
    }
     public double multiplicar(double a, double b) {
        
         this.resultado = a * b;
        return resultado;
    }
     public double divisao(double a, double b) {
        
         this.resultado = a / b;
        return resultado;
    }
     public double subt(double a, double b) {
        
         this.resultado = a - b;
        return resultado;
    }
}
