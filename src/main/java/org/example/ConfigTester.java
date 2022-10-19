package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.awt.print.Book;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ConfigTester {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to gson");

//        serializeConfigSimple();
        deserializeConfigSimple();

    }

    private static void serializeConfigSimple() {

    ConfigSimple config = new ConfigSimple(
            "0.0.0.0",
            8051,
            true,
            "KBA - Dashboard"
    );
    Gson gson = new Gson();
    String json = gson.toJson(config);

    }

    private static void deserializeConfigSimple() {
        String configJson = "{'host':'0.0.0.0','port':8051,'debug':true,'title':'KBA - Dashboard'}";

        Gson gson = new Gson();
        ConfigSimple configSimple= gson.fromJson(configJson, ConfigSimple.class);

    }

}