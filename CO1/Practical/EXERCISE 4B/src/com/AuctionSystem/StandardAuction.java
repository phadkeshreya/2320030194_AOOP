package com.AuctionSystem;

public class StandardAuction extends Auction {
	@Override
    protected void announceItem() {
        System.out.println("Announcing item for standard auction.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding started for standard auction.");
    }

    @Override
    protected boolean isReservePriceMet() {
        return true; // No reserve price for standard auction
    }

    @Override
    protected void declareWinner() {
        System.out.println("Declaring winner for standard auction.");
    }

    @Override
    protected void handleReserveNotMet() {
        // No action needed for standard auction
    }

    @Override
    protected void endAuction() {
        System.out.println("Ending standard auction.");
    }
}
