package az.coder.task1.task21;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        User users = new User();
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("Kenan", "Garib", LocalDate.of(2000, 2, 29), LocalDate.now().minusMonths(1)));
        userList.add(new User("Cristiano", "Ronaldo", LocalDate.of(1985, 2, 5), LocalDate.now().minusMonths(1)));
        userList.add(new User("Chris", "Evans", LocalDate.of(1982, 3, 11), LocalDate.now().minusMonths(0)));
        userList.add(new User("Angelina", "Jolie", LocalDate.of(1970, 5, 20), LocalDate.now().minusMonths(1)));
        userList.add(new User("Scarlett", "Johannson", LocalDate.of(1975, 9, 28), LocalDate.now().minusMonths(0)));

        Consumer<User> userConsumer=new Consumer<User>() {
            @Override
            public void accept(User user) {
             if (!Objects.equals(user.getExpDate(), LocalDate.now()))  {
                 System.out.println(user.getName());
             }
            }
        };
        userList.forEach(userConsumer);


//        UserExpDate usrIntfc = new UserExpDate() {
//
//
//            @Override
//            public void usr(ArrayList usrlist) {
//                for (User user : usrlist) {
//                    if (Objects.equals(user.getExpDate().minusMonths(0), LocalDate.now()))
//                        System.out.println(user.getName());
//                }
//
//
//
//            }
//        };

/*   public static String usr(List<User> usrlist){
        for (User user: usrlist){
            if (Objects.equals(user.getExpDate().minusMonths(0), LocalDate.now()))
            return user.getName();
        }


       return null;
   }*/


    }
    interface UserExpDate {
         void usr();
    }}

