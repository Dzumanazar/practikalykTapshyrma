package java8.classes;

import java8.enums.Status;

import java.util.List;

public class WhatsApp {
    private long id;
    private String name;
    private String phoneNomber;
    private String password;
    private String picture;
    private Status status;
    private List<Contact>contact;
    private List<String>message;



    public WhatsApp(long id, String name, String password, String phoneNomber, String picture, Status status) {
        this.id=id;
        this.name=name;
        this.password = password;
        this.phoneNomber = phoneNomber;
        this.picture = picture;
        this.status = status;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    public List<Contact> getContact() {
        return contact;
    }

    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNomber() {
        return phoneNomber;
    }

    public void setPhoneNomber(String phoneNomber) {
        this.phoneNomber = phoneNomber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "WhatsApp " +
                " \n id: " + id +
                " \n name: " + name +
                " \n password: " + password +
                " \n phoneNomber: " + phoneNomber +
                " \n picture: " + picture +
                " \n status: " + status +
                " \n contact: " + contact +
                " \n message: " + message +
                "\n====================================";
    }
}
