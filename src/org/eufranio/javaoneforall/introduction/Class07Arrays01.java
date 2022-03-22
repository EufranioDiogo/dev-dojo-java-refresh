package org.eufranio.javaoneforall.introduction;

public class Class07Arrays01 {
    public static void main(String[] args) {
        int[] ages = {21, 20, 25};
        int maxAge = ages[0];

        for (int i = 1; i < ages.length; i++) {
            if (maxAge < ages[i]) {
                maxAge = ages[i];
            }
        }
        System.out.println("Highest age in array: " + maxAge);
    }
}
