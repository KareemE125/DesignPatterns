package DesignPatterns.AdapterPattern;

public class VLCPlayer implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String fileName) { }

    @Override
    public void playVLC(String fileName)
    {
        System.out.println("Now \""+fileName+".vlc\" is Playing......");
    }
}
