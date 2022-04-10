package DesignPatterns.AdapterPattern;

public class MP4Player implements AdvancedMediaPlayer
{
    @Override
    public void playMP4(String fileName)
    {
        System.out.println("Now \""+fileName+".mp4\" is Playing......");
    }

    @Override
    public void playVLC(String fileName) {}
}
