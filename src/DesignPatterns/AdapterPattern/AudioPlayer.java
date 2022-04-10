package DesignPatterns.AdapterPattern;

public class AudioPlayer implements MediaPlayer
{
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName)
    {
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Now \""+fileName+".mp3\" is Playing......");
        }
        else if(audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc"))
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else { System.out.println("The file extention \""+fileName+"\" is NOT supported");}
    }
}
