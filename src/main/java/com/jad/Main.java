package com.jad;

import com.jad.customer.Spectator;
import com.jad.show.ConcertShow;
import com.jad.show.MovieShow;
import com.jad.show.MovieType;
import com.jad.show.StreetShow;
import com.jad.show.TheaterShow;

public class Main {
    public static void main(String[] args) {
        Spectator spectator = new Spectator("John", "Doe");

        ConcertShow concert = new ConcertShow("Rock Night", "A night of rock music", "The Rolling Stones");
        MovieShow movie = new MovieShow("Inception", "A mind-bending thriller", "Christopher Nolan", "2010", MovieType.SCIENCE_FICTION);
        StreetShow streetShow = new StreetShow("Street Magic", "Magic tricks", "David Blaine", "Criss Angel");
        TheaterShow theater = new TheaterShow("Hamlet", "A Shakespeare classic", "Kenneth Branagh", "Ralph Fiennes", "Judi Dench");

        spectator.watch(concert);
        spectator.watch(movie);
        spectator.watch(streetShow);
        spectator.watch(theater);
    }
}
