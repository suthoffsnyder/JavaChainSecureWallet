package com.javachain.wallet;

import java.security.MessageDigest;

public class HashTool {
    public static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            return HexFormat.encodeHexString(hash).toLowerCase();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
