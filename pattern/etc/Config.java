package simple.pattern.etc;

public class Config {
    private static Config instance = null;
    private Config(){
    }
    public static Config getInstance(){
        if( null == instance ){ 
            instance = new Config();
        }
        return instance;
    }
    
    
    
    public static void main(String[]args){
        System.out.println( Config.getInstance() );
        System.out.println( Config.getInstance() );
        System.out.println( Config.getInstance() );
        System.out.println( Config.getInstance() );
    }
}
