package com.example.demo.model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {


    public List<Doctor> executeParseDoctor(){
        List<Doctor> doctorList = new ArrayList<>();
        try {
            File inputFile = new File("src/main/resources/data_doctor.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
            } catch (ParserConfigurationException e1) {
                e1.printStackTrace();
            }
            Document doc = null;
            try {
                doc = dBuilder.parse(inputFile);
            } catch (SAXException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("doctor");
            System.out.println("----------------------------");


            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("name:  "
                            + eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());
                    String name = eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent();

                    System.out.println("specialization : "
                            + eElement
                            .getElementsByTagName("specialization")
                            .item(0)
                            .getTextContent());
                    String specialization = eElement
                            .getElementsByTagName("specialization")
                            .item(0)
                            .getTextContent();

                    System.out.println("gradulationYear : "
                            + eElement
                            .getElementsByTagName("gradulationYear")
                            .item(0)
                            .getTextContent());
                    String gradulationYear = eElement
                            .getElementsByTagName("gradulationYear")
                            .item(0)
                            .getTextContent();

                    System.out.println("profilePicture : "
                            + eElement
                            .getElementsByTagName("profilePicture")
                            .item(0)
                            .getTextContent());
                    String profilePicture = eElement
                            .getElementsByTagName("profilePicture")
                            .item(0)
                            .getTextContent();

                    System.out.println("medicalUnit : "
                            + eElement
                            .getElementsByTagName("medicalUnit")
                            .item(0)
                            .getTextContent());
                    String medicalUnit = eElement
                            .getElementsByTagName("medicalUnit")
                            .item(0)
                            .getTextContent();

                    doctorList.add(new Doctor(name, specialization, gradulationYear, profilePicture, medicalUnit ));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctorList;
    }

    public List<MedicalUnit> executeParseMedicalUnnit(){
            List<MedicalUnit> medicalUnitList = new ArrayList<>();
        try {
            File inputFile = new File("src/main/resources/data_medical_unit.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = null;
            try {
                dBuilder = dbFactory.newDocumentBuilder();
            } catch (ParserConfigurationException e1) {
                e1.printStackTrace();
            }
            Document doc = null;
            try {
                doc = dBuilder.parse(inputFile);
            } catch (SAXException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("medicalunit");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    System.out.println("name : "
                            + eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent());
                    String name = eElement
                            .getElementsByTagName("name")
                            .item(0)
                            .getTextContent();

                    System.out.println("type : "
                            + eElement
                            .getElementsByTagName("type")
                            .item(0)
                            .getTextContent());
                    String type =  eElement
                            .getElementsByTagName("type")
                            .item(0)
                            .getTextContent();

                    System.out.println("location : "
                            + eElement
                            .getElementsByTagName("location")
                            .item(0)
                            .getTextContent());
                    String location = eElement
                            .getElementsByTagName("location")
                            .item(0)
                            .getTextContent();

                    System.out.println("logo : "
                            + eElement
                            .getElementsByTagName("logo")
                            .item(0)
                            .getTextContent());
                    String logo = eElement
                            .getElementsByTagName("logo")
                            .item(0)
                            .getTextContent();
                    medicalUnitList.add(new MedicalUnit(name, type, location, logo ));

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return medicalUnitList;
    }

}

