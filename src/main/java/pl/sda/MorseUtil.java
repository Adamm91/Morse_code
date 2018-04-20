package pl.sda;

public class MorseUtil {
    public static  String encodeMorse(String textToEncode) {
        MorseEncoder morseEncoder = new MorseEncoder();
        return morseEncoder.encode(textToEncode);
    }

    public static String decodeMorse(String textToDecode) {
        MorseDecoder morseDecoder = new MorseDecoder();
        return morseDecoder.decode(textToDecode);
    }
}
