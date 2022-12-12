package java8;

import java8.classes.Contact;
import java8.classes.Person;
import java8.classes.WhatsApp;
import java8.enums.Country;
import java8.enums.Gender;
import java8.enums.Status;
import java8.service.impl.PersonServiceIpml;
import java8.service.impl.WhatsAppserviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        PersonServiceIpml serviceIpml = new PersonServiceIpml();
        WhatsAppserviceImpl whatsAppservice = new WhatsAppserviceImpl();
        List<WhatsApp> whatsApps = new ArrayList<>();
        List<Person> people = new ArrayList<>();

        while (true) {
            System.out.println("""
                    1. bassan adamdar pasport alat: 
                    2. bassan pasport algan adamdardy chygarat:
                    3. bassan whatsApp tuzulot:
                    4. bassan whatsApptyn statustaryn korosuz: 
                    5. bassan whatsApp algandar chygat: 
                    6. bassan status almashat:
                    7. bassan bardyk mamlecetter chygat: 
                    8. bassan telefon nomeri menen whatsAppty tabat: 
                    9. bassan adamdardy aty menen tabat:
                    10. contact tuzuu: 
                    """);
            System.out.println("++++++++++++++++++++++++++++++++");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("familyanyzdy jazynyz: ");
                    String surname = new Scanner(System.in).nextLine();
                    System.out.print("atynyzdy jazynyz: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("tuulgan jylynyz (yyy mm dd): ");
                    LocalDate localDate = LocalDate.of(scanner1.nextInt(), scanner1.nextInt(), scanner1.nextInt());
                    System.out.print("Id nomer jazynyz: ");
                    int id = new Scanner(System.in).nextInt();
                    System.out.print("genderinizdi jazynyz: ");
                    String gender = new Scanner(System.in).nextLine();
                    System.out.print("tuulgan olkonuz: ");
                    String country = new Scanner(System.in).nextLine();
                    System.out.print("telephon nomeriniz: ");
                    String phoneNamber = new Scanner(System.in).nextLine();
                    Person person1 = new Person(surname, name, localDate, id, Gender.valueOf(gender.toUpperCase()), Country.valueOf(country.toUpperCase()), phoneNamber);
                    people.add(person1);
                    System.out.println(serviceIpml.createPerson(people));
                    break;
                case 2:
                    System.out.println(serviceIpml.getAll(people));
                    break;
                case 3:
                    System.out.print("id jazynyz: ");
                    int id1 = new Scanner(System.in).nextInt();
                    System.out.print("atynyzdy jazynyz: ");
                    String name1 = new Scanner(System.in).nextLine();
                    System.out.print("parol jazynyz: ");
                    String parol = new Scanner(System.in).nextLine();
                    System.out.print("telefon nomeriniz: ");
                    String phoneNumber1 = new Scanner(System.in).nextLine();
                    WhatsApp whatsApp1 = new WhatsApp(id1, name1, parol, phoneNumber1, "Devoltno", Status.НЕ_МОГУ_ГОВОРИТ_ТОЛЬКО_WHATSAPP);
                    whatsApps.add(whatsApp1);
                    System.out.println(whatsAppservice.createWhatsApp(whatsApps, people));
                    break;
                case 4:
                    Status[] status = Status.values();
                    for (Status status1 : status) {
                        System.out.println(status1);
                    }
                    break;
                case 5:
                    System.out.println(whatsAppservice.getAll(whatsApps));
                    break;
                case 6:
                    System.out.print("statustu jazynyz: ");
                    System.out.println(whatsAppservice.changeStatus(Status.values()));
                    break;
                case 7:
                    Country[] countries = Country.values();
                    for (Country country1 : countries) {
                        System.out.println(country1);
                    }
                    break;
                case 8:
                    System.out.print("telephon nomer jazynyz: ");
                    System.out.println(whatsAppservice.findByphoneNumber(new Scanner(System.in).nextLine(), whatsApps));
                    break;
                case 9:
                    System.out.print("adamdyn atyn jazynyz: ");
                    serviceIpml.findByName(new Scanner(System.in).nextLine(), people);
                    break;
                case 10:
                    System.out.println(whatsAppservice.createContact(whatsApps));
                    break;
            }
        }

    }
}
