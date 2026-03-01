
import javax.swing.JOptionPane;


public class MergeSort {
    
    public static int vet[] = new int[10];
    
    public static void main(String args[]){
        int i;
        for(i=0;i<10;i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor na posição "+i+" do vetor"));
        }   
        System.out.print("Vetor de Entrada: ");
        imprime(vet);
        merge(vet,0, vet.length - 1);
        System.out.print("\nVetor Ordenado: ");
        imprime(vet);
    }
 
    public static void imprime(int[]v) {
        int i;        
        for (i = 0; i<v.length; i++) {
            System.out.print(" " + v[i]);
        }
    }
    public static void merge(int []v, int ini, int fim) {
        if (fim <= ini) {
		return;
	}
	int meio = (ini + fim) / 2;
	merge(v, ini, meio);
	merge(v, meio + 1, fim);
	int[] A = new int[meio - ini + 1];
	int[] B = new int[fim - meio];
	for (int i = 0; i <= meio - ini; i++) {
		A[i] = v[ini + i];
	}
	for (int i = 0; i <= fim - meio - 1; i++) {
		B[i] = v[meio + 1 + i];
	}
	int i = 0;
	int j = 0;
	for (int k = ini; k <= fim; k++) {
		if (i < A.length && j < B.length) {
			if (A[i] < B[j]) {
				v[k] = A[i++];
			} else {
				v[k] = B[j++];
			}
		} else if (i < A.length) {
			v[k] = A[i++];
		} else if (j < B.length) {
			v[k] = B[j++];
		}
        }
    
    }
}
