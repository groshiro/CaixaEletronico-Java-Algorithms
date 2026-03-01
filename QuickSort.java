
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gilson Roberto Oshir
 */
public class QuickSort {
    
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
                    vet = quickSort(vet,0,vet.length-1);
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
    public static  int[] quickSort(int v[], int esquerda, int direita){
	int esq = esquerda;
	int dir = direita;
	int pivo = v[(esq + dir) / 2];
	int troca;
	while (esq <= dir) {
        
            while (v[esq] < pivo) {
		esq++;
            }
            while (v[dir] > pivo) {
		dir--;
            }
            if (esq <= dir) {
		troca = v[esq];
		v[esq] = v[dir];
		v[dir] = troca;
		esq++;
		dir--;
            }
	}
        if (esquerda < dir) {
            quickSort(v, esquerda, dir);
        }
        if (direita > esq) {
            quickSort(v, esq, direita);
        }
        return v;        
    }
    public static void Mostra(int V[]){
        
        int cta;
        String exibe = "";
        for (cta = 0; cta<10; cta++){
            exibe += (V[cta]+"  ");            
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
