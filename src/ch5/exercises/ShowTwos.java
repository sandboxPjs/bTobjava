package ch5.exercises;

import com.sun.xml.internal.ws.wsdl.writer.document.StartWithExtensionsType;

public class ShowTwos {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    public static void showTwos(int number) {
        int remainder = number;
        String text = "";
        // check factors 2
        while (remainder % 2 == 0) {
            // if exists add text 2 *
            text += "2 * ";
            remainder = remainder / 2;
        }
        // print message
        System.out.printf("%d = %s%d\n", number, text, remainder);
    }
}
