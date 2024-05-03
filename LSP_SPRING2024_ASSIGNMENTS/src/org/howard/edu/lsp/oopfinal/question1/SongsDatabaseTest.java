package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SongsDatabaseTest {
    private SongsDatabase db;

    @BeforeEach
    void setUp() {
        db = new SongsDatabase();
    }

    @Test
    void addSong() {
        db.addSong("Rap", "Savage");
        Set<String> songs = db.getSongs("Rap");
        assertTrue(songs.contains("Savage"));
    }

    @Test
    void getGenreOfSong() {
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");

        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Country", db.getGenreOfSong("Sweet Alabama"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Nonexistent Song"));
    }

    @Test
    void getSongs() {
        db.addSong("Rap", "Savage");
        db.addSong("Rap", "Gin and Juice");
        db.addSong("Country", "Sweet Alabama");

        Set<String> rapSongs = db.getSongs("Rap");
        Set<String> expectedRapSongs = new HashSet<>();
        expectedRapSongs.add("Savage");
        expectedRapSongs.add("Gin and Juice");
        assertEquals(expectedRapSongs, rapSongs);

        Set<String> countrySongs = db.getSongs("Country");
        Set<String> expectedCountrySongs = new HashSet<>();
        expectedCountrySongs.add("Sweet Alabama");
        assertEquals(expectedCountrySongs, countrySongs);

        Set<String> nonExistentGenreSongs = db.getSongs("Nonexistent Genre");
        assertTrue(nonExistentGenreSongs.isEmpty());
    }
}