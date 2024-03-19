package exceptionHandling;

public class Car {
    private MusicSystem ms;
    public void setMs(MusicSystem ms){
        this.ms=ms;
    }
    public void playMusic() throws MusicSystemNotPluggedException {
        if(ms==null){
            throw new MusicSystemNotPluggedException();// exception happened.... call the catch block. it will call the catch block of client class.
        }
       ms.play();
    }
}

//MusicSystemNotPluggedException is a checked exception as it is extending Exception class.
//so we have to mark playMusic() method with throws and client have to implement try catch.
//if it was extending runtime exception, we don't have to mark playMusic() method with
//throws and client will not have to write try catch.
