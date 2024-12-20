package org.example.nowscan.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.nowscan.dto.GPTReq;
import org.example.nowscan.dto.GPTRes;
import org.example.nowscan.dto.TranslateRes;
import org.example.nowscan.entity.GPTResponse;
import org.example.nowscan.service.GPTService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/gpt")
@RequiredArgsConstructor
@Slf4j
public class GPTController {

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.uri}")
    private String apiURI;

    private final RestTemplate template;
    private final GPTService gptService;

    @GetMapping("/chat")
    public ResponseEntity<?> test(@RequestParam String prompt) {
        GPTResponse entity = null;
        try {
            entity = gptService.findResponse(prompt);
            log.info("find Entity");
        } catch (RuntimeException e) {
            entity = gptService.saveResponse(prompt,getTranslatePrompt(prompt));
            log.info("Entity Save");
        }
        return new ResponseEntity<>(new TranslateRes(
                entity.getBody()
        ), HttpStatus.OK);
    }

    private String getTranslatePrompt(String prompt) {
        GPTReq gptReq = new GPTReq(model, makeTranslatePrompt(prompt));
        GPTRes response = template.postForObject(apiURI, gptReq, GPTRes.class);
        return response.getChoices().get(0).getMessage().content();
    }

    private String makeTranslatePrompt(String str) {
        return "다음을 한글로 번역해줘. " + str;
    }

}
