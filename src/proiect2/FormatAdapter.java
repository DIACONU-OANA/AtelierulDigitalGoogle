package proiect2;

public class FormatAdapter implements MusicPlayer{
    private AdvancedMusicPlayer advancedMusicPlayer;
    public FormatAdapter(Enum albumFormat){
        if(albumFormat.equals(Enum.CD)) advancedMusicPlayer= new CD();
        else if(albumFormat.equals(Enum.USB)) advancedMusicPlayer=new USB();
    }
    @Override
    public void play(Enum albumFormat, String albumName) {
        if(albumFormat.equals(Enum.CD)) advancedMusicPlayer.playCD(albumName);
        else if(albumFormat.equals(Enum.USB)) advancedMusicPlayer.playUSB(albumName);
    }
}
