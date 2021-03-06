package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Entity {

    public Event(String title, Date date) {
        this.title = title;
        this.date = date;
    }

    private long eventId;
    private String title;
    private Date date;
}
