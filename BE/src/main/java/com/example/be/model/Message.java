package com.example.be.model;

import lombok.*;

@Data
@NoArgsConstructor
public class Message {

    private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
