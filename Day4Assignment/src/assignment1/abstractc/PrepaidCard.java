package assignment1.abstractc;

public abstract class PrepaidCard {
	private int cardNo;
	private double availableBalance;
	private double swipeLimit;

	abstract boolean swipeCard(double amount);
	
	public void rechargeCard(double amount) {
		this.availableBalance=this.availableBalance+amount;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}

	@Override
	public String toString() {
		return "PrepaidCard [cardNo=" + cardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}

}
