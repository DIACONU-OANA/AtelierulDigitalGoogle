package proiect2;

public class USB implements AdvancedMusicPlayer{
    @Override
    public void playCD(String albumName) {

    }

    @Override
    public void playUSB(String albumName) {
        System.out.println("Playing on the USB-stick is: "+ albumName);
    }
}
