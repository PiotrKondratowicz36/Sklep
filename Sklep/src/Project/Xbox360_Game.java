package Project;

public class Xbox360_Game extends Game {
    public String achievements;
    public String kinectSupport;
    public String backwardsCompatibility;

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getAchievements() {
        return achievements;
    }

    public String getKinectSupport() {
        return kinectSupport;
    }

    public void setKinectSupport(String kinectSupport) {
        this.kinectSupport = kinectSupport;
    }

    public String getBackwardsCompatibility() {
        return backwardsCompatibility;
    }

    public void setBackwardsCompatibility(String backwardsCompatibility) {
        this.backwardsCompatibility = backwardsCompatibility;
    }

    public Xbox360_Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive, String achievements, String kinectSupport, String backwardsCompatibility) {
        super(title, genre, year, developer, publisher, consoleExclusive);
        setAchievements(achievements);
        setKinectSupport(kinectSupport);
        setBackwardsCompatibility(backwardsCompatibility);
    }

    @Override
    public String toString() {
        return "Xbox360 Game [title=" + getTitle() + ", genre=" + getGenre() + ", year=" + getYear() + ", developer=" + getDeveloper() + ", publisher=" + getPublisher() + ", console exclusive=" + getConsoleExclusive() + ", achievements=" + getAchievements() + ", kinect support=" + getKinectSupport() + ", backwards compatibility=" + getBackwardsCompatibility() + "]";
    }
}
