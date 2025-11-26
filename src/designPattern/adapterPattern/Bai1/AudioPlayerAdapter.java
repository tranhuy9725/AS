package designPattern.adapterPattern.Bai1;

public class AudioPlayerAdapter implements AudioPlayer{
    private Mp3Player mp3Player = new Mp3Player();
    private WavPlayer wavPlayer = new WavPlayer();
    private FlacPlayer flacPlayer = new FlacPlayer();

    @Override
    public void play(String fileName) {
        if (fileName.endsWith(".mp3")) {
            mp3Player.playMp3(fileName);
        } else if (fileName.endsWith(".wav")) {
            wavPlayer.playWav(fileName);
        } else if (fileName.endsWith(".flac")) {
            flacPlayer.playFlac(fileName);
        } else {
            System.out.println("Unsupported format: " + fileName);
        }
    }
}
