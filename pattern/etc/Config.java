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
}
