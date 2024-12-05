package lista03.exercicio05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    /**
     * construtor que inicializa os atributos dia, mes e ano
     * @param dia >= 1 && dia <= 30, caso não for recebe 0
     * @param mes >= 1 && dia <= 30, caso não for recebe 0
     * @param ano >= 1 && ano <= 2100, caso não for recebe 0
     */
    public Datas(Integer dia, Integer mes, Integer ano){
        this.dia = (dia >= 1 && dia <= 30) ? dia : 0;
        this.mes = (mes >= 1 && dia <= 30) ? mes : 0;
        this.ano = (ano >= 1 && ano <= 2100) ? ano : 0;
    }

    /**
     * metodo que retorna a data atual do sistema operacional utilizando um metodo de java
     */
    public Datas(){
        LocalDate dataSistema = LocalDate.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dataSistema.format(formatar));

    }

    //metodos setters
    public void setAno(Integer dia) { this.dia = (dia >= 1 && dia <= 31) ? dia : 0;}
    public void setDia(Integer mes) {this.mes = (mes >= 1 && dia <= 12) ? mes : 0;}
    public void setMes(Integer ano) {this.ano = (ano >= 1900 && ano <= 2100) ? ano : 0;}

    //metodos getters
    public Integer getAno(){return ano;}
    public Integer getDia(){return dia;}
    public Integer getMes(){return mes;}

    /**
     * retorna a data no formato xx/xx/xxxx
     */
    public String toString(){
        return ""+dia.toString()+"/"+mes.toString()+"/"+ano.toString();
    }

    /**
     * metodo que avança para o dia seguinte
     * @return +1 dia
     */
    public void avancar() {
        if (dia < 31) {
            this.dia += 1;
        } else {
            this.dia = 1;
            if (mes < 12) {
                this.mes += 1;
            } else {
                this.mes = 1;
                this.ano += 1;
            }
        }
    }
}


