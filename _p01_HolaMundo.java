//envia un saludo a la pantalla
public class _p01_HolaMundo{ 
    public static void main(String[] args) {
        String amigo = "pepe";
        String hermano = "pablo";
        String mensaje = String.format("Tanto %s como %s desean aprender a usar java", amigo, hermano);

        System.out.println("Hola mundo java");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nHola hermano " + hermano + " bienvenido a java");
        System.out.println(mensaje);

    }
}

