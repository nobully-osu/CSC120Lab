package Module9.Lab928;

public class Encyclopedia extends Book {
    // protected fields so other classes within the same class
    protected String edition;
    protected int numPages;

    // define mutator methods
    public void setEdition(String inputEdition) {
        edition = inputEdition;
    }
    public void setNumPages(int initNumPages) {
        numPages = initNumPages;
    }

    // define accessor methods
    public String getEdition() {
        return edition;
    }
    public int getNumPages() {
        return numPages;
    }

    // override printInfo() from Book class
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numPages);
    }
}
