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
    public void calcular(){
//        Operacion operacion = new Operacion() {
//            @Override
//            public double calcularPromedio(double n1, double n2) {
//                return (n1+n2)/2;
//            }
//        };
        Operacion operacion = (double n1, double n2) -> (n1 + n2)/2;
        operacion.calcularPromedio(2,3);
        System.out.println("o = " + operacion.calcularPromedio(2,3));
    }
    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.ordenar();
        app.calcular();
    }
}