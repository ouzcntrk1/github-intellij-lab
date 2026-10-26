public class track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // TODO 1: Full constructor (all four parameters).
    // -------------------------------------------------------
    public track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    // -------------------------------------------------------
    // TODO 2: Title + artist constructor.
    // -------------------------------------------------------
    public track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // -------------------------------------------------------
    // TODO 3: Title-only constructor.
    // -------------------------------------------------------
    public track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 4: Default constructor.
    // -------------------------------------------------------
    public track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    // -------------------------------------------------------
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    // -------------------------------------------------------
    @Override
    public String toString() {
        String explicitTag = isExplicit ? " [EXPLICIT]" : "";
        return "\"" + title + "\" by " + artist + " [" + getDurationFormatted() + "]" + explicitTag;
    }
}
