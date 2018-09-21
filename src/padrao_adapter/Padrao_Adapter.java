/**
 *@author Lêdo
 */
package padrao_adapter;

public class Padrao_Adapter {
     
    public static void main(String[] args) {
       
        int numeroC = 37;
        int numeroR = 44;
        Brasileiro br = new Americano();
        //CALÇADO
        System.out.println("Número BR: "+numeroC);
        br.calcadoBR(numeroC);  
        
        // ROUPA
        System.out.println("Número BR: "+numeroR);
        br.roupaBR(numeroR);
        
    }
    
}
