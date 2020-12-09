package ru.itsjava.classwork.proxy;

public class main {
    public static void main(String[] args) {
//        User user = new User("");
//        try {
//            user.setName("Darya");
//        } catch (IncorrectUsernameException incorrectUsernameException) {
//            incorrectUsernameException.printStackTrace();
//        }

        UserProxy user = new UserProxy("");
        user.setName("Darya");
    }
}
