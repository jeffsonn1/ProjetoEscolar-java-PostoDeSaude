package Model;
public class MAgendamento {
    private String nomeBeneficiario;
    private String postoProximo;
    private String localidade;
    private String CPF;
    private String municipio;
    private String dataDesejada;
    private String numero; 
    private String bairro;
    private String horario;
    
    public MAgendamento (String nomeBeneficiario, String postoProximo, String localidade, String CPF, String municipio, String dataDesejada, String numero, String bairro,String horario){
         this.nomeBeneficiario = nomeBeneficiario;
         this.postoProximo = postoProximo;
         this.localidade = localidade;
         this.CPF = CPF;
         this.municipio = municipio;
         this.dataDesejada = dataDesejada;
         this.numero = numero;
         this.bairro = bairro;
         this.horario = horario;
    }
    
    public void setNomeBeneficiario(String nomeBeneficiario){
       this.nomeBeneficiario = nomeBeneficiario;
    }
    
    public void setPostoProximo(String postoProximo){
       this.postoProximo = postoProximo;
    }
    
    public void setLocalidade(String localidade){
       this.localidade = localidade;
    }
    
    public void setCPF(String CPF){
       this.CPF = CPF;
    }
    
    public void setMunicipio(String municipio){
       this.municipio = municipio;
    }
    
    public void setDataDesejada(String dataDesejada){
       this.dataDesejada = dataDesejada;
    }
    
    public void setNumero(String numero){
       this.numero = numero;
    }
    
    public void setBairro(String bairro){
       this.bairro = bairro;
    }
    
    public void setHorario(String horario){
       this.horario = horario;
    }
    
    public String getNomeBeneficiario(){
       return nomeBeneficiario;
    }
    
    public String getPostoProximo(){
       return postoProximo;
    }
    
    public String getLocalidade(){
       return localidade;
    }
    
    public String getCPF(){
       return CPF;
    }
    
    public String getMunicipio(){
       return municipio;
    }
    
    public String getDataDesejada(){
       return dataDesejada;
    }
    
    public String getNumero(){
       return numero;
    }
    
    public String getBairro(){
       return bairro;
    }
    
    public String getHorario(){
       return horario;
    }  
}

