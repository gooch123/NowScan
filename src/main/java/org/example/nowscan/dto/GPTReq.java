package org.example.nowscan.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GPTReq {

    private String model;
    private List<Message> messages;

    public GPTReq(String model, String prompt) {
        this.model = model;
        this.messages = new ArrayList<>();
        this.messages.add(new Message("user", prompt));
    }
}
