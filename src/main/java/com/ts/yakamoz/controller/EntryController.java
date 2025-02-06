package com.ts.yakamoz.controller;


import com.ts.yakamoz.service.EntryService;
import com.ts.yakamoz.model.entry.YakamozEntry;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("entries")
@RequiredArgsConstructor
public class EntryController {

    private final EntryService entryService;

    @GetMapping()
    public ResponseEntity<List<YakamozEntry>> getEntryList(){
        return  ResponseEntity.ok(entryService.getListOfEntries());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void postEntities(){
    }


}
