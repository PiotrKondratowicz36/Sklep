package Project;

public class Switch_Game extends Game {
    private String motionControl;
    private String nintendoSwitchOnline;
    private String touchScreenSupport;

    public String getMotionControl() {
        return motionControl;
    }

    public void setMotionControl(String motionControl) {
        this.motionControl = motionControl;
    }

    public String getNintendoSwitchOnline() {
        return nintendoSwitchOnline;
    }

    public void setNintendoSwitchOnline(String nintendoSwitchOnline) {
        this.nintendoSwitchOnline = nintendoSwitchOnline;
    }

    public String getTouchScreenSupport() {
        return touchScreenSupport;
    }

    public void setTouchScreenSupport(String touchScreenSupport) {
        this.touchScreenSupport = touchScreenSupport;
    }

    public Switch_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String motionControl, String nintendoSwitchOnline, String touchScreenSupport) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setMotionControl(motionControl);
        setNintendoSwitchOnline(nintendoSwitchOnline);
        setTouchScreenSupport(touchScreenSupport);
    }

    @Override
    public String toString() {
        return "Switch Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", motion control=" + getMotionControl() + ", Nintendo Switch Online=" + getNintendoSwitchOnline() + ", touch screen support=" + getTouchScreenSupport() + "]";
    }
}
