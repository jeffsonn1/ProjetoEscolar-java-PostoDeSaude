package Model;

public class MVacina {

    private String nome;
    private int numLote;
    private String dataEntrega;
    private String vencimento;   
    
    public MVacina (String nome, int numLote, String dataEntrega, String Vencimento){
        this.nome = nome;
        this.numLote = numLote;
        this.dataEntrega = dataEntrega;
        this.vencimento = vencimento;
    }
    
            public void setNome(String nome){
            this.nome = nome;
            }
            public void setNumLote(int numLote){
            this.numLote = numLote;
            }
            public void setDataEntrega(String DataEntrega){
            this.dataEntrega = DataEntrega;
            }
            public void setVencimnto(String vencimento){
            this.vencimento = vencimento;
            }
            
            public String getNome(){
               return nome;
            }
            public int getNumLote(){
               return numLote;
            }
            public String getDataEntrega(){
               return dataEntrega;
            }
            public String getVencimnto(){
               return vencimento;
            }
}

