package com.jad.customer;

import com.jad.show.ConcertShow;
import com.jad.show.ConcertWatchStrategy;
import com.jad.show.IShow;
import com.jad.show.MovieShow;
import com.jad.show.MovieWatchStrategy;
import com.jad.show.StreetShow;
import com.jad.show.StreetShowWatchStrategy;
import com.jad.show.TheaterShow;
import com.jad.show.TheaterWatchStrategy;
import com.jad.show.WatchStrategy;

public class WatchStrategyFactory {
    public static WatchStrategy getStrategy(IShow show) {
        if (show instanceof ConcertShow) {
            return new ConcertWatchStrategy();
        } else if (show instanceof MovieShow) {
            return new MovieWatchStrategy();
        } else if (show instanceof StreetShow) {
            return new StreetShowWatchStrategy();
        } else if (show instanceof TheaterShow) {
            return new TheaterWatchStrategy();
        }
        throw new IllegalArgumentException("No strategy found for this show type!");
    }
}
