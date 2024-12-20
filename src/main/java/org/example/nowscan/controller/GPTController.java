package org.example.nowscan.controller;

import lombok.RequiredArgsConstructor;
import org.example.nowscan.dto.GPTReq;
import org.example.nowscan.dto.GPTRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/gpt")
@RequiredArgsConstructor
public class GPTController {

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.uri}")
    private String apiURI;

    private final RestTemplate template;

    @GetMapping("/chat")
    public String test(@RequestParam String prompt) {
        return getResponse(prompt);
    }

    private String getResponse(String prompt) {
        GPTReq gptReq = new GPTReq(model, makeTranslatePrompt(prompt));
        GPTRes response = template.postForObject(apiURI, gptReq, GPTRes.class);
        return response.getChoices().get(0).getMessage().content();
    }

    private String makeTranslatePrompt(String str) {
        return "다음을 한글로 번역해줘. " + str;
    }

}
