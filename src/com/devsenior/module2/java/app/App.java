package com.devsenior.module2.java.app;
import com.devsenior.module2.java.config.WeekDay;
import com.devsenior.module2.java.model.security.User;
import com.devsenior.module2.java.model.security.UserRole;

public class App {
    public static void main(String[] args) throws Exception {
        //demoWeekDay();
        demoUser();
    }
   
    private static void demoUser(){
        var dante = new User("Dante", "dante@gmail.com", "321654", true, UserRole.ADMIN);
        var jose = new User("Jose", "jose123@gmail.com", "654987");
        var userArray = new User [] { dante, jose };

          dante.deactivateUser();

        for(int i = 0; i < userArray.length; i++) {
            var user = userArray[i];
            switch (user.getRole()) {
                case ADMIN:
                    System.out.printf("%s es el superusuario%n", user);
                    break;
                case CLIENT:
                    System.out.printf("%s es el cliente preferido%n", user);
                     break;
                case PROVIDER:
                    System.out.printf("%s es el proveedor por defecto%n", user);
                     break;
                case EMPLOYEE:
                    System.out.printf("%s no estas trabajando?%n", user);
                     break;

                case USER:
                    System.out.printf("%s que haces aqui?%n", user);
                      break;

            }
        }
    }
    private static void demoWeekDay() {
        WeekDay day = null;
        day = WeekDay.MYDAY;
        System.out.println();
        System.out.println();
        System.out.println(day);
        System.out.println(day.getNum());

        var appointmentDay = WeekDay.FRIDAY;
        System.out.println(appointmentDay);

    }
}
