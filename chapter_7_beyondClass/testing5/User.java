package testing5;

public record User(String userName, String email) {
    
    // both canonical and compact constructor can be commented and the User can still be created. 

    // canoical constructor
    /* 
    public User(String userName, String email) {
        if (userName == null || email == null) {
            throw new IllegalArgumentException("Username and email cannot be null.");
        }
        this.userName = userName.trim();
        this.email = email.toLowerCase();
    }
    */
    
    // compact constructor
    public User {
        if (userName == null || email == null) {
            throw new IllegalArgumentException("UserName and email cannot be null.");
        }
        userName = userName.trim();
        email = email.toLowerCase();
    }
    
    // overloaded constructor
    public User(String firstName, String lastName, String email) {
        String userNameTrim = firstName.trim() + ' ' + lastName.trim();
        this(userNameTrim, email.toLowerCase());
    }

}
