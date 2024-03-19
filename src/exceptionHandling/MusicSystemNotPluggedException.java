package exceptionHandling;

public class MusicSystemNotPluggedException extends Exception{
    public MusicSystemNotPluggedException(){
        super("you have not plugged in an appropriate music system");
    }
}
