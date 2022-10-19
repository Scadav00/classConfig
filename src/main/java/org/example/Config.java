package org.example;

public class Config {

    ConfigPlotly plotly;
    ConfigEs es;
    ConfigNas nas;


    private class ConfigPlotly {
        private String host;
        private int port;
        private boolean debug;
        private String title;

        private class Boxes {
            private String name1;
            private String name2;
            private String name3;
            private String name4;
        }

    }

    private class ConfigEs {
        private String host;
        private int port;

        private class Srv {
            private String index;
            private String countQuery;
        }

        private class Gw{}
        private class Fw{}

    }

    private class ConfigNas{
        private String host;
        private String port;
        private String user;
        private String password;

        private class Storage{
            private int limit_percentage;
        }
    }
}
