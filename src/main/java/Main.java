import converter.MorseConverter;

public class Main {
    public static void main(String[] args) {
        MorseConverter converter = new MorseConverter();
        System.out.println(converter.getTextInMorseCode("test1 test2 3"));
        System.out.println(converter.getText("_ . ... _ .____ / _ . ... _ ..___ / ...__"));
    }
}
