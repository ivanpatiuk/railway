package com.railway.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Exemption {
    Type1("Квота 1", 0.25),
    Type2("Квота 2", 0.5),
    Student("Студент", 0.5),
    Pupil("Учень", 0.75);

    private String description;
    private Double discount;
}
