package com.sysops.nicolaslimorte;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloWorldTest {

    @Test
    public void should_return_hello_world(){
        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.helloWorld();

        assertThatgit init(result).isEqualTo("Hello World");
    }
}
