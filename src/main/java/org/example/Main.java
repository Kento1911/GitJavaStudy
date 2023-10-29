package org.example;

import org.example.entity.XmlTestReader;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        XmlTestReader reader = new XmlTestReader();
        reader.nodeReader(Paths.get("/Users/sakaguchitaketo/Documents/InteliJ-java/JavaPlactice/src/main/resources/personal_infomation.xml").toFile());
    }
}