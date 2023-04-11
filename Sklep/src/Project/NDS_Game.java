package Project;

public class NDS_Game extends Game {
    private String stylusNecessity;
    private String microphoneNecessity;

    public String getStylusNecessity() {
        return stylusNecessity;
    }

    public void setStylusNecessity(String stylusNecessity) {
        this.stylusNecessity = stylusNecessity;
    }

    public String getMicrophoneNecessity() {
        return microphoneNecessity;
    }

    public void setMicrophoneNecessity(String microphoneNecessity) {
        this.microphoneNecessity = microphoneNecessity;
    }

    public NDS_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String stylusNecessity, String microphoneNecessity) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setStylusNecessity(stylusNecessity);
        setMicrophoneNecessity(microphoneNecessity);
    }

    @Override
    public String toString() {
        return "NDS Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", stylus necessity=" + getStylusNecessity() + ", microphone necessity=" + getMicrophoneNecessity() + "]";
    }
}


