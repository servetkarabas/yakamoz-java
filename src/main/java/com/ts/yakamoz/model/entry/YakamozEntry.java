package com.ts.yakamoz.model.entry;

import lombok.Builder;

import java.util.UUID;

@Builder
public record YakamozEntry(UUID id) { }
