package com.github.devtoolscourse.apiary;

import module dt.jpms.apiary.core;
import module java.base;

public class Runner {
    static Server server;

    static {
        try {
            server = new Server(8888);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /**
         * To add an entrypoint use server.handler(ENTRYPOINT, HANDLER) method
         */
        // TODO: Load all Handlers here
    }

    static void main() {
        server.start();
    }
}
