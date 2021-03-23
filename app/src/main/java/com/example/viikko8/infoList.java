/*
Viikko 9 - tehtävä 2
Tiedosto: infoList.java
Tekijä: Joona Saloniemi
Päiväys: 22.3.2021
*/

package com.example.viikko8;

public class infoList {
    private String name;
    public infoList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
