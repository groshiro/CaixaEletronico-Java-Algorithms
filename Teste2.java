

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Trabalho
 */

import javax.swing.JOptionPane;

public class Teste2 {
    
    public static void main(String args[]){
        int num,maior,menor;
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
        int v[] = new int[11];
        for (num=0;num<=10;num++){
            v[num] = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor na posição "+num+" do vetor"));
            if (v[num]>maior){
                maior = v[num];                
            }
            if (v[num]<menor){
                menor = v[num];
            }
            JOptionPane.showMessageDialog(null, "Maior = "+maior+" e Menor = "+menor);            
        }
    }
    
}
