package com.jad.show;

public class StreetShowWatchStrategy implements WatchStrategy {
    @Override
    public void watch(IShow show) {
        if (show instanceof StreetShow streetShow) {
            System.out.println("Enjoying a street show with performers: " + String.join(", ", streetShow.getPerformers()));
        }
    }
}

