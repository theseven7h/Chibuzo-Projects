public class TestDriller {
	static int	calculateCopiesPrice(int noOfCopies) {
		int pricePerCopy = 0;
		if (noOfCopies >= 1 && noOfCopies <= 4) pricePerCopy = 2000;
		else if (noOfCopies >= 5 && noOfCopies <= 9) pricePerCopy = 1800;
		else if (noOfCopies >= 10 && noOfCopies <= 29) pricePerCopy = 1600;
		else if (noOfCopies >= 30 && noOfCopies <= 49) pricePerCopy = 1500;
		else if (noOfCopies >= 50 && noOfCopies <= 99) pricePerCopy = 1300;
		else if (noOfCopies >= 100 && noOfCopies <= 199) pricePerCopy = 1200;
		else if (noOfCopies >= 200 && noOfCopies <= 499) pricePerCopy = 1100;
		else if (noOfCopies >= 500) pricePerCopy = 1000;
		return noOfCopies * pricePerCopy;
	}	
}