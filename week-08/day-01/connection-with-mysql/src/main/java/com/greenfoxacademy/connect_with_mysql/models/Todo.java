package com.greenfoxacademy.connect_with_mysql.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String title;
  private String content;
  private String description;
  private boolean urgent;
  private boolean done;

  private String dueDate;

  @CreationTimestamp
  @Temporal(TemporalType.TIME)
  private Date createdDate;

  @ManyToOne(fetch = FetchType.EAGER)
  private Assignee assignee;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo(String title, String content, String description, boolean urgent, boolean done) {
    this.title = title;
    this.content = content;
    this.description = description;
    this.urgent = urgent;
    this.done = done;
  }

  public Todo(String title, String content, String description, boolean urgent, boolean done, String dueDate) {
    this.title = title;
    this.content = content;
    this.description = description;
    this.urgent = urgent;
    this.done = done;
    this.dueDate = dueDate;
  }

  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

/*  public void setDateOfDueWithStringParameter(String dueDate) {
    try {
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      this.setDueDate(format.parse(dueDate));
    } catch (Exception e) {
      System.out.println("Failed date parsing");
      System.exit(-1);
    }
  }*/
}
