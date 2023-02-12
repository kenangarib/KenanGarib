package az.coder.task1.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        ArrayList<Users> members = new ArrayList<>();
        members.add(new Users("Jiu","Kim",29));
        members.add(new Users("Sua","Kim",29));
        members.add(new Users("Siyeon","Lee",28));
        members.add(new Users("Han","Dong",27));
        members.add(new Users("Yoohyeon","Kim",26));
        members.add(new Users("Dami","Lee",26));
        members.add(new Users("Gahyeon","Lee",25));

        List<Users> newMembers = members.stream().filter(a -> a.age > 26).collect(Collectors.toList());
        newMembers.forEach(Users::toString);
    }
}
