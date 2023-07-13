/*Tarefa do desafio:
1 - Criar uma aplicação para consultar a API ViaCEP
Desafio desenvolvido por Marcos Ferreira Shirafuchi na linguagem Java.
* */

//Classe endereço
public class Endereco {
    //Propriedades da classe Endereço
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;

    private String uf;

    //Método construtor da classe Endereço
    public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    //Get e setter do Cep

    //Get do Cep
    public String getCep() {
        return cep;
    }

    //Setter do Cep
    public void setCep(String cep) {
        this.cep = cep;
    }

    //Get e setter do Logradouro

    //Get do Logradouro
    public String getLogradouro() {
        return logradouro;
    }

    //Setter do Logradouro
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    //Get e setter do Complemento

    //Get do Complemento
    public String getComplemento() {
        return complemento;
    }

    //Setter do Complemento
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Get e setter do Bairro

    //Get do Bairro
    public String getBairro() {
        return bairro;
    }

    //Setter do Bairro
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    //Get e setter do Localidade

    //Get do Localidade
    public String getLocalidade() {
        return localidade;
    }

    //Setter do Localidade
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    //Get e setter da UF

    //Get da UF
    public String getUf() {
        return uf;
    }

    //Setter da UF
    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        //Método para impressão para exibir os Ceps digitados
        return "CEP = " + getCep() +
                "\nLogradouro = " + getLogradouro() +
                "\nComplemento = " + getComplemento() +
                "\nBairro = " + getBairro() +
                "\nLocalidade = " + getLocalidade() +
                "\nUF = " + getUf()+"\n";
    }
}
