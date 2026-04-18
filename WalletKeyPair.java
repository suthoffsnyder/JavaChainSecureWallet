package com.javachain.wallet;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.ECGenParameterSpec;

public class WalletKeyPair {
    private final String publicKey;
    private final String privateKey;
    private final String address;

    public WalletKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("ECDSA", "BC");
        ECGenParameterSpec spec = new ECGenParameterSpec("secp256r1");
        generator.initialize(spec, new SecureRandom());
        KeyPair keyPair = generator.generateKeyPair();

        this.privateKey = HexFormat.encodeHexString(keyPair.getPrivate().getEncoded());
        this.publicKey = HexFormat.encodeHexString(keyPair.getPublic().getEncoded());
        this.address = WalletAddressGenerator.generateAddress(publicKey);
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getAddress() {
        return address;
    }
}
