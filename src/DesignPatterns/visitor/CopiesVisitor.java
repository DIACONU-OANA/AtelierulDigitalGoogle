package DesignPatterns.visitor;

public class CopiesVisitor implements  Visitor{
    private int numberOfCoppies;

    @Override
    public void visit(Book book) {
        numberOfCoppies+=book.getNrOfCopies();
    }

    @Override
    public void visit(Film film) {
    numberOfCoppies+=film.getNrOfCopies();
    }

    @Override
    public void visit(Album album) {
    numberOfCoppies+= album.getNrOfCoppies();
    }

    @Override
    public String toString() {
        return "CopiesVisitor{" +
                "numberOfCoppies=" + numberOfCoppies +
                '}';
    }
}
