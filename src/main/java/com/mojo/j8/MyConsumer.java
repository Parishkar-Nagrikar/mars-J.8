package com.mojo.j8;

import java.util.function.Consumer;

//Consumer implementation that can be reused
public class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        //System.out.println("Consumer impl Value::"+t);
    }
}