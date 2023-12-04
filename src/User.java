public class User {
    private String username;
    private String password;

    public User(String u, String p){
        this.username = u;
        this.password = p;
    }
    public boolean authenticate(String p){
        return this.password.equals(p);
    }
    public String getUsername(){
        return username;
    }
}
