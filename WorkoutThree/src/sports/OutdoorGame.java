package sports;

public abstract class OutdoorGame {
    abstract void play();
}
class Football extends OutdoorGame{
    void play()
    {
        System.out.println("Playing football");
    }
}
class Cricket extends OutdoorGame{
    void play()
    {
        System.out.println("Playing cricket");
    }
}
class DriverClass{
    public static void main(String[] args) {
        Football f1=new Football();
        f1.play();

        Cricket c1=new Cricket();
        c1.play();
    }
}