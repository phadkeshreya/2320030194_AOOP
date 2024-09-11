package com.AuctionSystem;

public abstract class Auction {
	public final void conductAuction() {
        announceItem();
        startBidding();
        if (isReservePriceMet()) {
            declareWinner();
        } else {
            handleReserveNotMet();
        }
        endAuction();
    }

    protected abstract void announceItem();
    protected abstract void startBidding();
    protected abstract boolean isReservePriceMet();
    protected abstract void declareWinner();
    protected abstract void handleReserveNotMet();
    protected abstract void endAuction();
}
