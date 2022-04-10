package DesignPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("==> Adapter Pattern <==");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Wiggle Wiggle");
        audioPlayer.play("mp4","dog days");
        audioPlayer.play("vlc","Sunrise");
        
    }
}
