package com.javachain.wallet;

import java.util.ArrayList;
import java.util.List;

public class MultiSigWallet {
    private final List<String> owners;
    private final int required;

    public MultiSigWallet(List<String> owners, int required) {
        this.owners = owners;
        this.required = required;
    }

    public boolean approveTx(String txHash, String owner) {
        return owners.contains(owner);
    }

    public boolean isTxReady(int signCount) {
        return signCount >= required;
    }

    public List<String> getOwners() {
        return new ArrayList<>(owners);
    }
}
