package proiect2;

public class OldPlayer implements MusicPlayer{

    private FormatAdapter formatAdapter;

    @Override
    public void play(Enum albumFormat, String albumName) {
        if(albumFormat.equals(Enum.VINIL)){ System.out.println("Playing on the vinil is:" +
                " "+ albumName);}
        else if(albumFormat.equals(Enum.CD) || albumFormat.equals(Enum.USB)){
            formatAdapter = new FormatAdapter(albumFormat);
            formatAdapter.play(albumFormat,albumName);
        }

    }
}
