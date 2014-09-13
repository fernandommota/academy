/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicios.fixacao.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author fernandommota
 */
public class CountingSort {
    
    public CountingSort(){
        int i, maiorValor=0;
        int n= Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para N:"));
        int A[] = new int[n+1];
        //PREENCHE VETOR
        for(i=1; i<= n; i++){
           A[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para a posição "+(i)+":"));
        }        
        //VERIFICA O MAIOR VALOR LIDO
        for(i=1; i<= n; i++){
           if(maiorValor< A[i])
               maiorValor=A[i];
        }
        //cria vetores auxiliares
        int B[] = new int[n+1];
        int C[] = new int[maiorValor+1];
        //preenche vetor C
        for(i=1; i<= n; i++){
            C[A[i]]++;
        }
        //determina quais elementos de entrada são menores que ou iguais a i
        for(i=1; i<= maiorValor;i++){
            C[i] = C[i] + C[i-1];
        }
        //preenche vetor ordenado
        for(i=1; i<= n; i++){
            B[C[A[i]]] = A[i];
            C[A[i]] = C[A[i]] - 1;
        }
        imprime(B);
    }
    
    public void imprime(int v[]){
        System.out.println("Vetor ordenado:");
        for(int i=1; i<v.length; i++)
            System.out.println(v[i]);
    }
    public static void main(String args[]){
        CountingSort obj= new CountingSort();
    }
}
