package lista03.exercicio03;

import java.util.Objects;

public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private String chassi;
    private String proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroDePortas;
    private String tetoSolar;
    private Integer numeroDeMarchas;
    private String cambioAutomatico;
    private String volumeDeCombustivel;
    private Double autonomia;

    //metodo getters
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getChassi() {
        return chassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public String getTetoSolar() {
        return tetoSolar;
    }

    public Integer getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public String getCambioAutomatico() {
        return cambioAutomatico;
    }

    public String getVolumeDeCombustivel() {
        return volumeDeCombustivel;
    }

    public Double getAutonomia() {
        return autonomia;
    }


    //metodo setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public void setTetoSolar(String tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setNumeroDeMarchas(Integer numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public void setCambioAutomatico(String cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public void setVolumeDeCombustivel(String volumeDeCombustivel) {
        this.volumeDeCombustivel = (Objects.nonNull(volumeDeCombustivel) && !(volumeDeCombustivel.isEmpty())) ? volumeDeCombustivel : "Volume de combustivel nao identificado!";
    }

    public void setAutonomia(Double autonomia) {
        this.autonomia = autonomia;
    }

    /**
     * parâmetros obrigatórios para implementar a classe Carro
     * @param autonomia           String
     * @param numeroDeMarchas     String
     * @param volumeDeCombustivel String
     */
    public Carro(Double autonomia, Integer numeroDeMarchas, String volumeDeCombustivel) {
        this.autonomia = autonomia;
        this.numeroDeMarchas = numeroDeMarchas;
        this.volumeDeCombustivel = volumeDeCombustivel;
    }

    /**
     * metodo para descobrir se a String numeroDeMarchas é float, pois numero de marchas são numeros inteiros, levando assim a um erro no programa!
     *
     * @param numeroDeMarchas variavel String
     * @return true para não float e false para float
     */
    private boolean eDouble(String numeroDeMarchas) {
        try {
            Double.parseDouble(numeroDeMarchas);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    /**
     * metodo que acelera o carro de 1 em 1 km/h
     *
     * @return 1 se a velocidadeAtual for menor que a velocidadeMaxima, caso contrario retorna 0
     */
    public int acelerar() {
        return this.velocidadeAtual = (velocidadeAtual < velocidadeMaxima) ? this.velocidadeAtual + 1 : velocidadeAtual;
    }

    /**
     * metodo que freia o carro zerando sua velocidade
     *
     * @return velocidadeAtual = 0
     */
    public int freiar() {
        return velocidadeAtual = 0;
    }

    /**
     * metodo para trocar a marcha do carro sucessivamente
     * @param numeroAtualMarchas esse é o valor que  o metodo devera receber para especificar o numero atual de marchas que o carro esta
     * @return +1 para cada troca
     */
    public int trocarMarcha(int marchaAtual) {
    return (numeroDeMarchas >= marchaAtual && marchaAtual > -1) ? marchaAtual + 1 : -1;
    }

    /**
     * reduzir a marcha
     * @return 1 em 1 para a redução da marcha até atingir o máximo de marchas permitidas até atingir -1 que será ré
     */
    public int reduzMarcha(int marchaAtual){
        return  (numeroDeMarchas >= marchaAtual && marchaAtual > -1) ? marchaAtual - 1 : -1;
    }

    /**
     * quantidade de combustivel em LITROS que preciso para percorrer uma distancia em kilometros
     * @param km distancia que o usuario irá percorrer
     * @return a quantidade de litros que será necessário para percorrer os KM espicificado
     */
    public Double quantCombustivel(Double km){
        return km / autonomia;
    }

    /**
     * metodo que mostra o estado dos atributos
     */
    public void exibirEstado(){
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cor: "+getCor());
        System.out.println("Ano: "+getAno());
        System.out.println("Marca: "+getMarca());
        System.out.println("Chassi: "+getChassi());
        System.out.println("Proprietario: "+getProprietario());
        System.out.println("Velocidade Maxima em KM/H: "+getVelocidadeMaxima());
        System.out.println("Velocidade Atual em KM/H: "+getVelocidadeAtual());
        System.out.println("Numero de Portas: "+getNumeroDePortas());
        System.out.println("Teto Solar: "+getTetoSolar());
        System.out.println("Numero de Marchas: "+getNumeroDeMarchas());
        System.out.println("Cambio Automatico: "+getCambioAutomatico());
        System.out.println("Volume de Combustivel em LITROS: "+getVolumeDeCombustivel());
        System.out.println("Autonomia em KM/L: "+getAutonomia());
    }

}
