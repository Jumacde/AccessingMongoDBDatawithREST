package com.example.accessingmongodbdatarest;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "custom", types = {Person.class})
public interface CustomPersonProjection {
    String getFirstName();
    String getLastName();
}
