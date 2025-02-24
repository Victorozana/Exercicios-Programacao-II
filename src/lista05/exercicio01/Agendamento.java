package lista05.exercicio01;

import java.time.LocalDate;
import java.time.LocalTime;


public class Agendamento{
    private LocalDate dia;
    private LocalTime hora;
    private Paciente paciente;
    private Integer numeroDeAgendamento;

    public Agendamento(LocalDate dia, LocalTime hora, Paciente paciente, Integer numeroDeAgendamento) {
        this.paciente = paciente;
        this.dia =  dia;
        this.hora = (verficarHora(hora)) ? hora : null;
        this.numeroDeAgendamento = numeroDeAgendamento;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public Integer getNumeroDeAgendamento(){
        return numeroDeAgendamento;
    }

    private boolean verficarHora(LocalTime hora){
      if (hora.isAfter(LocalTime.of(7, 59, 59)) && hora.isBefore(LocalTime.of(18, 0, 0))) {
          return true;
      }
      return false;
    }

}
