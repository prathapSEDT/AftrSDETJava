package com.jacksonapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pojos.Employee;

import java.io.File;
import java.io.IOException;

public class ReadJson {
    public static void main(String[] args) throws IOException {
        File file=new File("src/main/resources/TestData/TestData.json");
        ObjectMapper objectMapper=new ObjectMapper();
        Employee employee=objectMapper.readValue(file, Employee.class);
file=new File("src/main/resources/TestData/output.json");
objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
       objectMapper.writeValue(file,employee);


    }
}
