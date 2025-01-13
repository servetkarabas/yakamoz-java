package com.ts.yakamoz.service;

import com.ts.yakamoz.model.entry.YakamozEntry;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EntryService {
    public List<YakamozEntry> getListOfEntries() {
        return List.of(YakamozEntry.builder().id(UUID.randomUUID()).build());
    }
}
