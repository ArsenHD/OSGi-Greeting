package ru.softwerke.practice.greeting.impl;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import ru.softwerke.practice.greeting.Greeting;

@SuppressWarnings("deprecation")
@Component(name = "Greeting Implementation", configurationPid = "ru.softwerke.practice.greeting.impl")
@Service(value = Greeting.class)
public class GreetingImpl implements Greeting {

    public void greet() {
        System.out.println("Hello, OSGi world!");
    }

    public void goodbye() {
        System.out.println("Goodbye!");
    }
}
