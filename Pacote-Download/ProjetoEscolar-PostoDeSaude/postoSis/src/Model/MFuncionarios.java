package Model;
public class MFuncionarios {
    private int id;
    private String nomeCompleto;
    private String atuacao;
    private String senha;   
    
    public MFuncionarios (int id, String nomeCompleto, String atuacao, String senha){
        this.id = id ;
        this.nomeCompleto= nomeCompleto;
        this.atuacao= atuacao;
        this.senha= senha;
    }
    
            public void setId(int id){
            this.id = id;
            }
            public void setNomeCompleto(String nomeCompleto){
            this.nomeCompleto = nomeCompleto;
            }
            public void setAtuacao(String atuacao){
            this.atuacao = atuacao;
            }
            public void setSenha(String senha){
            this.senha = senha;
            }
            
            public int getId(){
               return id;
            }
            public String getNomeCompleto(){
               return nomeCompleto;
            }
            public String getAtuacao(){
               return atuacao;
            }
            public String getSenha(){
               return senha;
            }
}
