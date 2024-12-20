package org.example.nowscan.service;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class HashAdvice {

    // ID 생성 메서드
    public String getnerateHash(String largeText) {
        // 문자열의 앞 30글자를 추출
        String textToHash = largeText.substring(0, Math.min(30, largeText.length()));

        // SHA-256 해시 함수 적용
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        byte[] encodedHash = digest.digest(textToHash.getBytes(StandardCharsets.UTF_8));

        // 해시값을 16진수 문자열로 변환
        return bytesToHex(encodedHash);
    }

    // 바이트 배열을 16진수 문자열로 변환하는 메서드
    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = String.format("%02x", b);
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
