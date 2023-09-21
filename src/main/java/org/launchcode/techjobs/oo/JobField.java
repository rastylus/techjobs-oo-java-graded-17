package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private static int nextId = 1;
    private int id;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }


    public JobField(String aValue) {
        this();
        this.value = aValue;
        nextId++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return getId() == jobField.getId() && Objects.equals(getValue(), jobField.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if (Objects.equals(value, "")) {
            return value = "Data not available";
        }
        return value;
    }

}
