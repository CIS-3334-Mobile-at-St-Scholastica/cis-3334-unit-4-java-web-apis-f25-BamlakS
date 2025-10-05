package cis3334.java_webaip;

import java.util.List;

public class EarthquakeMeta {
    private List<String> catalogs;
    private List<String> contributors;
    private List<String> producttypes;
    private List<String> eventtypes;
    private List<String> magnitudetypes;

    // Getters and setters
    public List<String> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<String> catalogs) {
        this.catalogs = catalogs;
    }

    public List<String> getContributors() {
        return contributors;
    }

    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }

    public List<String> getProducttypes() {
        return producttypes;
    }

    public void setProducttypes(List<String> producttypes) {
        this.producttypes = producttypes;
    }

    public List<String> getEventtypes() {
        return eventtypes;
    }

    public void setEventtypes(List<String> eventtypes) {
        this.eventtypes = eventtypes;
    }

    public List<String> getMagnitudetypes() {
        return magnitudetypes;
    }

    public void setMagnitudetypes(List<String> magnitudetypes) {
        this.magnitudetypes = magnitudetypes;
    }
}
