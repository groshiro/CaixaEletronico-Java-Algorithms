/*
 * Bubble Sort
 * Gilson Roberto Oshiro
 * 10/03/2016
 */

import javax.swing.JOptionPane;

public class VetBubbleSort {
    
    public static void main(String args[]){
        
        int vet[] = new int[5];
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
        for (cta=0; cta<5; cta++){
            V[cta] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor na posição " + cta + " do vetor: "));
        }
        JOptionPane.showMessageDialog(null, "Vetor Carregado");
        return V;
    }
    public static int[] Classifica(int V[]){
        
        int i,j,aux;
        for (i = 0; i<4; i++){
            for (j=(i+1);j<5; j++){
                if(V[i]>V[j]){
                    aux = V[i];
                    V[i] = V[j];
                    V[j] = aux;
                }
                
            }
        }
        JOptionPane.showMessageDialog(null, "Vetor Ordenado");
        return V;
    }
    public static void Mostra(int V[]){
        
        int cta;
        String exibe = "";
        for (cta = 0; cta<5; cta++){
            exibe += (V[cta]+" , ");            
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
    
}
