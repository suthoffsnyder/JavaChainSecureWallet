package com.javachain.wallet;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WalletStorage {
    private static final String PATH = "wallet.dat";

    public static void saveWallet(WalletKeyPair wallet) throws Exception {
        String data = wallet.getAddress() + "|" + wallet.getPublicKey() + "|" + wallet.getPrivateKey();
        try (FileWriter writer = new FileWriter(PATH)) {
            writer.write(data);
        }
    }

    public static WalletKeyPair loadWallet() throws Exception {
        String content = Files.readString(Paths.get(PATH));
        String[] arr = content.split("\\|");
        return new WalletKeyPair() {
            @Override
            public String getAddress() { return arr[0]; }
            @Override
            public String getPublicKey() { return arr[1]; }
            @Override
            public String getPrivateKey() { return arr[2]; }
        };
    }
}
