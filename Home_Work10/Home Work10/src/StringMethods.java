public class StringMethods {

    public static void main(String[] args) {
        String hello = "     hello world";
        hello = hello.trim();
        String repl = hello.replace("world", "home");
        System.out.println(repl);
        System.out.println(hello);
    }
}
