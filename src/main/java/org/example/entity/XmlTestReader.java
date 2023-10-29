package org.example.entity;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class XmlTestReader {
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    List<String> propertiesList = new ArrayList<>();

    public void nodeReader(File xmlPath, String ProertiesPath) {
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlPath);
            Element infomations = document.getDocumentElement();
            NodeList nodeList = infomations.getElementsByTagName("personal-infomation");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element infomation = (Element) nodeList.item(i);
                NodeList childlen = infomation.getChildNodes();
//                System.out.println(infomation.getNodeName() + ":" + infomation.getTextContent());
                for (int j = 0; j < childlen.getLength(); j++) {
                    Node innerData = childlen.item(j);
                    if(innerData instanceof Element innerDataElement){
                        System.out.println(innerDataElement.getNodeName() + ":" + innerDataElement.getTextContent());
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
