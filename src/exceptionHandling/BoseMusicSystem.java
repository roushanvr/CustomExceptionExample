package exceptionHandling;

public class BoseMusicSystem implements MusicSystem{
    @Override
    public void play() {
        System.out.println("Bose logic of playing music");
    }

    @Override
    public void pause() {
        System.out.println("Bose logic of pausing");
    }
}
