package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ColeccionApp {
    private List<String> lista;

    public void llenarLista() {
        lista = new ArrayList<>();
        lista.add("Jhon");
        lista.add("Serna");
        lista.add("Durango");
    }
    public void usarForEach() {
        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void usarRemoverIf() {
        //lista.removeIf(x -> x.equalsIgnoreCase("Jhon"));
        lista.removeIf("Jhon"::equalsIgnoreCase);
    }

    public void usarSort(){
        //lista.sort((x,y) -> x.compareTo(y));
        lista.sort(String::compareTo);

    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        app.usarRemoverIf();
        //app.usarSort();
        app.usarForEach();
    }
}
