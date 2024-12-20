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

    public GPTResponse saveResponse(String body) {
        return gptRepository.save(new GPTResponse(
                hashAdvice.getnerateHash(body), body
        ));
    }

    public GPTResponse findResponse(String body) {
        return gptRepository.findById(hashAdvice.getnerateHash(body)).orElseThrow(
                RuntimeException::new);
    }

}
