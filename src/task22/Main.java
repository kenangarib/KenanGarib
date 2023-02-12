package az.coder.task1.task22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(1,"Kenan", "Garib", LocalDate.of(2000,2,29),10.3));
        users.add(new User(2,"Ronaldo", "Cristiano", LocalDate.of(1985,2,4),5.6));
        users.add(new User(3,"Robert", "Junior", LocalDate.of(1995,7,8),55.5));
        users.add(new User(4,"Scarlett", "Johanson", LocalDate.of(1988,4,2),105.5));
        users.add(new User(5,"Evans", "Chris", LocalDate.of(2008,12,13),205.5));

//        Set<Card> userCards = new TreeSet<>();
//        userCards.add(new Card("1234 5678 9876 5432",users.get(0).name + " " + users.get(0).surName, LocalDate.now().plusYears(3), 196 ));
//        userCards.add(new Card("3532 5558 9446 8832",users.get(1).name + " " + users.get(1).surName, LocalDate.now().plusYears(3), 230 ));
//        userCards.add(new Card("1234 8888 6666 5432",users.get(2).name + " " + users.get(2).surName, LocalDate.now().plusYears(3), 879 ));
//        userCards.add(new Card("8896 5563 9876 5432",users.get(3).name + " " + users.get(3).surName, LocalDate.now().plusYears(3), 100 ));
//        userCards.add(new Card("5426 5678 4445 5432",users.get(4).name + " " + users.get(4).surName, LocalDate.now().plusYears(3), 197 ));
//        userCards.add(new Card("3254 8456 9876 9963",users.get(5).name + " " + users.get(5).surName, LocalDate.now().plusYears(3), 665 ));

        ArrayList<User> list = new ArrayList<>();
        users.stream().filter(a -> a.paidAmount>20 && a.birthdate.plusYears(18).isBefore(LocalDate.now())).forEach(list::add);

        for (User user:list) {
            Random random = new Random();
            int lastFour = random.nextInt(8999)+1000;
            new Card("1234 5556 8842" + lastFour, user.name + " " + user.surName,LocalDate.now().plusYears(5),new Random().nextInt(899)+100);
        }





    }
}
