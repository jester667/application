package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * Application Status Changing History.
 */

@Schema(name = "ApplicationStatusHistoryDTO", description = "Application Status Changing History.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class ApplicationStatusHistoryDTO   {

  @JsonProperty("status")
  private ApplicationStatus status;

  @JsonProperty("time")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime time;

  /**
   * Gets or Sets changeType
   */
  public enum ChangeTypeEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    ChangeTypeEnum(String value) {
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
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("changeType")
  private ChangeTypeEnum changeType;

  public ApplicationStatusHistoryDTO status(ApplicationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public ApplicationStatus getStatus() {
    return status;
  }

  public void setStatus(ApplicationStatus status) {
    this.status = status;
  }

  public ApplicationStatusHistoryDTO time(LocalDateTime time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @Valid 
  @Schema(name = "time", required = false)
  public LocalDateTime getTime() {
    return time;
  }

  public void setTime(LocalDateTime time) {
    this.time = time;
  }

  public ApplicationStatusHistoryDTO changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  */
  
  @Schema(name = "changeType", required = false)
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationStatusHistoryDTO applicationStatusHistoryDTO = (ApplicationStatusHistoryDTO) o;
    return Objects.equals(this.status, applicationStatusHistoryDTO.status) &&
        Objects.equals(this.time, applicationStatusHistoryDTO.time) &&
        Objects.equals(this.changeType, applicationStatusHistoryDTO.changeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, time, changeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationStatusHistoryDTO {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

