package Tugas2;
public class Perkalian {
    public static void main(String [] args) {
        //matriks A ordo 2x3
        int[][] A = {
            {5,2,4},
            {6,1,7},
        };
        
        //matriks B ordo 3x2
       int[][] B = {
           {2,6},
           {5,3},
           {8,1},
       };
       
       if(A[0].length == B.length) {
           int[][] C = new int [A.length][B[0].length];
           for(int i=0; i<A.length; i++) { 
               for(int j=0; j<B[0].length; j++) { 
                   for (int k=0; k<A[0].length; k++) { 
                       C[i][j] += A[i][k] * B[k][j]; 
                   }                                
               }
           }
        for (int[] c:C) {
            for(int i:c) {
                System.out.print(i +" ");
            }    
            System.out.println();
        
       }
       }
       else{
           System.out.println("ukuran kolom A sama dengan ukuran baris B");
       }
       
       System.out.println("Putri Zulfiaturrizki");
    
    }
    
    
}


