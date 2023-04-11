package Project;

public class PS4_Game extends Game {
    private String achievements;
    private String touchPadUsage;

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getTouchPadUsage() {
        return touchPadUsage;
    }

    public void setTouchPadUsage(String touchPadUsage) {
        this.touchPadUsage = touchPadUsage;
    }

    public PS4_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String achievements, String touchPadUsage) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setAchievements(achievements);
        setTouchPadUsage(touchPadUsage);
    }

    @Override
    public String toString() {
        return "PS4 Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", achievements=" + getAchievements() + ", touch pad usage=" + getTouchPadUsage() + "]";
    }
}
