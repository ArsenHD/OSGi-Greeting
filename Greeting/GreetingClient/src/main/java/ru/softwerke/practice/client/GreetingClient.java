package ru.softwerke.practice.client;

import org.apache.felix.scr.annotations.*;
import ru.softwerke.practice.greeting.Greeting;

@SuppressWarnings("deprecation")
@Component(name = "Greeting-Client")
public class GreetingClient {

    /**
     * Instance of {@link Greeting} service
     *
     * This field is managed by the Service Component Runtime
     * and contains an available {@link Greeting} service instance if
     * there is one
     */
    @Reference(policy = ReferencePolicy.DYNAMIC)
    private volatile Greeting greetingServiceInstance;

    @Activate
    public synchronized void greet() {
        greetingServiceInstance.greet();
    }

    @Deactivate
    public synchronized void goodbye() {
        greetingServiceInstance.goodbye();
    }
}
