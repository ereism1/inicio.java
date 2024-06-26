package App;

import java.sql.Date;

public class Cliente extends Pessoa {

    private String endereço;
    private String cep;

    

    public Cliente(int id, String nome, String endereço, String cep) {
        super(id, nome);
        this.endereço = endereço;
        this.cep = cep;
    }

    public Cliente(int id, String nome, char sexo, Date dataNascimento, String telefone, String email, String rg,
            String endereço, String cep) {
        super(id, nome);
        this.endereço = endereço;
        this.cep = cep;
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