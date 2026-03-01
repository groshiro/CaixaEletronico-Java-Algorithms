/*
 * Carregar vetor
 * Gilson Roberto Oshiro
 * 10/03/2016
 */

import javax.swing.JOptionPane;

public class VetEx1 {
    
    public static void main(String args[]){
        int Vet[] = new int[4];
        int cta;
        for(cta = 0; cta < 4; cta++){
            Vet[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
            if((Vet[cta] % 2) == 0){
                System.out.println("Vet[" + cta + "] par = " +Vet[cta]);
            }else{
                System.out.println("Vet[" + cta + "] impar = " +Vet[cta]);
            }
        } 
        
    }
    
}
