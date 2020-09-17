package assignment2;

import java.io.*;

public class Question44 {

    public static void main(String[] args) {
        String path = new String("/Users/bimalroka/Desktop/studentInfo.txt");

        try (
                FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("/Users/bimalroka/Desktop/fileDemo/studentInfo.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                ){
            String len;
            while ((len=br.readLine())!=null){
                System.out.println(len);
                bw.write(len);
                bw.newLine();
            }
            String target = "Hari";
            if (len.equals(target)) {
				System.out.println(len);
			}
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println();
        //System.out.println("Please enter the person's name you would like to see the address:");
    }
}


