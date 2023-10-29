package org.example;

import org.example.entity.FuncList;
import org.example.entity.XmlTestReader;

import java.io.*;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.zip.GZIPOutputStream;

public class Main {
    public static void main(String[] args) {
        XmlTestReader reader = new XmlTestReader();
        reader.nodeReader(Paths.get("/Users/sakaguchitaketo/Documents/InteliJ-java/JavaPlactice/src/main/resources/personal_infomation.xml").toFile(),"/Users/sakaguchitaketo/Documents/InteliJ-java/JavaPlactice/src/main/resources/pref.properties");
    }
}