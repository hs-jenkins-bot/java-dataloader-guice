package com.hubspot.dataloader.guice;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import org.dataloader.BatchLoader;

public class CongratulationsBatchLoader implements BatchLoader<String, String> {

  @Override
  public CompletionStage<List<String>> load(List<String> keys) {
    List<String> values = keys.stream().map(key -> "Congratulations " + key).collect(Collectors.toList());
    return CompletableFuture.completedFuture(values);
  }
}
