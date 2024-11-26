package lista03.exercicio02;

public class Aplicativo {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("VICTOR OZANA DA SILVA OLIVEIRA", null, "71121157106");

        System.out.println("O CPF E: " +proprietario1.getCpf());
        System.out.println("nome é: "+proprietario1.getNome());

        proprietario1.setComplemento("QD 125 LT 05");
        System.out.println(proprietario1.getComplemento());

        System.out.println("rg: "+proprietario1.getRg());
     }
}
