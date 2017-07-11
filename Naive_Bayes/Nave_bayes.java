

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


***************************************************

administrator@112C-09:~/Desktop/Naive_Bayes$ javac Nave_bayes.java 
administrator@112C-09:~/Desktop/Naive_Bayes$ java Nave_bayes
WORK_TYPE AGE    QUL  EXP 
Work_type Age Qualification Experience
service 21 M.tech 1
research 26 M.tech 2
research 27 B.tech 6
service 28 B.tech 10
consultancy 30 Ph.d 9
service 32 M.tech 9
research 35 Ph.d 10
reasearch 36 Ph.d 7
consultancy 40 M.tech 14
consultancy 45 M.tech 17
administrator@112C-09:~/Desktop/Naive_Bayes$ 

