public class user {
    private String username;
    private String password;

    user(String uname, String pword){
        this.username = uname;
        this.password = pword;
    }

    public String getUsername(){
        return this.username;
    }
}
