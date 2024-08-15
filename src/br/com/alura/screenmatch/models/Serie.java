package br.com.alura.screenmatch.models;
public class Serie extends Title{
    private int season;
    private boolean active;
    private int episodePerSeason;
    private int minutesPerEpisode;

    public int getSeason() {
        return season;
    }

    public boolean isActive() {
        return active;
    }

    public int getEpisodePerSeason() {
        return episodePerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setEpisodePerSeason(int episodePerSeason) {
        this.episodePerSeason = episodePerSeason;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationMinute() {
        return season * episodePerSeason * minutesPerEpisode;
    }
}
