package lambdas;


import java.util.*;

public class LambdaApp {
    public void ordenar(){
        List<String> lista = new ArrayList<String>();
        lista.add("Jhon");
        lista.add("Serna");
        lista.add("Jhon");

        Collections.sort(lista,(String p1, String p2) -> p1.compareTo(p2));

        for (String elemento: lista) {
            System.out.println("elemento = " + elemento);
        }

    }
    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.ordenar();
    }
}