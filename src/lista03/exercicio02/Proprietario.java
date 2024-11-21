package lista03.exercicio02;

public class Proprietario {
    private String Nome;
    private String Cpf;
    private String  Rg;
    private String Telefone;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String Cep;
    private String Complemento;


    public Proprietario(String Nome, String Cpf, String Rg, String Telefone, String Rua, String Bairro, String Cidade, String Estado, String Cep, String Complemento) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Rg = Rg;
        this.Telefone = Telefone;
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Cep = Cep;
        this.Complemento = Complemento;
    }

    /**
     * metodo para pegar o valor do atributo Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * método para modificar o atributo Nome
     * @param Nome digitado pelo usuario
     */
    public void setNome(String Nome){
        this.Nome = Nome;
    }

    /**
     *método para acessar o cpf
     * @return o próprio objeto CPF
     */
    public String getCpf() {
        return Cpf;
    }

    /**
     * método para modificar o CPF
     * @param Cpf digitado pelo usuario recebendo um novo valor
     */
    public void setCpf(String Cpf){
        if (validarCpf(Cpf)) this.Cpf = Cpf;
        else this.Cpf = "0";
    }

    /**
     * método para pegar o RG
     * @return retorna o RG
     */
    public String getRg(){
        return Rg;
    }

    /**
     * método usado para modificar o RG sendo obrigatório digitar algo
     * @param Rg digitado pelo usuario
     */
    public void setRg(String Rg){
        this.Rg = Rg;
    }

    /**
     * método usado para pegar o telefone
     * @return retorna o valor do telefone
     */
    public String getTelefone(){
        return Telefone;
    }

    /**
     * método que modifica o telefone
     * @param Telefone digitado pelo usuario
     */
    public void setTelefone(String Telefone){
        this.Telefone = Telefone;
    }

    /**
     * @return método que retorna o valor da rua
     */
    public String getRua(){
        return Rua;
    }

    /**
     * mofica o valor da Rua
     * @param Rua digitado pelo usuario
     */
    public void setRua(String Rua){
        this.Rua = Rua;
    }

    /**
     * @return retorna o valor do Bairro
     */
    public String getBairro(){
        return Bairro;
    }

    /**
     * modifica o valor do Bairro     * @param Bairro digitado pelo usuario
     */
    public void setBairro(String Bairro){
        this.Bairro = Bairro;
    }

    /**
     * @return retorna o valor de Cidade
     */
    public String getCidade(){
        return Cidade;
    }

    /**
     * método que modifica o valor Cidade
     * @param Cidade digitado pelo usuario
     */
    public void setCidade(String Cidade){
        this.Cidade = Cidade;
    }

    /**
     * @return retorna o valor do Estado
     */
    public String getEstado(){
        return Estado;
    }

    /**
     * método utilizado para modificar o Estado
     * @param Estado digitado pelo usuario
     */
    public void setEstado(String Estado){
        this.Estado = Estado;
    }

    /**
     * @return retorna o valor do Cep
     */
    public String getCep(){
        return Cep;
    }

    /**
     * método para modificar o valor do Cep
     * @param Cep digitado pelo usuario
     */
    public void setCep(String Cep){
        this.Cep = Cep;
    }

    /**
     * @return o valor do complemento
     */
    public String getComplemento(){
        return Complemento;
    }

    public void setComplemento(String Complemento){
        this.Complemento = Complemento;
    }

    public void mostrarEstado(){
        System.out.println("Nome: "+getNome());
        System.out.println("Cpf: "+getCpf());
        System.out.println("Rg: "+getRg());
        System.out.println("Telefone: "+getTelefone());
        System.out.println("Rua: "+getRua());
        System.out.println("Bairro: "+getBairro());
        System.out.println("Cidade: "+getCidade());
        System.out.println("Estado: "+getEstado());
        System.out.println("Cep: "+getCep());
        System.out.println("Complemento: "+getComplemento());
    }

    /**
     * método usado para veficar se o CPF é valido ou não
     * @param Cpf digitado pelo usuario
     * @return retorna true ou false
     */
    private boolean validarCpf(String Cpf){
        return Cpf != null && Cpf.matches("\\d{11}");
    }

    private boolean contarDigitos(String Cpf){
        return Cpf.;
    }
}
