package org.example.nowscan.service;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Component
public class HashAdvice {

    public String generateHash(String largeText) {
        // 문자열의 앞 20글자 추출
        String frontText = largeText.substring(0, Math.min(20, largeText.length()));

        // 문자열의 뒷 20글자 추출
        String backText = largeText.substring(Math.max(0, largeText.length() - 20));

        // 앞 20글자와 뒷 20글자를 합침
        String textToHash = frontText + backText;

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
