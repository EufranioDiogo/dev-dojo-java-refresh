package org.eufranio.javaoneforall.javacore.Ycollections.test;

import org.eufranio.javaoneforall.javacore.Ycollections.domain.SmartphoneWithEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest01 {
    public static void main(String[] args) {
        List<SmartphoneWithEquals> smartPhoneList = new ArrayList<>();

        smartPhoneList.add(new SmartphoneWithEquals("123456", "RMX817", "Realme"));
        SmartphoneWithEquals smarthPhone1 = new SmartphoneWithEquals("133456", "Iphone 12 Pro", "Iphone");
        SmartphoneWithEquals smarthPhone2 = new SmartphoneWithEquals("133906", "P9", "Huwey");
        smartPhoneList.addAll(Arrays.asList(
                smarthPhone1,
                smarthPhone2
        ));

        smartPhoneList.stream().map(smartPhone -> {
            System.out.println(smartPhone);
            return null;
        }).collect(Collectors.toList());

        smartPhoneList.remove(smarthPhone1);

        System.out.println(smartPhoneList);
    }
}
