package pattern.create.b;

public class LazyInitialization {
    public static void main(String[]args){
        System.out.println("------------LazyInitialization-------------");
        System.out.println(Config.getInstance());
        System.out.println(Config.getInstance());
        System.out.println(Config.getInstance());
        System.out.println(Config.getInstance());
        System.out.println("------------LazyInitialization-------------");
    }
}

class Config{
    private static Config INSTANCE = null;
    private Config(){
        System.out.println("Config()..");
    }
    public static Config getInstance(){
        if( INSTANCE == null ){
            INSTANCE = new  Config();
        }
        return INSTANCE;
    }

    
}
