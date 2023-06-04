package com.tarasiuk.soundify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${application.resource-service.name}")
public interface ResourceServiceClient {

    @Retryable(exceptionExpression = "message.contains('timeout')", maxAttempts = 4)
    @GetMapping("resources/{id}")
    byte[] getAudio(@PathVariable("id") Integer id);

}
