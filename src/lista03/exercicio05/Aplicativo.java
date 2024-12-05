package lista03.exercicio05;

public class Aplicativo {
    public static void main(String[] args) {
        Datas data2 = new Datas(31, 12, 2005);

        data2.setAno(2005);
        data2.setDia(31);
        data2.setMes(12);

        data2.avancar();

        System.out.println(data2);
    }
}
