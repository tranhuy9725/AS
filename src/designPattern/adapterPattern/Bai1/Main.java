package designPattern.adapterPattern.Bai1;

public class Main {
        public static void main(String[] args) {
            Client player = new Client();

            player.play("song.mp3");
            player.play("music.wav");
            player.play("track.flac");
            player.play("video.mp4");
        }
    }


