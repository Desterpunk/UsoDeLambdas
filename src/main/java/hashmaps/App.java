package hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    private Map<Integer,String> map;
    public void poblar(){
        map = new HashMap<>();
        map.put(1, "Jhon");
        map.put(2, "Serna");
        map.put(3, "Buenos dias");
    }
    public void imprimirV7(){
        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println("Llave: " + e.getKey() + " Valor: " + e.getValue());
        }
    }
    public void imprimirV8(){
//        map.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }
    public void recolectar (){

    }
    public void insertarSiAusente(){
        map.putIfAbsent(4, "Juan");
    }
    public void operarSiPresente(){
        map.computeIfPresent(3, (k,v) -> k + v);
        System.out.println(map.get(3));
    }
    public void obtenerOrPredeterminado() {
        String valor = map.getOrDefault(5, "valor por defecto");
        System.out.println("valor = " + valor);
    }
    public void recolectados() {
        Map<Integer,String> mapaRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("a"))
                .collect(Collectors.toMap( p -> p.getKey(), p -> p.getValue()));
        mapaRecolectado.forEach((k,v) -> System.out.println("Llave: " + k + " Valor: " + v));
    }

    public static void main(String[] args) {
        App app = new App();
        app.poblar();
        app.recolectados();
        app.imprimirV8();
    }
}
