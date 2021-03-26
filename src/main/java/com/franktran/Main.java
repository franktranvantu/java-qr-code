package com.franktran;

public class Main {

    public static void main(String[] args) throws Exception {
        String username = "frank";
        String password = "frank123";
        String text = String.format("%s:%s", username, password);

        String path = "demo.png";

        String charset = "UTF-8";

        QRCode.createQR(text, path, charset, 200, 200);
        System.out.println("QR Code Generated!!! ");
        String input = QRCode.readQR(path);
        System.out.println(input);
    }
}
