package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.Generated;

/**
 * Application status.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public enum ApplicationStatus {
  
  REQUEST_DENIED("REQUEST_DENIED"),
  
  PREAPPROVAL("PREAPPROVAL"),
  
  APPROVED("APPROVED"),
  
  CC_DENIED("CC_DENIED"),
  
  CC_APPROVED("CC_APPROVED"),
  
  PREPARE_DOCUMENTS("PREPARE_DOCUMENTS"),
  
  DOCUMENT_CREATED("DOCUMENT_CREATED"),
  
  CLIENT_DENIED("CLIENT_DENIED"),
  
  DOCUMENT_SIGNED("DOCUMENT_SIGNED"),
  
  CREDIT_ISSUED("CREDIT_ISSUED");

  private String value;

  ApplicationStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ApplicationStatus fromValue(String value) {
    for (ApplicationStatus b : ApplicationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

