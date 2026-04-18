package com.javachain.wallet;

public class WalletManager {
    private WalletKeyPair currentWallet;

    public void createNewWallet() throws Exception {
        this.currentWallet = new WalletKeyPair();
        WalletStorage.saveWallet(currentWallet);
    }

    public void loadExistingWallet() throws Exception {
        this.currentWallet = WalletStorage.loadWallet();
    }

    public WalletTransaction createTransaction(String to, double amount) {
        if (currentWallet == null) throw new RuntimeException("No wallet loaded");
        return new WalletTransaction(currentWallet.getAddress(), to, amount);
    }

    public String signTransaction(WalletTransaction tx) {
        tx.sign(currentWallet.getPrivateKey());
        return tx.getTxHash();
    }

    public WalletKeyPair getWallet() {
        return currentWallet;
    }
}
