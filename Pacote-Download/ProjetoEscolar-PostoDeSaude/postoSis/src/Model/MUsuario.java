package Model;
public class MUsuario {
   private int numSus;
   private String nomeUsuario;
   private String RG;
   private String CPF;
   private String senha;
   
   public MUsuario(int numSus, String nomeUsuario, String RG, String CPF, String senha){
       this.numSus = numSus;
       this.nomeUsuario = nomeUsuario;
       this.RG = RG;
       this.CPF = CPF;
       this.senha = senha;
   }
   
   public void setNumSus(int numSus){
      this.numSus = numSus;
   }
   
   public void setnomeUsario(String nomeUsuario){
      this.nomeUsuario = nomeUsuario;
   }
   
   public void setRG(String RG){
      this.RG = RG;
   }
   
   public void setCPF(String CPF){
      this.CPF = CPF;
   }
   
   public void setSenha(String senha){
      this.senha = senha;
   }
   
   public int getNumSus(){
      return numSus;
   }
   
   public String getnomeUsario(){
      return nomeUsuario;
   }
   
   public String getRG(){
      return RG;
   }
   
   public String getCPF(){
      return CPF;
   }
   
   public String getSenha(){
      return senha;
   }
   
}

