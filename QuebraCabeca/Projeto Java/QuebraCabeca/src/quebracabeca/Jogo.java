/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quebracabeca;


/**
 *
 * @author Robson
 */
public class Jogo {
  
    int jogadas=0;
    int t[][] = new int [4][4];
    public void matrix(){  
    t[0][0] = 11;
    t[0][1] = 2;
    t[0][2] = 7;
    t[0][3] = 5;
    t[1][0] = 3;
    t[1][1] = 15;
    t[1][2] = 13;
    t[1][3] = 8;
    t[2][0] = 4;
    t[2][1] = 9;
    t[2][2] = 12;
    t[2][3] = 10;
    t[3][0] = 14;
    t[3][1] = 1;
    t[3][2] = 6;
    t[3][3] = 0;   
    } 
   public void FazerJogada(int a){
        
       if(t[0][0] == 0){
           if(a == t[0][1]){
             t[0][0] = a;
             t[0][1] = 0;
             jogadas++;
           }
           else if(a == t[1][0]){
             t[0][0] = a;
             t[1][0] = 0;
             jogadas++;
           }
           else if(a != t[0][1] || a != t[1][0]){
               
           }           
       }
       else if(t[0][1] == 0){
           if(a == t[0][0]){
               t[0][1] = a;
               t[0][0] = 0;
               jogadas++;
           }
           else if(a == t[1][1]){
               t[0][1] = a;
               t[1][1] = 0;
               jogadas++;
           }
           else if(a == t[0][2]){
               t[0][1] = a;
               t[0][2] = 0;
               jogadas++;
           }
           else if(a != t[0][0] || a != t[1][1] || a != t[0][2]){
              
              
           }           
       }
       else if(t[0][2] == 0){
           if(a == t[0][1]){
               t[0][2] = a;
               t[0][1] = 0;
               jogadas++;
           }
           else if(a == t[1][2]){
               t[0][2] = a;
               t[1][2] = 0;
               jogadas++;
           }
           else if(a == t[0][3]){
               t[0][2] = a;
               t[0][3] = 0;
               jogadas++;
           }
           else if(a != t[0][1] || a != t[1][2] || a != t[0][3]){
              
              
           }           
       }
       else if(t[0][3] == 0){
           if(a == t[0][2]){
             t[0][3] = a;
             t[0][2] = 0;
             jogadas++;
           }
           else if(a == t[1][3]){
             t[0][3] = a;
             t[1][3] = 0;
             jogadas++;
           }
           else if(a != t[0][2] || a != t[1][3]){
              
               
           }           
       }
       else if(t[1][0] == 0){
           if(a == t[0][0]){
               t[1][0] = a;
               t[0][0] = 0;
               jogadas++;
           }
           else if(a == t[1][1]){
               t[1][0] = a;
               t[1][1] = 0;
               jogadas++;
           }
           else if(a == t[2][0]){
               t[1][0] = a;
               t[2][0] = 0;
               jogadas++;
           }
           else if(a != t[0][0] || a != t[1][1] || a != t[2][0]){
               
              
           }           
       }
       else if(t[1][1] == 0){
           if(a == t[1][0]){
               t[1][1] = a;
               t[1][0] = 0;
               jogadas++;
           }
           else if(a == t[0][1]){
               t[1][1] = a;
               t[0][1] = 0;
               jogadas++;
           }
           else if(a == t[1][2]){
               t[1][1] = a;
               t[1][2] = 0;
               jogadas++;
           }
           else if(a == t[2][1]){
               t[1][1] = a;
               t[2][1] = 0;
               jogadas++;
           }
           else if(a != t[1][0] || a != t[0][1] || a != t[1][2] || a != t[2][1]){
               
              
           }           
       }
       else if(t[1][2] == 0){
           if(a == t[1][1]){
               t[1][2] = a;
               t[1][1] = 0;
               jogadas++;
           }
           else if(a == t[0][2]){
               t[1][2] = a;
               t[0][2] = 0;
               jogadas++;
           }
           else if(a == t[1][3]){
               t[1][2] = a;
               t[1][3] = 0;
               jogadas++;
           }
           else if(a == t[2][2]){
               t[1][2] = a;
               t[2][2] = 0;
               jogadas++;
           }
           else if(a != t[1][1] || a != t[0][2] || a != t[1][3] || a != t[2][2]){
               
              
           }           
       }
       else if(t[1][3] == 0){
           if(a == t[1][2]){
               t[1][3] = a;
               t[1][2] = 0;
               jogadas++;
           }
           else if(a == t[0][3]){
               t[1][3] = a;
               t[0][3] = 0;
               jogadas++;
           }
           else if(a == t[2][3]){
               t[1][3] = a;
               t[2][3] = 0;
               jogadas++;
           }
           else if(a != t[1][2] || a != t[0][3] || a != t[2][3]){
               
              
           }           
       }
       else if(t[2][0] == 0){
           if(a == t[1][0]){
               t[2][0] = a;
               t[1][0] = 0;
               jogadas++;
           }
           else if(a == t[2][1]){
               t[2][0] = a;
               t[2][1] = 0;
               jogadas++;
           }
           else if(a == t[3][0]){
               t[2][0] = a;
               t[3][0] = 0;
               jogadas++;
           }
           else if(a != t[1][0] || a != t[2][1] || a != t[3][0]){
               
              
           }           
       }
       else if(t[2][1] == 0){
           if(a == t[2][0]){
               t[2][1] = a;
               t[2][0] = 0;
               jogadas++;
           }
           else if(a == t[1][1]){
               t[2][1] = a;
               t[1][1] = 0;
               jogadas++;
           }
           else if(a == t[2][2]){
               t[2][1] = a;
               t[2][2] = 0;
               jogadas++;
           }
           else if(a == t[3][1]){
               t[2][1] = a;
               t[3][1] = 0;
               jogadas++;
           }
           else if(a != t[2][0] || a != t[1][1] || a != t[2][2] || a != t[3][1]){
               
           }           
       }
       else if(t[2][2] == 0){
           if(a == t[2][1]){
               t[2][2] = a;
               t[2][1] = 0;
               jogadas++;
           }
           else if(a == t[1][2]){
               t[2][2] = a;
               t[1][2] = 0;
               jogadas++;
           }
           else if(a == t[2][3]){
               t[2][2] = a;
               t[2][3] = 0;
               jogadas++;
           }
           else if(a == t[3][2]){
               t[2][2] = a;
               t[3][2] = 0;
               jogadas++;
           }
           else if(a != t[2][1] || a != t[1][2] || a != t[2][3] || a != t[3][2]){
              
              
           }           
       }
        else if(t[2][3] == 0){
           if(a == t[2][2]){
               t[2][3] = a;
               t[2][2] = 0;
               jogadas++;
           }
           else if(a == t[1][3]){
               t[2][3] = a;
               t[1][3] = 0;
               jogadas++;
           }
           else if(a == t[3][3]){
               t[2][3] = a;
               t[3][3] = 0;
               jogadas++;
           }
           else if(a != t[2][2] || a != t[1][3] || a != t[3][3]){
              
           }           
       }
        else if(t[3][0] == 0){
           if(a == t[3][1]){
             t[3][0] = a;
             t[3][1] = 0;
             jogadas++;
           }
           else if(a == t[2][0]){
             t[3][0] = a;
             t[2][0] = 0;
             jogadas++;
           }
           else if(a != t[3][1] || a != t[2][0]){
             
               
           }           
       }
       else if(t[3][1] == 0){
           if(a == t[3][0]){
               t[3][1] = a;
               t[3][0] = 0;
               jogadas++;
           }
           else if(a == t[2][1]){
               t[3][1] = a;
               t[2][1] = 0;
               jogadas++;
           }
           else if(a == t[3][2]){
               t[3][1] = a;
               t[3][2] = 0;
               jogadas++;
           }
           else if(a != t[3][0] || a != t[2][1] || a != t[3][2]){
               
              
           }           
       }
       else if(t[3][2] == 0){
           if(a == t[3][1]){
               t[3][2] = a;
               t[3][1] = 0;
               jogadas++;
           }
           else if(a == t[2][2]){
               t[3][2] = a;
               t[2][2] = 0;
               jogadas++;
           }
           else if(a == t[3][3]){
               t[3][2] = a;
               t[3][3] = 0;
               jogadas++;
           }
           else if(a != t[3][1] || a != t[2][2] || a != t[3][3]){
               
              
           }           
       }
       else if(t[3][3] == 0){
           if(a == t[3][2]){
             t[3][3] = a;
             t[3][2] = 0;
             jogadas++;
           }
           else if(a == t[2][3]){
             t[3][3] = a;
             t[2][3] = 0;
             jogadas++;
           }
           else if(a != t[3][2] || a != t[2][3]){
               
               
           }           
       }
   }
   public boolean Ganhador(){
       if(t[0][0] == 0 && t[0][1] == 1 && t[0][2] == 2 && t[0][3] == 3 
               && t[1][0] == 4 && t[1][1] == 5 && t[1][2] == 6
               && t[1][3] == 7 && t[2][0] == 8 && t[2][1] == 9
               && t[2][2] == 10 && t[2][3] == 11 && t[3][0] == 12
               && t[3][1] == 13 && t[3][2] == 14 && t[3][3] == 15){
          return true;
           

       }
       else if(t[0][0] == 1 && t[0][1] == 2 && t[0][2] == 3 && t[0][3] == 4 
               && t[1][0] == 5 && t[1][1] == 6 && t[1][2] == 7
               && t[1][3] == 8 && t[2][0] == 9 && t[2][1] == 10
               && t[2][2] == 11 && t[2][3] == 12 && t[3][0] == 13
               && t[3][1] == 14 && t[3][2] == 15 && t[3][3] == 00)
               {
           return true;
            

               }else return false;
       
       }
   }
