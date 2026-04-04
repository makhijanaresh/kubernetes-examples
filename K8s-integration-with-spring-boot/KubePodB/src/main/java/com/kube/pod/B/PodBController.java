package com.kube.pod.B;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PodBController {

    private final RestTemplate restTemplate;
    private final String podABaseUrl;

    public PodBController(RestTemplate restTemplate,
                          @Value("${pod-a.base-url}") String podABaseUrl) {
        this.restTemplate = restTemplate;
        this.podABaseUrl = podABaseUrl;
    }

    @GetMapping("/call-pod-a")
    public String callPodA() {
        String response = restTemplate.getForObject(podABaseUrl + "/hello", String.class);
        return "Response from PodA: " + response;
    }
}
