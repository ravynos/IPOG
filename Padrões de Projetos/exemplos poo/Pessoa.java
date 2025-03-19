public class Pessoa {
    private String nome;
    private String endereço;


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setEndereço (String nome) {
        if (nome.isEmpty()) {
            throw new Exception(message:"E necessario informar o nome da pessoa")
        }
    }
    
}
