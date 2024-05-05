package App;

import java.sql.Date;

public class Cliente {
    
    private int id;
    private String  nome;
    private String sexo;
    private Date dataNascimento;
    private String telefone;
    private String email;
    private String rg;
    private String endereço;
    private String cep;

    public Cliente(int id, String nome, String sexo, String telefone, String endereço) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereço = endereço;
    }




    
    





    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }





    public String getNome() {
        return nome;
    }





    public void setNome(String nome) {
        this.nome = nome;
    }





    public String getSexo() {
        return sexo;
    }





    public void setSexo(String sexo) {
        this.sexo = sexo;
    }





    public Date getDataNascimento() {
        return dataNascimento;
    }





    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }





    public String getTelefone() {
        return telefone;
    }





    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }





    public String getEmail() {
        return email;
    }





    public void setEmail(String email) {
        this.email = email;
    }





    public String getRg() {
        return rg;
    }





    public void setRg(String rg) {
        this.rg = rg;
    }





    public String getEndereço() {
        return endereço;
    }





    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }





    public String getCep() {
        return cep;
    }





    public void setCep(String cep) {
        this.cep = cep;
    }
    

}
