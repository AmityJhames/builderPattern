package builderPattern;

public class User {

    protected final String lastName;
    protected final String firstName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;
    private User(UserBuilder builder){

        this.lastName= builder.lastName;
        this.firstName= builder.firstName;
        this.email= builder.email;
        this.address= builder.address;
        this.phone= builder.phone;
        this.age= builder.age;
    }
    @Override
    public String toString() {
        return "User:" +
                "\nLast Name: " + lastName +
                "\nFirst Name: " + firstName +
                "\nEmail: " + email  +
                "\nAddress: " + address +
                "\nPhone #: " + phone  +
                "\nAge: " + age;
    }

    protected static class UserBuilder{

        private String lastName;
        private String firstName;
        private String email;
        private String address;
        private String phone;
        private int age;


        public UserBuilder lastName(String lastName){
            this.lastName= lastName;
            return this;
        }
        public UserBuilder firstName(String firstName){
            this.firstName= firstName;
            return this;
        }
        public UserBuilder address(String address){
            this.address= address;
            return this;
        }
        public UserBuilder email(String email){
            this.email= email;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone= phone;
            return this;
        }
        public UserBuilder age(int age){
            this.age= age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

}
