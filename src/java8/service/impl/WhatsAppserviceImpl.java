package java8.service.impl;

import java8.classes.Contact;
import java8.classes.Person;
import java8.classes.WhatsApp;
import java8.enums.Status;
import java8.service.WhatsAppService;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class WhatsAppserviceImpl implements WhatsAppService {
    private List<WhatsApp>whatsApps = new ArrayList<>();
    @Override
    public String createWhatsApp(List<WhatsApp> whatsApps, List<Person>people) {
        for (Person person : people) {
        for (WhatsApp whatsApp : whatsApps) {
            if (person.getId() == whatsApp.getId()) {
                this.whatsApps = whatsApps;
            }
        }
        }
        return "whatsApp aldy";
    }
//    public Map<Integer, Student> getAge(List<Student> students) {
//        Map<Integer, Student> integerStudentMap = new TreeMap<>();
//        for (Student student : students) {
//            int years = Period.between(student.getDateOfBirth(), LocalDate.now()).getYears();
//            integerStudentMap.put(years, student);
//        }
//        return integerStudentMap;
//    }
    @Override
    public Map<String, WhatsApp> aldyWhatsApp(List<WhatsApp> whatsApps, List<Person>people) {
        Map<String, WhatsApp> whatsAppMap =  new LinkedHashMap<>();
        for (WhatsApp whatsApp : whatsApps) {
            for (Person person : people) {
                if (whatsApp.getName().equals(whatsApp.getName())){
                    whatsAppMap.put(null,null);
                }
            }
        }
        return null;
    }

    @Override
    public List<WhatsApp> getAll(List<WhatsApp> whatsApps) {
        return this.whatsApps;
    }

    @Override
    public String changeStatus(Status [] status) {
        String s = new Scanner(System.in).nextLine();
        for (WhatsApp whatsApp : whatsApps) {
            for (Status status1 : status) {
                if (status1.name().equals(s.toUpperCase())) {
                    whatsApp.setStatus(status1);
                }
            }

        }
        return "status almashty" ;
    }

    @Override
    public List<WhatsApp> findByphoneNumber(String phoneNumber, List<WhatsApp>whatsApps) {
        List<WhatsApp> whatsApps1 = new ArrayList<>();
        for (WhatsApp whatsApp : whatsApps) {
                if (phoneNumber.equals(whatsApp.getPhoneNomber())) {
                    whatsApps1.add(whatsApp);
                }
            }
        return whatsApps1;
    }

    @Override
    public String createContact(List<WhatsApp> whatsApps) {
        System.out.print(" atynyzdy jazynyz:");
        String name = new Scanner(System.in).nextLine();
        for (WhatsApp whatsApp : whatsApps) {
            if (whatsApp.getName().equals(name)){
                System.out.print("parolunuzdu jazynynz: ");
                String parol = new Scanner(System.in).nextLine();
                if (whatsApp.getPassword().equals(parol)){
                    System.out.print("koldonuuchunun atyn jaz: ");
                    String username = new Scanner(System.in).nextLine();
                    System.out.print("koldonuchunun telephon nomerin jaz: ");
                    String phoneNumber = new Scanner(System.in).nextLine();
                    Contact contact = new Contact(username, phoneNumber);
                    whatsApp.getContact().add(contact);
                }
            }
        }
        return "kantaktka igiliktuu koshuldu";
    }
}
