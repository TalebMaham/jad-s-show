package com.jad.customer;

import com.jad.show.IShow;
import com.jad.show.WatchStrategy;

public class Spectator implements ISpectator {
    private final String firstName;
    private final String lastName;

    public Spectator(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void watch(final IShow show) {
        WatchStrategy strategy = WatchStrategyFactory.getStrategy(show);
        strategy.watch(show);
    }
}
