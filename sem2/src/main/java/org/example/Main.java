package org.example;

import netscape.javascript.JSException;
import netscape.javascript.JSObject;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {


String str1 = "select * from students where ";


        String str2 =  "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String[] str3 = str2.split(" ");


for (int i = 0; i< str3.length; i++){
    str3[i] = str3[i].replace("{", "");
    str3[i] = str3[i].replace('"', ' ');
    str3[i] = str3[i].replace(" : ", "=");
    str3[i] = str3[i].replace(" ,", ",");
        if (str3[i].contains("null")){
        str3[i] = "";}
    str1 += str3[i];
        System.out.println(str3[i]);}


        System.out.println(str1);



        }
    }
