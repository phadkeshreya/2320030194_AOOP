package com.AuctionSystem;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
	private List<Observer> bidders = new ArrayList<>();
    private String auctionEvent;

    public void subscribe(Observer bidder) {
        bidders.add(bidder);
    }

    public void unsubscribe(Observer bidder) {
        bidders.remove(bidder);
    }

    public void notifyBidders() {
        for (Observer bidder : bidders) {
            bidder.update(auctionEvent);
        }
    }

    public void setAuctionEvent(String auctionEvent) {
        this.auctionEvent = auctionEvent;
        notifyBidders();
    }
}
