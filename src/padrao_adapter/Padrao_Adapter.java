/**
 *@author Lêdo
 */
package padrao_adapter;

public class Padrao_Adapter {
     
    public static void main(String[] args) {

        int numeroR = 43;
        Brasileiro br = new Adapter();
        
        // ROUPA
        System.out.println("Sigla BR: "+ br.roupaBR(numeroR));
        
    }
    
}
