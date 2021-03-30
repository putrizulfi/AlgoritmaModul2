package Tugas2;
public class Transpose { 
    public static void main(String[] args) {
        int B[][] = {
            {2,1,-5},
            {3,4,2}
        };
        
        System.out.println("belum di transpose : ");
        int[][]transpose = new int[3][2];
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++) {
                transpose[j][i] = B[i][j];
                }
        }
        System.out.println("sudah di transpose : ");
               for(int i=0; i<B[0].length; i++){
                   for(int j=0; j<B.length; j++){
                       System.out.print(transpose[i][j] + " " );
                   }
                   System.out.println();
               }
                    System.out.println();
                System.out.println("Putri Zulfiaturrizki");
    }
}

        
        
    