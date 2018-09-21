package padrao_adapter;

public class Adapter implements Brasileiro {
    
    Americano usa = new Americano();
    
    public String roupaBR(int tamanhoR) {
        int numeroA = tamanhoR - 30;
        if(numeroA % 2 != 0){
            numeroA = numeroA - 1;
        }
        String sigla = usa.clothSize(numeroA);
        if("s".equals(sigla))
            return "P";
        if("m".equals(sigla))
            return "M";
        if("l".equals(sigla))
            return "G";
        if("xl".equals(sigla))
            return "GG";
        return "Outros";
    }
    
}
