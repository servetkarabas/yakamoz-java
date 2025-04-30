package com.ts.yakamoz.model.entry;

import lombok.Builder;

import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
public record YakamozEntry(UUID id, String title, String content, OffsetDateTime    created) { }
