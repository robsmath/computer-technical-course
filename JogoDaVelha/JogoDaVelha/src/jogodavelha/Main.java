/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Robson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    JogoDaVelha j = new JogoDaVelha();
    String posicao;
    int valida = 0, jogadas = 0;
    
    while(true){
        System.out.println(":::Jogo da Velha:::");
        j.Exibir();
        
        do{//iniciar jogador 1
            System.out.println("Jogador 1, informe uma posição: ");
            posicao = scan.next();
            while(!j.Valido(posicao)){
                System.out.println("Jogada inválida, tente novamente!");
                System.out.println("Jogador 1, informe uma posição: ");
                posicao = scan.next();
                valida = 0;
            }
            j.Jogada(posicao,"X");
            valida = 1;
        }
        while(valida == 0);//Fim jogador 1
        
        jogadas++;
        valida = 0;
        j.Exibir();
        if(!j.Ganhador(jogadas).equals("null")){
            break;
        }
      do{//iniciar jogador 2
            System.out.println("Jogador 2, informe uma posição: ");
            posicao = scan.next();
            while(!j.Valido(posicao)){
                System.out.println("Jogada inválida, tente novamente!");
                System.out.println("Jogador 2, informe uma posição: ");
                posicao = scan.next();
                valida = 0;
            }
            j.Jogada(posicao,"O");
            valida = 1;
        }
        while(valida == 0);//Fim jogador 2 
      
      jogadas++;
        valida = 0;
        j.Exibir();
        if(!j.Ganhador(jogadas).equals("null")){
            break;
        }
    }
    System.out.println("O "+ j.Ganhador(jogadas)+" é o vencedor!!!");
    }
    
}
