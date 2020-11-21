package Pr22.part1;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> iac = new HashMap<>();
        iac.put("Вова",123);
        Client client = new Client();
        Abibas abibas = new Abibas();
        abibas.buy();


        try {
            abibas.chek(iac.get(client.getName()), client.getIIN());
        }catch (Exception e){
            System.out.println("Такого имени не найдено в системе");
        }

    }

}
