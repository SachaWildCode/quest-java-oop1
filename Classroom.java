public class Classroom {
    public static void main(String[] args) {
        Wilder john = new Wilder("John", true);
        Wilder doe = new Wilder("Doe", false);
        System.out.println(john.whoami());
        System.out.println(doe.whoami());
    }
}
