package chat.client.model;

import chat.server.model.User;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private static List<User> users;

    public static List<User> getUsers() {
        return users;
    }

    public static void setUser(User user) {
        if (Users.getUsers() == null){
            List<User> users = new ArrayList<>();
            users.add(user);
            Users.setUsers(users);
        }else {
            Users.getUsers().add(user);
        }
    }

    public static void setUsers(List<User> users) {
        Users.users = users;
    }

}
