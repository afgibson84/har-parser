package com.afgibson84.har.model;

import java.util.ArrayList;
import java.util.List;

/**
 * HarLog class
 */
public class HarLog {
    private String version;
    private HarCreator creator;
    private List<HarPage> pages = new ArrayList<HarPage>();
    private List<HarEntry> entries = new ArrayList<HarEntry>();
    private String comment;

    public List<HarPage> getPages() {
        return pages;
    }

    public void setPages(List<HarPage> pages) {
        this.pages = pages;
    }

    public List<HarEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<HarEntry> entries) {
        this.entries = entries;
    }
}