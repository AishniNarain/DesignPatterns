package Builder;


class User{

    private final String UserId;
    private final String UserName;
    private final String EmailId;

    private User(UserBuilder builder){
        this.UserId = builder.UserId;
        this.UserName = builder.UserName;
        this.EmailId = builder.EmailId;
    }
    
    public String getUserId() {
        return UserId;
    }

    
    public String getUserName() {
        return UserName;
    }

    
    public String getEmailId() {
        return EmailId;
    }

    // Inner class to create object

    @Override
    public String toString(){
        return this.UserName + " : " + this.EmailId + " : " + this.UserId;
    }
    static class UserBuilder{

        private String UserId;
        private String UserName;
        private String EmailId;
    

        public UserBuilder(){
            
        }

        public static UserBuilder builder(){
            return new UserBuilder();
        }
    
    public UserBuilder setUserId(String UserId) {
        this.UserId = UserId;
        return this;
    }

    
    public UserBuilder setUserName(String UserName) {
        this.UserName = UserName;
        return this;
    }

    
    public UserBuilder setEmailId(String EmailId) {
        this.EmailId = EmailId;
        return this;
    }

    public User build(){
        User user = new User(this);
        return user;
    }
    }
}