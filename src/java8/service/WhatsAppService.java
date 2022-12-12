package java8.service;

import java8.classes.Person;
import java8.classes.WhatsApp;

import java.util.List;
import java.util.Map;

public interface WhatsAppService {

    Map<Person, WhatsApp> createWhatsApp(List<WhatsApp> whatsApps);

    List<WhatsApp> getAll(List<WhatsApp>whatsApps);
}
