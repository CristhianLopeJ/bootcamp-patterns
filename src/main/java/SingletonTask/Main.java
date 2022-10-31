package SingletonTask;

public class Main {
    public static void main(String[] args) {
        // First User service Instance
        UserService userService = new UserService();
        userService.printUser();
        // Print the Singleton Location Memory
        System.out.println(userService);

        // Second User Service Instance
        UserService userService2 = new UserService();
        userService2.printUser();
        // Print the Same Singleton Location Memory at the line 8
        System.out.println(userService2);
    }
}
