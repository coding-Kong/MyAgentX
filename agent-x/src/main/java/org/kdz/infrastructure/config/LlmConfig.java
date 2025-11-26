package org.kdz.infrastructure.config;

import org.kdz.domain.llm.service.LlmService;
import org.kdz.infrastructure.integration.llm.closeAI.CloseAILlmService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.HashMap;
import java.util.Map;

/**
 * LLM服务配置
 */
@Configuration
public class LlmConfig {

    @Value("${llm.provider.default:closeAI}")
    private String defaultProvider;

    /**
     * 默认LLM服务
     */
    @Bean
    @Primary
    public LlmService defaultLlmService(CloseAILlmService closeAILlmService) {
        // 直接返回CloseAI服务作为默认服务
        return closeAILlmService;
    }

    /**
     * LLM服务映射
     */
    @Bean
    public Map<String, LlmService> llmServiceMap(CloseAILlmService closeAILlmService) {
        Map<String, LlmService> serviceMap = new HashMap<>();
        // 确保键名与defaultProvider + "LlmService"匹配
        serviceMap.put("closeAILlmService", closeAILlmService);
        return serviceMap;
    }
}

