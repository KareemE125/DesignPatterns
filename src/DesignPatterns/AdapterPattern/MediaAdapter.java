package DesignPatterns.AdapterPattern;

public class MediaAdapter implements MediaPlayer
{
    private AdvancedMediaPlayer player;

    public MediaAdapter(String audioType)
    {
        if( audioType.equalsIgnoreCase("mp4")) { player = new MP4Player(); }
        else if( audioType.equalsIgnoreCase("vlc")) { player = new VLCPlayer(); }
    }

    @Override
    public void play(String audioType, String fileName)
    {
        if( audioType.equalsIgnoreCase("mp4")) { player.playMP4(fileName); }
        else if( audioType.equalsIgnoreCase("vlc")) { player.playVLC(fileName); }
    }
}
