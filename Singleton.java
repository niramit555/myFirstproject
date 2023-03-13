public class Singleton {
    private  static Singleton sSingleton;
    private  Singleton(){}

    public static Singleton getInstance(){
        if(sSingleton==null){
            sSingleton = new Singleton();
        }
        return sSingleton;
    }
}
