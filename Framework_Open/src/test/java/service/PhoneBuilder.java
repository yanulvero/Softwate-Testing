package service;

import model.Phone;

public class PhoneBuilder {
    public static Phone getPhone(String fullDescription, String manufacturer, String model) {
        return new Phone(fullDescription, manufacturer, model);
    }
}
