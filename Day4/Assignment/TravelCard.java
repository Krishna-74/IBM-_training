package inherit;

public class TravelCard extends PrepaidCard {
	private double rewardPoint;
	private int count;

	public double getRewardPoint() {
		return rewardPoint;
	}

	public int getCount() {
		return count;
	}

	private double calculateRewardPoint(double amount) {
		double count = amount / 100;
		rewardPoint = count * 5;
		return rewardPoint;
	}

	@Override
	boolean swipeCard(double amount) {
		count++;
		double rupee = amount * 60;
		double charges = (rupee * 5) / 100;
		rupee = rupee + charges;
		double balance = getAvailableBalance();
		if ( balance> rupee && count<= getSwipeLimit() ) {
			balance = balance - rupee;
			System.out.println("Withdraw amount " + rupee + " and Charges " + charges);
			calculateRewardPoint(rupee);
			setAvailableBalance(balance);
			return true;
		}
		return false;
	}

}
