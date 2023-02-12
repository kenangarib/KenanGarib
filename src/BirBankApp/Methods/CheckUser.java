package az.coder.task1.BirBankApp.Methods;

import az.coder.task1.BirBankApp.Exceptions.UserNotFoundException;
import az.coder.task1.BirBankApp.User.User;

import java.util.List;
import java.util.Objects;


public class CheckUser {
    public static void CheckUserMethod(Integer idInput, List<User> list) {

       boolean result=false;

        for (User user : list) {
            if (Objects.equals(user.getId(), idInput)) {
                result=true;
                break;
            }
        }
        if (!result)
            throw new UserNotFoundException();

    }


}








