package com.sks.ioStreamProject;

import java.io.*;

public class ReadInputs {

    public static void main(String[] args) throws IOException {

        File file = new File("src/Test.txt");

        //Above Byte level(char and strings)

        try(FileReader fileReader = new FileReader(file)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



        //Byte level
//        try(FileInputStream fileInputStream = new FileInputStream((file))) {
//            System.out.println("Total size to read in bytes is " + fileInputStream.available());
//
//            int content;
//            while((content = fileInputStream.read()) != -1) {
//                //convert to char and display
//                System.out.print((char)content);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        byte data[] = new byte[11];
//
//        System.out.println("Enter some characters: ");
//        System.in.read(data);
//        System.out.print("You entered: ");
//
//        for (int i=0; i<data.length; i++) {
//            System.out.print(data[i]);
//        }
//        System.out.println();
//
//        for (int i=0; i<data.length; i++) {
//            System.out.print((char)data[i]);
//        }

    }
}
