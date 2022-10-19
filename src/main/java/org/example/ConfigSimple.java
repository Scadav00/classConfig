package org.example;

public class ConfigSimple {
        private String host;
        private int port;
        private boolean debug;
        private String title;

        public ConfigSimple( String host, int port, boolean debug, String title) {
            this.host = host;
            this.port = port;
            this.debug = debug;
            this.title = title;
        }

}
