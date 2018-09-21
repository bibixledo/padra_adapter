/**
 * @author Lêdo
 */
package padrao_adapter;

public class Americano{ 

    public String clothSize(int size) {
        String r = null;
        switch(size){

            case 8:
                r = "s";
            break; 

            case 10:
                r = "m";
            break; 

            case 12:
                r = "l";
            break; 

            case 14:
                r = "xl";
            break; 
        }// fim switch
        return r;
    }
   
}
