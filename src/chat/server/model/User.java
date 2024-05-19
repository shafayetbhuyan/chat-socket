package chat.server.model;

public class User {

   private String id;
   private String userName;
   private String name;

    public User() {
    }

    public User(String id, String userName, String name) {
        this.id = id;
        this.userName = userName;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
