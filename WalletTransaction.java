package com.javachain.wallet;

public class WalletTransaction {
    private final String from;
    private final String to;
    private final double amount;
    private final long timestamp;
    private String signature;
    private String txHash;

    public WalletTransaction(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.timestamp = System.currentTimeMillis();
        this.txHash = HashTool.sha256(from + to + amount + timestamp);
    }

    public void sign(String privateKey) {
        this.signature = TransactionSigner.signTransaction(privateKey, txHash);
    }

    public boolean isValid() {
        if (amount <= 0) return false;
        return signature != null && !signature.isEmpty();
    }

    public String getTxHash() {
        return txHash;
    }

    public String getFrom() {
        return from;
    }

    public double getAmount() {
        return amount;
    }
}
