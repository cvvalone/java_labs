import models.Patient;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient[] patients = createMockPatients();

        System.out.println("\n=== Пацієнти з діагнозом 'Грип' ===");
        printPatientsByDiagnosis(patients, "Грип");

        System.out.println("\n=== Пацієнти з номерами медкарток у діапазоні 100000 - 200000 ===");
        printPatientsByMedicalCardRange(patients, 100000, 200000);

        System.out.println("\n=== Пацієнти з номером, що починається на 6 ===");
        printCountAndPatientsByFirstDigitNumber(patients, 6);
    }

    public static Patient[] createMockPatients() {
        return new Patient[] {
                new Patient("Іван", "Грицев", "Іванович", "Київ", "501234567", "123456", "Грип"),
                new Patient("Демʼян", "Демʼян", "Демʼянович", "Львів", "637654321", "987654", "Алергія"),
                new Patient("Лєдєнцов", "Вʼячеслав", "Вʼячеславович", "Харків", "971112233", "145000", "Грип"),
                new Patient("Морква", "Микита", "Микитович", "Краматорськ", "509988776", "199999", "Діабет"),
                new Patient("Тарас", "Бондар", "Юрійович", "Київ", "672223344", "200001", "Астма")
        };
    }

    public static void printPatientsByDiagnosis(Patient[] patients, String diagnosis) {
        for (Patient p : patients) {
            if (p.getDiagnosis().equalsIgnoreCase(diagnosis)) {
                System.out.println(p);
            }
        }
    }

    public static void printPatientsByMedicalCardRange(Patient[] patients, int min, int max) {
        for (Patient p : patients) {
            try {
                int number = Integer.parseInt(p.getMedicalCardNumber());
                if (number >= min && number <= max) {
                    System.out.println(p);
                }
            } catch (NumberFormatException e) {
                System.out.println("Неможливо обробити номер медкартки пацієнта: " + p.getMedicalCardNumber());
            }
        }
    }

    public static void printCountAndPatientsByFirstDigitNumber(Patient[] patients, int numberStartsWith) {
        for (Patient p : patients) {
            try {
                if(p.getPhoneNumber().startsWith(String.valueOf(numberStartsWith))){
                    System.out.println(p);
                }
            } catch (NumberFormatException e) {
                System.out.println("Неможливо обробити номер медкартки пацієнта: " + p.getMedicalCardNumber());
            }
        }
    }

}