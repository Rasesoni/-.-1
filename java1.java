public class Main {
    public static void main(String[] args) {
        String input = "AaBbCcDd";
        String up = input.replaceAll("[^A-Z]", "");
        String low = input.replaceAll("[^a-z]", "");
        System.out.println("big_letters" + up);
        System.out.println("smal_lett" + low);
    }
}
