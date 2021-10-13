/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuela.arep.calculadoraparcial;
/**
 *
 * @author Javier
 */
import org.json.JSONObject;
import spark.Request;
import spark.Response;
import static spark.Spark.*;
public class sparkcalculadora {
    public static void main(String args[])  //static method  
    {  
        port(getPort());
        /*
        {
                "operation": "cos",

                "input":  3.141592,

                "output":  -0.999999

               };
        */
        get("/tan", "application/json", (req, res) -> tangenteCalc(req, res));
        get("/exp", "application/json", (req, res) -> exponencialCalc(req, res)); 
    }     
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

    private static JSONObject exponencialCalc(Request req, Response res) {
        res.type("application/json");
        String valor = req.queryParams("value");
        JSONObject json =  new JSONObject();
        json.put("operacion", "exp");
        json.put("input", valor);
        json.put("output", Math.pow(2.71828,Integer.parseInt(valor)));
        return json;
    }

    private static JSONObject tangenteCalc(Request req, Response res) {
        
        res.type("application/json");
        String valor = req.queryParams("value");
        JSONObject json =  new JSONObject();
        json.put("operacion", "tan");
        json.put("input", valor);
        json.put("output", Math.tan(Integer.parseInt(valor)));
        return json; 
    }
}
