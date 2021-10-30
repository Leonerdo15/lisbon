package com.ultimate.lisbon.models.repositories;

import com.ultimate.lisbon.models.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserRepository {

    private static ArrayList<User> users =new ArrayList<>();

    public static void populate(){
        users.add(new User("Leonardo", LocalDate.parse("2002-08-28"), "D", "China", "Homem aventureiro e muito corajoso!!!"));
        users.add( new User("Felipe", LocalDate.parse("1986-05-08"), "S"));
    }

    public static ArrayList<User> getAllUsers(){
        return users;
    }

    // O id começa em 1 mas o array list em zaro como devemos fazer
    public static User getUser(int id){
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public static boolean deleteUser(int id) {
        return users.removeIf((s) -> s.getId() == id);

    }

    public static User addUser(User user){
        users.add(user);
        return user;
    }

}
