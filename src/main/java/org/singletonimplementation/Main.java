package src.main.java.org.singletonimplementation;

public class Main {
    public static void main(String[] args) {
        //EagerSingleton obj=new EagerSingleton();  X not Allowed
        EagerSingleton instance = EagerSingleton.getInstance();
        //LazySingleton obj = new LazySingleton();  X not Allowed
        LazySingleton lazySingleton=LazySingleton.getInstance();
    }
}