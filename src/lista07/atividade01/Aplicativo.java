package lista07.atividade01;

public class Aplicativo {
    public static void main(String[] args) {
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Selene", "7818532714", 1518.0, 220, 7.0);
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("Solana", "068191354161", 2500.0, 120.0);
        Estagiario estagiario = new Estagiario("Victor", "70538050187", 550.00, 120, 4.58);
        FolhaPagamento folhaPagamento = new FolhaPagamento();

        folhaPagamento.addFuncionario(funcionarioHorista);
        folhaPagamento.addFuncionario(funcionarioMensalista);
        folhaPagamento.addFuncionario(estagiario);

        folhaPagamento.processarFolha();
    }


}
