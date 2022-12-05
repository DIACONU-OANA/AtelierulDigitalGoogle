package DesignPatterns.visitor;

public class Album implements Element{
    private int nrOfCoppies;
    private int nrOfSongs;

    public Album(int nrOfCoppies, int nrOfSongs) {
        this.nrOfCoppies = nrOfCoppies;
        this.nrOfSongs = nrOfSongs;
    }

    public int getNrOfCoppies() {
        return nrOfCoppies;
    }

    public int getNrOfSongs() {
        return nrOfSongs;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
