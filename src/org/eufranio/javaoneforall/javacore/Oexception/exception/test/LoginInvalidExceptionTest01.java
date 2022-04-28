package org.eufranio.javaoneforall.javacore.Oexception.exception.test;

import org.eufranio.javaoneforall.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);

        username = scanner.nextLine();
        password = scanner.nextLine();

        try {
            login(username, password);
        } catch (LoginInvalidException e) {
            System.out.println("Ola amigo");
            e.printStackTrace();
        }
    }

    public static boolean login(String username, String password) throws LoginInvalidException {
        if (!username.equals("Goku") || !password.equals("1234")) {
            throw new LoginInvalidException("Username/password invalid");
        }
        return true;
    }
}
