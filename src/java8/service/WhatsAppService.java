package java8.service;

import java8.classes.Person;
import java8.classes.WhatsApp;
import java8.enums.Status;

import java.util.List;
import java.util.Map;

public interface WhatsAppService {
    String createWhatsApp(List<WhatsApp>whatsApps, List<Person> people);

    Map<String, WhatsApp> aldyWhatsApp(List<WhatsApp> whatsApps, List<Person>people);
    List<WhatsApp> getAll(List<WhatsApp>whatsApps);

    String changeStatus(Status[] status );

    List<WhatsApp> findByphoneNumber(String phoneNumber, List<WhatsApp>whatsApps);

    String createContact(List<WhatsApp>whatsApps);
}
