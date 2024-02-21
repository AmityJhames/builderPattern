package builderPattern;

public class ECApp {
    public static void main(String[] args) {
        User accountOne = new User.UserBuilder()

                .lastName("Altobano")
                .firstName("Recile")
                .email("twofour5678@gmail.com")
                .address("Botolan, Zambales")
                .phone("0923 635 4981")
                .age(21)
                .build();

        System.out.println(accountOne);

    }
}
