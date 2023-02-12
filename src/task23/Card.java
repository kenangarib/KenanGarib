package az.coder.task1.task23;

import java.time.LocalDate;

public class Card {
    String holderName;
    String cardNumber;
    Double balance;
    LocalDate expDate;

    public Card(String holderName, String cardNumber, Double balance, LocalDate expDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.expDate = expDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "holderName='" + holderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", expDate=" + expDate +
                '}';
    }
}
