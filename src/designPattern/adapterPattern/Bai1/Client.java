package designPattern.adapterPattern.Bai1;

public class Client {
    private AudioPlayer player = new AudioPlayerAdapter();

    public void play(String fileName) {
        player.play(fileName);
    }
}
