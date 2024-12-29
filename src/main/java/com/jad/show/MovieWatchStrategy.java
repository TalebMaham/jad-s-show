package com.jad.show;

public class MovieWatchStrategy implements WatchStrategy {
    @Override
    public void watch(IShow show) {
        if (show instanceof MovieShow movie) {
            System.out.println("Watching a movie directed by " + movie.getDirector() + " (" + movie.getYearOfRelease() + "): " + movie.getName());
        }
    }
}

