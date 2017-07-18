

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nave_bayes {

    public static void main(String []sean) {

        String csvFile = "/home/administrator/Desktop/Naive_Bayes/Naive_bayes.csv";
        String line = "";
        String cvsSplitBy = ",";
      
         System.out.println("WORK_TYPE" + " AGE " + "   QUL "+" EXP ");

            
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] Naive_bayes = line.split(cvsSplitBy);

                System.out.println(Naive_bayes[0]+" " + Naive_bayes[1] +" " +  Naive_bayes[2] + " " +Naive_bayes[3]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


 

