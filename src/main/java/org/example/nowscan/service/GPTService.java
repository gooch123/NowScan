package org.example.nowscan.service;

import lombok.RequiredArgsConstructor;
import org.example.nowscan.entity.GPTResponse;
import org.example.nowscan.repository.GPTRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GPTService {

    private final GPTRepository gptRepository;
    private final HashAdvice hashAdvice;

    public GPTResponse saveResponse(String original, String translate) {
        return gptRepository.save(new GPTResponse(
                hashAdvice.generateHash(original), translate
        ));
    }

    public GPTResponse findResponse(String body) {
        return gptRepository.findById(hashAdvice.generateHash(body)).orElseThrow(
                RuntimeException::new);
    }

}
