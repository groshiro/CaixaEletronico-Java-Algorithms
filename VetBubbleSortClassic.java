/*
 * Bubble Sort Classic
 * Gilson Roberto Oshiro
 * 10/03/2016
 */

import javax.swing.JOptionPane;

public class VetBubbleSortClassic {
    
    public static void main(String args[]){
        
        int vet[] = new int[10];
        int opc = 0;
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opção: \n 1 = Carrega Vetor \n 2 = Classifica Vetor \n 3 = Exibe Vetor \n 9 = Fim"));
            switch (opc){
                case 1: 
                    vet = Carrega(vet);
                    break;
                case 2:
                    vet = Classifica(vet);
                    break;
                case 3:
                    Mostra(vet);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, " F I M ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
    public static int[] Carrega(int V[]){
        
        int cta;
        for (cta=0; cta<10; cta++){
            V[cta] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor na posição " + cta + " do vetor: "));
        }
        JOptionPane.showMessageDialog(null, "Vetor Carregado");
        return V;
    }
    public static int[] Classifica(int V[]){
        
        int i,j,aux;
        boolean troca = true;
        for (i = 9; (i >=0)&&(troca==true); i--){
            troca = false;
            for (j = 0 ; j < i; j++){                
                if(V[j]>V[j+1]){
                    aux = V[j];
                    V[j] = V[j+1];
                    V[j+1] = aux;
                    troca=true;
                    
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, "Vetor Ordenado");
        return V;
    }
    public static void Mostra(int V[]){
        
        int cta;
        String exibe = "";
        for (cta = 0; cta<10; cta++){
            exibe += (V[cta]+" \t ");            
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
    
}
    
