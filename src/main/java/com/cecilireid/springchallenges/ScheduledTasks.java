package com.cecilireid.springchallenges;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    @Autowired
    public CateringJobRepository cateringJobRepository;

    @Scheduled(fixedRate = 10000)
    public void reportOrderStats() {
        logger.info("Number of orders: " + cateringJobRepository.count());
    }

}
