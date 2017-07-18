import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.*;
public class readxml {
 
	public static void main(String argv[]) {
 
    try {
 
    	File fXmlFile = new File("/home/administrator/Desktop/Naive_Bayes/simple.xml");
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
    	Document doc = dBuilder.parse(fXmlFile);
 
    		//doc.getDocumentElement().normalize();
    		
    	BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
 
    	NodeList nList = doc.getElementsByTagName("row");
 	
    	float totalsamples=nList.getLength();
    	
                            System.out.println("TOTAL Samples"+totalsamples);
                            	
    	float play=0,noplay=0;
    	float ol=0,t=0,h=0,w=0;
    	float on=0,t1=0,h1=0,w1=0;
    	float pp,np;
    	
                        	System.out.println("Enter the Work_type:	");
                        	String s = b.readLine();
                        	System.out.println("Enter the Age:	");
                        	String s1 = b.readLine();
                        	System.out.println("Enter the Qualification:	");
                        	String s2 = b.readLine();
                        	System.out.println("Enter the Experience:	");
                        	String s3 = b.readLine();
                        	
    	for (int temp = 0; temp < nList.getLength(); temp++) {
 
    		Node nNode = nList.item(temp);
 
    			//System.out.println("\nCurrent Element :" + nNode.getNodeName());
 
    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
    			Element eElement = (Element) nNode;
    			
    			String class1=eElement.getElementsByTagName("class").item(0).getTextContent();
    		Stringoutlook=eElement.getElementsByTagName("outlook").item(0).getTextContent();
    			String temp1=eElement.getElementsByTagName("temp").item(0).getTextContent();
    		Stringhumidity=eElement.getElementsByTagName("humidity").item(0).getTextContent();
    			String windy=eElement.getElementsByTagName("windy").item(0).getTextContent();
    			if(class1.equals("p"))
    				play++;
    			else noplay++;
    			if(outlook.equals(s) && class1.equals("p"))
    				ol++;
    			else if(outlook.equals(s) && class1.equals("n"))
    				on++;
    			if(temp1.equals(s1) && class1.equals("p"))
    				t++;
    			else if(temp1.equals(s1) && class1.equals("n"))
    				t1++;
    			if(humidity.equals(s2) && class1.equals("p"))
    				h++;
    			else if(humidity.equals(s2) && class1.equals("n"))
    				h1++;
    			if(windy.equals(s3) && class1.equals("p"))
    				w++;
    			else if(windy.equals(s3) && class1.equals("n"))
    				w1++;
    		}
    	}
		System.out.println("play: "+play);
		System.out.println("can't play: "+noplay);
		System.out.println("outlook: "+ol);
		System.out.println("temp: "+t);
		System.out.println("humidity: "+h);
		System.out.println("windy: "+w);
		
		pp = (ol/play)*(t/play)*(h/play)*(w/play)*(play/totalsamples);
		
		np = (on/noplay)*(t1/noplay)*(h1/noplay)*(w1/noplay)*(noplay/totalsamples);
		
		
		if(pp>np)
		{
			System.out.println(" you can play: ");
		}
		else
			System.out.println("you can't play: ");
		
    } catch (Exception e) {
	e.printStackTrace();
    }
	}
}
