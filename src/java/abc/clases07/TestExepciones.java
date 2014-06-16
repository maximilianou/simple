package abc.clases07;

public class TestExepciones {

    public static void testExcepcion_NO_Obligatoria() {
        throw new RuntimeException("Esta excepcion no es capturada obligatoriamente, en tiempo de compilacion, pero cuando ocurre, corta la ejecucion.");
    }

    public static void testExcepcion_SI_Obligatoria() throws Exception {
        throw new Exception("Obligatorio Capturar en Compilacion.");
    }

    public static void main(String[] args) {
        System.out.println("Test 01: Esto SI SI SI se ejecuta.. Comienzo");
        try {
            System.out.println("Test 02: Esto SI SI SI se ejecuta.. Antes de la Excepcion Obligatoria");
            testExcepcion_SI_Obligatoria();
            System.out.println("Test 03: Esto NO NO NO se ejecuta.. Despues de la Excepcion Obligatoria");
        } catch (Exception ex) {
            System.out.println("Test 04: Esto SI SI SI se ejecuta.. Despeus Excepcion Obligatoria CAPTURADA!!!");
        } finally {
            System.out.println("Test 05: SIEMPRE ejecuta el Finally!!!");
        }
        System.out.println("Test 06: Tambien ejecuta el Resto!!!");

        System.out.println("Test 97: Esto SI SI SI se ejecuta.. Antes de la Excepcion Obligatoria");
        testExcepcion_NO_Obligatoria();
        System.out.println("Test 98: Esto NO NO NO se ejecuta.. Despues de la Excepcion Obligatoria");
        System.out.println("Exito !! ??");
    }
}
