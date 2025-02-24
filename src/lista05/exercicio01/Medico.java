package lista05.exercicio01;

import java.time.LocalDate;
import java.util.List;

public class Medico {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String crm;
    private String especialidadeMedica;
    private List<Agendamento> agendamentos;


    public Medico(String nome, String cpf, LocalDate dataNascimento, String crm, String especialidadeMedica, List<Agendamento> agendamentos) {
        this.nome = nome;
        this.cpf = (validarCPF(cpf)) ? cpf : null;
        this.dataNascimento = dataNascimento;
        this.crm = crm;
        this.especialidadeMedica = especialidadeMedica;
        this.agendamentos = agendamentos;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidadeMedica() {
        return especialidadeMedica;
    }

    /**
     * agenda um agendamento
     *
     * @param agendamento a ser agendado
     * @return a agenda atualizada
     */
    public List<Agendamento> agendar(Agendamento agendamento) {
        if (agendamentos.size() >= 1) {
            for (Agendamento agendamento1 : agendamentos) {
                if (agendamento1.getHora().equals(agendamento.getHora())) {
                    return null;
                }
            }
        }
    LocalDate dataAgora = LocalDate.now();
        if(agendamentos.size()>=1){
        for (Agendamento agendamento1 : agendamentos) {
            if (agendamento1.getDia().isBefore(dataAgora)) {
                agendamentos.add(agendamento);
            }
        }
    }
        agendamentos.add(agendamento);
        return agendamentos;
     }


    /**
     * desmarmar uma agendamento feito pelo médico
     * @param agendamento a ser desmarcado
     * @return
     */
    public List<Agendamento> desmarcar(Agendamento agendamento){
        this.agendamentos.remove(agendamento);
        return agendamentos;
    }

    /**
     * validador de cpf
     * @param cpf cpf digitado pelo usuario
     * @return verdadeiro para cpf verdadeiro e falso para falso
     */
    private boolean validarCPF(String cpf){
        if(cpf.length() < 12){
            int soma = 0;
            String primeiroDigito = cpf.substring(0, 9);
            for (int i = 0; i < primeiroDigito.length(); i ++){
                soma += Character.getNumericValue(primeiroDigito.charAt(i)) * (i+1);
            }
            soma = soma % 11;
            if (soma == 10){
                soma = 0;
            }
            if (soma == Character.getNumericValue(cpf.charAt(9))){
                int soma1 = 0;
                String segundoDigito = cpf.substring(0, 10);
                for (int i = 0;i < segundoDigito.length(); i ++){
                    soma1 += Character.getNumericValue(segundoDigito.charAt(i)) * i;
                }
                soma1 = soma1 % 11;
                if (soma1 == 10){
                    soma1 = 0;
                }
                if (soma1 == Character.getNumericValue(cpf.charAt(10))){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * verifica se as datas não estão divergindo entre sim para a agenda do médico
     * @param agendamento
     * @return
     */
    private boolean verificarData(List<Agendamento> agendamento){
        LocalDate dataAgora = LocalDate.now();
        for (Agendamento agendamento1 : agendamentos){
            if (agendamento1.getDia().isAfter(dataAgora)){
                return true;
            }
        }
        return false;
    }

    public void exibirAgendamentos(){
        for (Agendamento agendamento : agendamentos){
            System.out.println("Agendamento Nº: "+agendamento.getNumeroDeAgendamento());
            System.out.println("Nome do Paciente: "+agendamento.getPaciente().getNome());
            System.out.println("Dia: "+agendamento.getDia()+" Horário: "+agendamento.getHora());
        }
    }

}
