public class Other {
    
    private static Other other = new Other();

    //Eager way of creating Singleton Object
    public static Other getObject2(){
        return other;
    }
}
