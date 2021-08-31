package defaultymethod;

public class DefaultMethod implements PersonaA, PersonaB{
    @Override
    public void caminar() {
        System.out.println("Puedo caminar");
    }

    @Override
    public void hablar() {
        PersonaA.super.hablar();
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }
}
