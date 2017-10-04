package MainController.convertJavaObjToJSON.controller;

import MainController.convertJavaObjToJSON.POJO.User;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile = "user.json";

    public static void toJSON(User user) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(baseFile), user);
            System.out.println("json created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static User toJavaObject() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File(baseFile), User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
