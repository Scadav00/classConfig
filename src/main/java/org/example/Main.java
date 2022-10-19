package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[]args){
        System.out.println("Welcome to Gson 02-Nested Object");

         serializeBoxesNested();
        deserializeBoxesNested();
        }
        private static void serializeBoxesNested() {
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
    private static void deserializedBoxesNested(){


    }
}
