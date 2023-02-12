package az.coder.task1.task23;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("Kenan Garib", "1234 5678 9876 6653", 0.0, LocalDate.now().plusYears(5)));
        cards.add(new Card("Cristiano Ronaldo", "9856 2378 4576 6673", 100.0, LocalDate.now().plusYears(5)));
        cards.add(new Card("Robert Downer Junior", "1234 5344 4564 4654", 855.0, LocalDate.now().plusYears(5)));
        cards.add(new Card("Scarlett Johannson", "1345 5348 6666 6999", 989.0, LocalDate.now().plusYears(5)));


        Map<String, Double> cardMap = new HashMap<>();
        cardMap.put(cards.get(0).cardNumber, cards.get(0).balance);
        cardMap.put(cards.get(1).cardNumber, cards.get(1).balance);
        cardMap.put(cards.get(2).cardNumber, cards.get(2).balance);
        cardMap.put(cards.get(3).cardNumber, cards.get(3).balance);

        Double globalBalance = 0.0;
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(50);
                for (Card card : cards) {
                    card.setBalance(cardMap.get(card.cardNumber) + 500);
                    //card.getBalance();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(50);
                for (int i = 0; i < cards.size(); i++) {
                    System.out.println(cards.get(i).holderName);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread.start();
        thread1.start();


    }


}
