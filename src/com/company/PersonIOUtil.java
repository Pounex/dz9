package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonIOUtil {

    public static void writePersons(String fileName, List<Person> personList) {
        try (FileWriter fw = new FileWriter(fileName)) {
            fw.write("Имя Фамилия Город Улица Номер\n");
            for (Person item : personList) {
                fw.write(item.getLastName() + " "
                        + item.getFirstName() +
                        " " + item.getAddress() + '\n');

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Person> readPersons(String fileName) {
        List<Person> res = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            if (br.readLine() == null) {
                throw new EmptySourceFileException("Файл пуст");
            }


            String line = br.readLine();
            while (line != null) {

                List<String> list1 = Arrays.asList(line.split(" "));
                res.add(new Person(list1.get(0), list1.get(1), new Address(list1.get(2), list1.get(3), Integer.parseInt(list1.get(4)))));
                line = br.readLine();
            }

        } catch (EmptySourceFileException | IOException emptySourseFileExeption) {
            emptySourseFileExeption.printStackTrace();
        }
        return res;

    }

}
