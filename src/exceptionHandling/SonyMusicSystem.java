package exceptionHandling;

public class SonyMusicSystem implements MusicSystem{
    @Override
    public void play() {
        System.out.println("sony logic of playing music");
    }

    @Override
    public void pause() {
        System.out.println("sony logic of pausing");
    }
}
