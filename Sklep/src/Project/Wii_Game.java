package Project;

public class Wii_Game extends Game {
    private String motionControl;
    private String additionalAccessories;
    private String miiSupport;

    public String getMotionControl() {
        return motionControl;
    }

    public void setMotionControl(String motionControl) {
        this.motionControl = motionControl;
    }

    public String getAdditionalAccessories() {
        return additionalAccessories;
    }

    public void setAdditionalAccessories(String additionalAccessories) {
        this.additionalAccessories = additionalAccessories;
    }

    public String getMiiSupport() {
        return miiSupport;
    }

    public void setMiiSupport(String miiSupport) {
        this.miiSupport = miiSupport;
    }

    public Wii_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String motionControl, String additionalAccessories, String miiSupport) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setMotionControl(motionControl);
        setAdditionalAccessories(additionalAccessories);
        setMiiSupport(miiSupport);
    }

    @Override
    public String toString() {
        return "Wii Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", motion control=" + getMotionControl() + ", additional accessories=" + getAdditionalAccessories() + ", mii support=" + getMiiSupport() + "]";
    }
}
