package io.arrogantprogrammer;

import io.quarkus.vertx.ConsumeEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingLogger {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingLogger.class);

    @ConsumeEvent("greetings")
    public void onAddGreeting(String greeting) {

        LOGGER.info("Greeting received: {}", greeting);
    }
}
