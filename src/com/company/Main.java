package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    //CIPHER TRANSPOSITION BASIC//
    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);

        //input text//
        System.out.print("Masukkan teks: ");
        text = scanner.nextLine();
        String encryptedText = encryption(text);
        String decryptedText = decryption(encryptedText);
        System.out.println("Text yang dienkripsi:" + encryptedText);
        System.out.println("Text yang didekripsi:" + decryptedText);
    }

    public static String encryption(String text){
        String textEncryption = ""; //untuk menampung text setelah enkripsi
        char[] textInChar = text.toLowerCase(Locale.ROOT).toCharArray();
        for (char a : textInChar) {
            int asciiofA = (int) a;
            int encryptionAscii = asciiofA + 5;
            if (encryptionAscii > 122){
                encryptionAscii -= 26;
            }
            char charEncryption = (char) encryptionAscii;
            textEncryption += charEncryption;
        }
        return textEncryption;
    }

    public static String decryption(String encryptedText){
        String textDecryption = ""; //untuk menampung text setelah dekripsi
        char[] textInChar = encryptedText.toCharArray();
        for (char a : textInChar) {
            int asciiofA = (int) a;
            int decryptionAscii = asciiofA - 5;
            if (decryptionAscii < 97){
                decryptionAscii += 26;
            }
            char charEncryption = (char) decryptionAscii;
            textDecryption += charEncryption;
        }
        return textDecryption;
    }
}
