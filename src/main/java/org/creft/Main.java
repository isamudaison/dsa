package org.creft;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.*;
import java.util.function.BiFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        List<String> stringList = new ArrayList<>(2);
        stringList.add("test1");
        stringList.add("test2");

        for (String s : stringList) {
            System.out.println(s);
        }

        Map<Integer, String> intStringMap = new HashMap<>(3);
        intStringMap.put(5,"five");
        intStringMap.put(6,"six");

        BiFunction<String, Integer, String> printoutKeyValue = (key, value) -> key + Integer.toString(value);

        for(Map.Entry<Integer,String> entry: intStringMap.entrySet())
            System.out.println(printoutKeyValue.apply(entry.getValue(), entry.getKey()));
    }
}