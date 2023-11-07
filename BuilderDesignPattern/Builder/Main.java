package Builder;

public class Main {
    
    public static void main(String args[]){

        User user =new User.UserBuilder().setEmailId("aishni@gmail.com").setUserId("UserId123").setUserName("Aishni").build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder().setEmailId("alka@gmail.com").setUserId("UserId456").setUserName("Alka").build();

        System.out.println(user2);
    }
}
