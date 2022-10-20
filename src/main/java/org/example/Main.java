package org.example;

import com.google.gson.Gson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[]args) throws Exception {
        System.out.println("Welcome to Gson 02-Nested Object");

//         serializeConfigNested();
        deserializeConfigNested();
        }
        private static void serializeConfigNested() {
            Plotly configSimple = new Plotly(
                    "0.0.0.0",
                    8051,
                    true,
                    "KBA-Dashboard"
            );

            Boxes boxes = new Boxes("1","2","3","4");

           // Gson gson = new Gson();
            //pimple code with Gson
            String json = new Gson().toJson(boxes);
    }
    private static void deserializeConfigNested() throws Exception {

        String file = "/home/ds/IdeaProjects/ClassConfig/src/main/java/org/example/Config.Json";
        String jsonConfig = readFileAsString(file);

        Config config = new Gson().fromJson(jsonConfig, Config.class);

    }

    public static String readFileAsString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
