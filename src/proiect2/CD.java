package proiect2;

public class CD implements AdvancedMusicPlayer{
    @Override
    public void playCD(String albumName) {
        System.out.println("Playing on the CD is: "+ albumName);
    }

    @Override
    public void playUSB(String albumName) {

    }
}
