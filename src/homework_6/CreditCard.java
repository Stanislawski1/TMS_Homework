package homework_6;

public class CreditCard {
    private String creditCardHolder;
    private long creditCardNumber;
    private long currentAmount;






    public CreditCard(String creditCardHolder, long creditCardNumber,
                      long currentAmount){

    this.creditCardHolder = creditCardHolder;
    this.creditCardNumber = creditCardNumber;
    this.currentAmount = currentAmount;
}


    public String getCreditCardInformation(){

        return "Credit Card holder is: " + creditCardHolder + "\n" +
                "Credit Card number is: " + creditCardNumber + "\n" +
                "Current account amount is: " + currentAmount + "\n";




    }

    public void takeCash(long cash){
        this.currentAmount -= cash;
    }

    public void addCash(long cash){
        this.currentAmount += cash;
    }
}
