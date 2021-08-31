package ambitos;

import lambdas.Operacion;

public class Scope {
    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable(){
        final double n3 = 3;
        Operacion op = (n1, n2) -> n1 + n2 + n3;

        return op.calcularPromedio(1, 2);
    }

    public double probarAtributosStaticVariables() {

        Operacion op = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                atributo1 = n1 + n2;
                atributo2 = atributo1;
                return atributo2;
            }
        };
        Operacion operacion = (x, y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };
      return op.calcularPromedio(3,2);
    }
    public static void main(String[] args) {
        Scope app = new Scope();
        System.out.println("app.probarLocalVariable() = " + app.probarAtributosStaticVariables());
    }
}
