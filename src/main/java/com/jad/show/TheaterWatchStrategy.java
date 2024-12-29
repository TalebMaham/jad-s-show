package com.jad.show;


public class TheaterWatchStrategy implements WatchStrategy {
    @Override
    public void watch(IShow show) {
        if (show instanceof TheaterShow theater) {
            System.out.println("Watching a theater play directed by " + theater.getDirector() + " with actors: " + String.join(", ", theater.getActors()));
        }
    }
}
