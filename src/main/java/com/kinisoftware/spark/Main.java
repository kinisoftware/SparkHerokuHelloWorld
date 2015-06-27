package com.kinisoftware.spark;

import javax.servlet.http.HttpServlet;

import static spark.Spark.get;
import static spark.SparkBase.port;

public class Main extends HttpServlet {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        if (port != null) {
            port(Integer.parseInt(port));
        }

        get("/hello", (req, res) -> "Hello World");
    }
}
