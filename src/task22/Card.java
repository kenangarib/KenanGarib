package az.coder.task1.task22;

import java.time.LocalDate;

public class Card {
    String cardNumber;
    String holderName;
    LocalDate exp;
    Integer cvv;


    public Card(String cardNumber, String holderName, LocalDate exp, Integer cvv) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.exp = exp;
        this.cvv = cvv;
    }



    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public LocalDate getExp() {
        return exp;
    }

    public void setExp(LocalDate exp) {
        this.exp = exp;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }


}
