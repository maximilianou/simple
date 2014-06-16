package abc.clases07;

class DNIInvalido extends Exception {

    public DNIInvalido(String msg) {
        super(msg);
    }
}

class CUITInvalido extends Exception {

    public CUITInvalido(String msg) {
        super(msg);
    }
}

public class TestMultiplesExepcoines {

    public static void testDNIInvalido() throws DNIInvalido {
        throw new DNIInvalido("Verifique su DNI");
    }

    public static void testCUITInvalido() throws CUITInvalido {
        throw new CUITInvalido("Verifique su CUIT");
    }

    public static void main(String[] args) {
        System.out.println("Test Multiple 01: Comienzo.");
        try {
            System.out.println("Test Multiple 02: Esto SI SI SI Imprime Antes DNIInvalido.");
            testDNIInvalido();
            System.out.println("Test Multiple 03: Esto NO NO NO Imprime Despues DNIInvalido.");
            System.out.println("Test Multiple 04: Esto NO NO NO Imprime Antes CUITInvalido.");
            testCUITInvalido();
            System.out.println("Test Multiple 05: Esto NO NO NO Imprime Despues CUITInvalido.");
        } catch (DNIInvalido | CUITInvalido ex) {
            System.out.println("Test Multiple 06: SI SI SI Mensaje Contextual: " + ex.getMessage());
            if (ex instanceof DNIInvalido) {
                System.out.println("Test Multiple 07: SI SI SI Un Caso: " + ex.getMessage());
            } else {
                System.out.println("Test Multiple 08: SI SI SI Otro Caso: " + ex.getMessage());
            }
        }

        System.out.println("Test Multiple 09: Exito!!!");
    }
}
