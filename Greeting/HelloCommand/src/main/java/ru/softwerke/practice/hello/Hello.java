package ru.softwerke.practice.hello;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

@SuppressWarnings("deprecation")
@Component(name = "Hello Gogo command")
@Service(value = Object.class)
@Properties({
        @Property(name = "osgi.command.scope", value = "practice"),
        @Property(name = "osgi.command.function", value = "hello")
})
public class Hello {

    public void hello(String param) {
        System.out.println("Hello, " + param);
    }
}
