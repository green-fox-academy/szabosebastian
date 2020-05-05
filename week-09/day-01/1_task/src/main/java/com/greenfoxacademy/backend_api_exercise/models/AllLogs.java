package com.greenfoxacademy.backend_api_exercise.models;

import java.util.List;

public class AllLogs {
  private List<Log> entries;
  private int entry_count;

  public AllLogs() {
  }

  public AllLogs(List<Log> logs) {
    this.entries = logs;
    this.entry_count = logs.size();
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
