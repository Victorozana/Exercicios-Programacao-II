package lista05.exercicio01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Aplicativo {
    public static void main(String[] args) {
        List <Agendamento> agendamentosMedico1 = new ArrayList<>();

        Medico medico1 = new Medico("Victor", "06891354161", LocalDate.of(2005, 8, 30), "28988 DF", "Clínica Geral", agendamentosMedico1);

        Paciente paciente1 = new Paciente("Luana", "71749193167", LocalDate.of(2000, 5,27));

        Paciente paciente2 = new Paciente("Henrique", "78185327149", LocalDate.of(1976, 3, 31));

        Agendamento agendamento = new Agendamento(LocalDate.of(2025, 2, 20), LocalTime.of(8, 0,0), paciente1, 122);

        Agendamento agendamento1 = new Agendamento(LocalDate.of(2025, 2, 20), LocalTime.of(8, 2,0), paciente2, 144);

        medico1.agendar(agendamento);
        medico1.agendar(agendamento1);

        medico1.desmarcar(agendamento1);

        medico1.exibirAgendamentos();
    }


}
