
public class Smartphone implements VideoPlayer {

    @Override
    public void playMusic() {
        System.out.println("O Celular esta parando a Musica");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O Celular esta pausando a Musica");
    }

    @Override
    public void stopMusic() {
        System.out.println("O Celular esta parando a Musica");
    }

    @Override
    public void playVideo() {
        System.out.println("O Celular esta tocando o Video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O Celular esta pausando o Video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O Celular esta parando o Video");
    }

}
