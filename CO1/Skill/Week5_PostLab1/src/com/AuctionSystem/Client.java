package com.AuctionSystem;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auctioneer auctioneer = new Auctioneer();

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        auctioneer.subscribe(bidder1);
        auctioneer.subscribe(bidder2);

        auctioneer.setAuctionEvent("Item available for bidding.");
        
        Auction standardAuction = new StandardAuction();
        standardAuction.conductAuction();

        auctioneer.setAuctionEvent("Bidding has started.");

        Auction reserveAuction = new ReserveAuction();
        reserveAuction.conductAuction();

        auctioneer.setAuctionEvent("Bidding has ended.");

        auctioneer.unsubscribe(bidder1);
    }
}


