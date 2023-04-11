package Project;

public class XboxOne_Game extends Game {
    private String achievements;
    private String backwardsCompatibility;

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getBackwardsCompatibility() {
        return backwardsCompatibility;
    }

    public void setBackwardsCompatibility(String backwardsCompatibility) {
        this.backwardsCompatibility = backwardsCompatibility;
    }

    public XboxOne_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String achievements, String backwardsCompatibility) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setAchievements(achievements);
        setBackwardsCompatibility(backwardsCompatibility);
    }

    @Override
    public String toString() {
        return "Xbox360 Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", achievements=" + getAchievements() + ", backwards compatibility=" + getBackwardsCompatibility() + "]";
    }
}
