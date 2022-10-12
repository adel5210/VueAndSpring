package com.adel.vuespring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public Tutorial(String title, String description, boolean b) {
        this.id = UUID.randomUUID().getMostSignificantBits();
        this.title = title;
        this.description = description;
        this.published = b;
    }
}
