package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int s = seconds % 60;
        int h = seconds / 60;
        int m = h % 60;
        h = h / 60;

        String strSecs = (s < 10) ? "0" + s : Integer.toString(s);
        String strMins = (m < 10) ? "0" + m : Integer.toString(m);

        h = (h > 23) ? 0 : h;

        System.out.println(h + ":" + strMins + ":" + strSecs);
    }
}
