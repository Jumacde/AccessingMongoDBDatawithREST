package com.example.accessingmongodbdatarest;

public interface Person {
    // getter
    String getId();
    String getFirstName();
    String getLastName();

    // setter
    void setId(String id);
    void setFirstName(String firstName);
    void setLastName(String lastName);
}
