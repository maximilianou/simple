package simple.pattern.etc;

public class ConfigTimer {
    private static ConfigTimer instance = null;
    private static long lastUpTime = 0;
    private ConfigTimer(){
    }
    public static ConfigTimer getInstance(){
        if( null == instance || lastUpTime + (60*60*1000) <  System.currentTimeMillis()){ // hour
            lastUpTime = System.currentTimeMillis();
            instance = new ConfigTimer();
        }
        return instance;
    }
    
    public static void main(String[]args){
        System.out.println(ConfigTimer.getInstance());
        System.out.println(ConfigTimer.getInstance());
        System.out.println(ConfigTimer.getInstance());
    }

}
