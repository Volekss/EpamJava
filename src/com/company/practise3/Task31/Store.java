package com.company.practise3.Task31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Store {
    private String name;
    private ArrayList<Department> departments;

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public Store(String name) {
        this.name = name;
    }

    public void addDepartment(String name, int latitude, int longtitude){
        departments.add(new Department(name, new Location(latitude, longtitude)));
    }
    private class Department {
        private String name;
        private Location location;
        private HashSet<String> typeOfGoods;
        private HashSet<String> services;

        {
            typeOfGoods = new HashSet<>();
            services = new HashSet<>();
        }


        public Department(String name, Location location) {
            this.name = name;
            this.location = location;
        }

        public void addGoods(String good){
            typeOfGoods.add(good);
        }

        public void addService(String service){
            services.add(service);
        }
    }

    private class Location {
        private double latitude;
        private double longitude;

        public Location(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Location)) return false;
            Location location = (Location) o;
            return Double.compare(location.latitude, latitude) == 0 &&
                    Double.compare(location.longitude, longitude) == 0;
        }

        @Override
        public int hashCode() {

            return Objects.hash(latitude, longitude);
        }
    }
}
