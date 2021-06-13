package ru.ibs.internship.maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the line");
        System.out.println(StringUtils.upperCase(sc.nextLine()));
        /*String str = sc.nextLine();
        StringUtils.upperCase(str);*/
    }
}
