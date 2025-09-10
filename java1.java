public class Main {
    public static void main(String[] args) {
        String input = "AaBbCcDd";
        String upperCaseLetters = input.replaceAll("[^A-Z]", "");
        String lowerCaseLetters = input.replaceAll("[^a-z]", "");
        System.out.println("Заглавные буквы:" + upperCaseLetters);
        System.out.println("Строчные буквы:" + lowerCaseLetters);
    }
}
