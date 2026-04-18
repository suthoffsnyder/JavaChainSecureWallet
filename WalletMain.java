package com.javachain.wallet;

public class WalletMain {
    public static void main(String[] args) throws Exception {
        WalletManager manager = new WalletManager();
        manager.createNewWallet();

        WalletKeyPair wallet = manager.getWallet();
        System.out.println("钱包地址: " + wallet.getAddress());

        WalletTransaction tx = manager.createTransaction("0x1234567890", 10.0);
        manager.signTransaction(tx);

        System.out.println("交易哈希: " + tx.getTxHash());
        System.out.println("交易有效: " + tx.isValid());
    }
}
