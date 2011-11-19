package simple.crearjavaprogramador.validation;
//maximilianou@gmail.com


public class Validator {
    public static void positive(double pos) throws BelowZeroException{
        if( pos < 0 ){
            throw new  BelowZeroException("Verifique que el valor sea Mayor a Cero.");
        }
    }
}
