package defaultymethod;

public interface PersonaB {
    default public void hablar(){
        System.out.println("Saludos puedo hablar soy B");
    }
}
