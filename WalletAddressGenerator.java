package com.javachain.wallet;

public class WalletAddressGenerator {
    public static String generateAddress(String publicKey) {
        String sha256 = HashTool.sha256(publicKey);
        String address = "0x" + sha256.substring(24, 64);
        return address.toLowerCase();
    }
}
