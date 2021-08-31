package referenciametodos;

import lambdas.Operacion;

import java.util.Arrays;
import java.util.Comparator;

public class MeRefApp {
    public static void referenciarMetodoStatic(){
        System.out.println("Metodo Referido Static");
    }
    public void referenciarMetodoInstanciaObjetoArbitrario(){
        String[] nombres = {"Jhon","Serna","Durango"};
//        Arrays.sort(nombres, (o1, o2) -> o1.compareTo(o2));
        Arrays.sort(nombres, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(nombres));
    }
    public void referenciarMetodoInstanciaObjetoParticular(){
        System.out.println("Metodo Referido Instancia Objeto Particular");
    }
    public void referenciarConstructor(){
        //IPersona iper = (x,y) -> (new Persona(x,y));
        IPersona iper = Persona::new;

        Persona per = iper.crear(1,"jhon");
        System.out.println("per.getNombre() = " + per.getNombre());
    }
    public void operar(){
        Operacion2 op = MeRefApp::referenciarMetodoStatic;
        op.saludar();
    }
    public static void main(String[] args) {
        MeRefApp app = new MeRefApp();
       // app.operar();
       // app.referenciarMetodoInstanciaObjetoArbitrario();
        Operacion2 op = app::referenciarConstructor;
        op.saludar();
    }
}
