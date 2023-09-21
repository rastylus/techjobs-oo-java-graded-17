package org.launchcode.techjobs.oo;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class PositionType extends JobField{
    public PositionType(String value) {
    super(value);
    }

//    @Override
//    public boolean equals(Object o) {
//        return super.equals(o);
//    }
}


//public class PositionType {
//
//
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
////        super(value);
//    }
//
//// //    TODO: Add a custom toString() method that returns the data stored in
////  'value'.
//    @Override
//    public String toString() {
//        if (Objects.equals(value, "")) {
//            return value = "Data not available";
//        }
//        return value;
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(JobField.nextId);
//    }
////
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//
//
//}
