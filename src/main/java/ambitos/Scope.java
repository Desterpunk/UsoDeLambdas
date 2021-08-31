package ambitos;

import lambdas.Operacion;

public class Scope {
    public double probarLocalVariable(){
        final double n3 = 3;
        Operacion op = (n1, n2) -> n1 + n2 + n3;

        return op.calcularPromedio(1, 2);
    }
    public double probarAtributosStaticVariables(){
      return 0;
    };
    public static void main(String[] args) {
        Scope app = new Scope();
        System.out.println("app.probarLocalVariable() = " + app.probarLocalVariable());
    }
}
