package com.example.voting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingController {

    @GetMapping("/vote")
    public String vote() {
        return "Vote Recorded Successfully";
    }
}