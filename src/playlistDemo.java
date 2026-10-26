public class playlistDemo {

    public static void main(String[] args) {

        System.out.println("=== Playlist Track Demo ===\n");

        // --- Default constructor ---
        System.out.println("Default track: ");
        track defaultTrack = new track();
        System.out.println(defaultTrack);
        System.out.println();

        // --- Title-only constructor ---
        System.out.println("Title-only track:");
        track titleTrack = new track("Neon Lights");
        System.out.println(titleTrack);
        System.out.println();

        // --- Title + artist constructor ---
        System.out.println("Title + Artist track:");
        track titleArtistTrack = new track("Ocean Drive", "Midnight Pulse");
        System.out.println(titleArtistTrack);
        System.out.println();

        // --- Full constructor ---
        System.out.println("Full track (non-explicit):");
        // 210 seconds = 3:30
        track fullTrack = new track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println(fullTrack);
        System.out.println();

        // --- Invalid duration test ---
        System.out.println("Invalid Duration Test:");
        track invalidTrack = new track("Broken Clock", "Static Noise", -15, false);
        System.out.println(invalidTrack);
        System.out.println();

        // --- Getter test ---
        System.out.println("Getter Test:");
        // 242 seconds = 4:02
        track getterTrack = new track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title:     " + getterTrack.getTitle());
        System.out.println("Artist:    " + getterTrack.getArtist());
        System.out.println("Duration:  " + getterTrack.getDurationFormatted());
        System.out.println("Explicit:  " + getterTrack.isExplicit());

    }
}
