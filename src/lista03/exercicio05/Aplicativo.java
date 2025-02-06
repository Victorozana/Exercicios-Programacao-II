package lista03.exercicio05;

import org.w3c.dom.css.CSSUnknownRule;

public class Aplicativo {
    public static void main(String[] args) {
        Datas data2 = new Datas(31, 12, 2005);

        System.out.println(data2.getAno());
        data2.avancar();
        System.out.println(data2);
    }
}
