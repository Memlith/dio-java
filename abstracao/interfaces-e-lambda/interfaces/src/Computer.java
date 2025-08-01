
public class Computer implements VideoPlayer {

    @Override
    public void playMusic() {
        System.out.println("O Computador esta parando a Musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Computador esta pausando a Musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Computador esta parando a Musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O Computador esta tocando o Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Computador esta pausando o Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Computador esta parando o Video");
    }

}
