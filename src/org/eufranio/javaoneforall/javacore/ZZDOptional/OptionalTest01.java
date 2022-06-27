package org.eufranio.javaoneforall.javacore.ZZDOptional;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Eufránio");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();


        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);


        Optional<String> nameFounded = findName(
                List.of("Eufránio", "Luther", "Gabriel"),
                "Eufránio"
        );

        System.out.println(nameFounded);

    }

    private static Optional<String> findName(List<String> names, String searchedName) {
        return names.stream().filter(name -> name.equalsIgnoreCase(searchedName)).findFirst();
    }
}
