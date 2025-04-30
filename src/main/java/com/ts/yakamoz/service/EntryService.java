package com.ts.yakamoz.service;

import com.ts.yakamoz.model.entry.YakamozEntry;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class EntryService {
    public List<YakamozEntry> getListOfEntries() {
        return List.of(
                YakamozEntry.builder().id(UUID.randomUUID())
                        .content("content 1")
                        .title("title 1")
                        .created(OffsetDateTime.now())
                        .build(),
                YakamozEntry.builder().id(UUID.randomUUID())
                        .content("content 2")
                        .title("title 2")
                        .created(OffsetDateTime.now())
                        .build(),
                YakamozEntry.builder().id(UUID.randomUUID())
                        .content("content 3")
                        .title("title 3")
                        .created(OffsetDateTime.now())
                        .build(),
                YakamozEntry.builder().id(UUID.randomUUID())
                        .content("content 4")
                        .title("title 4")
                        .created(OffsetDateTime.now())
                        .build()
        );
    }
}
