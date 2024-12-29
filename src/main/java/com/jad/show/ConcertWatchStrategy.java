package com.jad.show;


public class ConcertWatchStrategy implements WatchStrategy {
    @Override
    public void watch(IShow show) {
        if (show instanceof ConcertShow concert) {
            System.out.println("Watching a concert by " + concert.getArtist() + ": " + concert.getName());
        }
    }
}

