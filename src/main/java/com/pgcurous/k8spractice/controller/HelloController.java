package com.pgcurous.k8spractice.controller;

import com.pgcurous.k8spractice.pojo.Kubernetes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Value("${pgcurious.k8s-practice.welcome-message}")
    private String welcome;

    @GetMapping("/kubernetes")
    public Kubernetes kubernetes () {
        log.info("Test started");
        System.out.println("Log testing with sysout");
        Kubernetes kubernetes = new Kubernetes();
        kubernetes.setName("k8s-practice");
        kubernetes.setCloud("GCP");
        kubernetes.setType("It is not managed by GCP.");
        kubernetes.setWelcomeMessage(welcome);
        return kubernetes;
    }
}
