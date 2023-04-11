package Project;

public class PS3_Game extends Game {
    private String achievements;
    private String psMoveSupport;

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getPsMoveSupport() {
        return psMoveSupport;
    }

    public void setPsMoveSupport(String psMoveSupport) {
        this.psMoveSupport = psMoveSupport;
    }

    public PS3_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String achievements, String psMoveSupport) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setAchievements(achievements);
        setPsMoveSupport(psMoveSupport);
    }

    @Override
    public String toString() {
        return "PS3 Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", achievements=" + getAchievements() + ", ps move support=" + getPsMoveSupport() + "]";
    }
}
