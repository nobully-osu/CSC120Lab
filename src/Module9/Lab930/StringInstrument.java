package Module9.Lab930;

public class StringInstrument extends Instrument {
    // private fields
    private int numStrings;
    private int numFrets;
    private boolean isBowed;

    // define accessor + mutator methods
    public void setNumOfStrings(int userNumStrings) {
        numStrings = userNumStrings;
    }

    public int getNumOfStrings() {
        return numStrings;
    }

    public void setNumOfFrets(int userNumFrets) {
        numFrets = userNumFrets;
    }

    public int getNumOfFrets() {
        return numFrets;
    }

    public void setIsBowed(boolean userBowed) {
        isBowed = userBowed;
    }

    public boolean getIsBowed() {
        return isBowed;
    }
}

