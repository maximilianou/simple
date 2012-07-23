package pattern.create.a;

public class Singleton {
    public static void main(String[]args){
        System.out.println("-----------Singleton------------");
        UnicaInstancia ui1 = UnicaInstancia.getInstance();
        UnicaInstancia ui2 = UnicaInstancia.getInstance();
        UnicaInstancia ui3 = UnicaInstancia.getInstance();
        UnicaInstancia ui4 = UnicaInstancia.getInstance();
        System.out.println( ui1 );
        System.out.println( ui2 );
        System.out.println( ui3 );
        System.out.println( ui4 );
        System.out.println("-----------Singleton------------");
        
    }
}

class UnicaInstancia{
    private static UnicaInstancia INSTANCE = new UnicaInstancia();
    private UnicaInstancia(){
        System.out.println("UnicaInstancia..");
    }
    public static UnicaInstancia getInstance(){
        return INSTANCE;
    }
}

