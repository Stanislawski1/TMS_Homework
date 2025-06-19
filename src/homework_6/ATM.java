package homework_6;

public class ATM {
    public static void main(String[] args) {
        CreditCard[] cards = createCreditCard();
        addCash(cards[0], cards[1], cards[2]);
        takeCash(cards[0], cards[1], cards[2]);
        printAfterDeposit(cards);



    }

    public static CreditCard[] createCreditCard() {

        CreditCard Stanislaw = new CreditCard("Stanislaw Holovnev", 2234411,
                1239);
        Stanislaw.getCreditCardInformation();

        System.out.println("***************First Card Holder***************");

        System.out.println(Stanislaw.getCreditCardInformation());

        System.out.println("***************Second Card Holder***************");

        CreditCard Ivan = new CreditCard("Ivan Ivanov", 22311268,
                12000);
        Ivan.getCreditCardInformation();
        System.out.println(Ivan.getCreditCardInformation());
        System.out.println("***************Third Card Holder***************");

        CreditCard Anastasia = new CreditCard("Anastasia Ivanova", 22345612,
                8800);
        Anastasia.getCreditCardInformation();
        System.out.println(Anastasia.getCreditCardInformation());
        return new CreditCard[]{Stanislaw, Ivan, Anastasia};

    }

    public static void addCash(CreditCard card1, CreditCard card2, CreditCard card3){
    depositToCards(card1, 400);
    depositToCards(card2, 300);
    depositToCards(card3, 0);

    }

    public static void takeCash(CreditCard card1, CreditCard card2, CreditCard card3){
        depositToCards(card1, 0);
        depositToCards(card2, 0);
        depositToCards(card3, -300);

    }

    public static void depositToCards(CreditCard card, long amount){
        if (card != null) {
            card.addCash(amount);
        } else {
            System.out.println("This Card is not exist!");

            card.takeCash(amount);
        }
    }

    public static void printAfterDeposit(CreditCard cards[]){
        System.out.println("\nAfter Deposit: ");
        System.out.println(cards[0].getCreditCardInformation());
        System.out.println(cards[1].getCreditCardInformation());
        System.out.println(cards[2].getCreditCardInformation());
    }

}
