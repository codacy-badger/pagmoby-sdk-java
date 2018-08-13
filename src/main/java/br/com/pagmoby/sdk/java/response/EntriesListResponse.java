package br.com.pagmoby.sdk.java.response;

import br.com.pagmoby.sdk.java.resource.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntriesListResponse extends ArrayList<Entry> {

    private List<Entry> entries;

    @Override
    public String toString() {
        return new StringBuilder("EntriesListResponse=[")
                .append(entries)
                .append(']').toString();
    }
}
