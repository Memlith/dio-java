
public class Jukebox implements MusicPlayer {

    @Override
    public void playMusic() {
        System.out.println("A Jukebox esta parando a Musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("A Jukebox esta pausando a Musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("A Jukebox esta parando a Musica");
    }

}
