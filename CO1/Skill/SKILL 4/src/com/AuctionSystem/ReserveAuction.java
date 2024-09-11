package com.AuctionSystem;

public class ReserveAuction extends Auction {
	private boolean reserveMet = false;

    @Override
    protected void announceItem() {
        System.out.println("Announcing item for reserve auction.");
    }

    @Override
    protected void startBidding() {
        System.out.println("Bidding started for reserve auction.");
        // Simulate reserve being met
        reserveMet = true;
    }

    @Override
    protected boolean isReservePriceMet() {
        return reserveMet;
    }

    @Override
    protected void declareWinner() {
        System.out.println("Declaring winner for reserve auction.");
    }

    @Override
    protected void handleReserveNotMet() {
        System.out.println("Reserve price not met. Auction failed.");
    }

    @Override
    protected void endAuction() {
        System.out.println("Ending reserve auction.");
    }
}
