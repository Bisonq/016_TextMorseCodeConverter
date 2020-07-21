package converter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseConverter {

    private String[] letters;
    private String[] numbers;

    public MorseConverter(){
        this.letters = new String[26];
        this.letters = fillLetterArrayWithSigns(letters);

        this.numbers = new String[10];
        this.numbers = fillNumberArrayWithSigns(numbers);

    }

    private String[] fillLetterArrayWithSigns(String[] letters){
        letters[0] = "._"; //A
        letters[1] = "_..."; //B
        letters[2] = "_._."; //C
        letters[3] = "_.."; //D
        letters[4] = "."; //E
        letters[5] = ".._."; //F
        letters[6] = "__."; //G
        letters[7] = "...."; //H
        letters[8] = ".."; //I
        letters[9] = ".___"; //J
        letters[10] = "_._"; //K
        letters[11] = "._.."; //L
        letters[12] = "__"; //M
        letters[13] = "_."; //N
        letters[14] = "___"; //O
        letters[15] = ".__."; //P
        letters[16] = "__._"; //Q
        letters[17] = "._."; //R
        letters[18] = "..."; //S
        letters[19] = "_"; //T
        letters[20] = ".._"; //U
        letters[21] = "..._"; //V
        letters[22] = ".__"; //W
        letters[23] = "_.._"; //X
        letters[24] = "_.__"; //Y
        letters[25] = "__.."; //Z

        return letters;
    }

    private String[] fillNumberArrayWithSigns(String[] numbers) {
        numbers[0] = "_____"; //0
        numbers[1] = ".____"; //1
        numbers[2] = "..___"; //2
        numbers[3] = "...__"; //3
        numbers[4] = "...._"; //4
        numbers[5] = "....."; //5
        numbers[6] = "_...."; //6
        numbers[7] = "__..."; //7
        numbers[8] = "___.."; //8
        numbers[9] = "____."; //9

        return numbers;
    }

    private boolean isALetter(String s){
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    private boolean isANumber(String s){
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
