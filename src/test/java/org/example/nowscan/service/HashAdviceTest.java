package org.example.nowscan.service;

import org.junit.jupiter.api.Test;

class HashAdviceTest {

    HashAdvice hashAdvice = new HashAdvice();

    @Test
    void 해시_테스트() {
        String 해시값_테스트 = hashAdvice.getnerateHash("해시값 테스트");
        System.out.println("해시값_테스트 = " + 해시값_테스트);
    }
}
