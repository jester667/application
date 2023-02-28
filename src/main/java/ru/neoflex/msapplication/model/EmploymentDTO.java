package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Client&#39;s employment info.
 */

@Schema(name = "EmploymentDTO", description = "Client's employment info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class EmploymentDTO   {

  /**
   * Client's employment status.
   */
  public enum EmploymentStatusEnum {
    UNEMPLOYED("UNEMPLOYED"),
    
    SELF_EMPLOYED("SELF_EMPLOYED"),
    
    EMPLOYED("EMPLOYED"),
    
    BUSINESS_OWNER("BUSINESS_OWNER");

    private String value;

    EmploymentStatusEnum(String value) {
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
    public static EmploymentStatusEnum fromValue(String value) {
      for (EmploymentStatusEnum b : EmploymentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("employmentStatus")
  private EmploymentStatusEnum employmentStatus;

  @JsonProperty("employerINN")
  private String employerINN;

  @JsonProperty("salary")
  private java.math.BigDecimal salary;

  /**
   * Client's employment position.
   */
  public enum PositionEnum {
    WORKER("WORKER"),
    
    MID_MANAGER("MID_MANAGER"),
    
    TOP_MANAGER("TOP_MANAGER"),
    
    OWNER("OWNER");

    private String value;

    PositionEnum(String value) {
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
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("position")
  private PositionEnum position;

  @JsonProperty("workExperienceTotal")
  private Integer workExperienceTotal;

  @JsonProperty("workExperienceCurrent")
  private Integer workExperienceCurrent;

  public EmploymentDTO employmentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
    return this;
  }

  /**
   * Client's employment status.
   * @return employmentStatus
  */
  @NotNull 
  @Schema(name = "employmentStatus", example = "EMPLOYED", description = "Client's employment status.", required = true)
  public EmploymentStatusEnum getEmploymentStatus() {
    return employmentStatus;
  }

  public void setEmploymentStatus(EmploymentStatusEnum employmentStatus) {
    this.employmentStatus = employmentStatus;
  }

  public EmploymentDTO employerINN(String employerINN) {
    this.employerINN = employerINN;
    return this;
  }

  /**
   * Client's employer's INN.
   * @return employerINN
  */
  @Pattern(regexp = "[0-9]{12}") 
  @Schema(name = "employerINN", example = "123456789012", description = "Client's employer's INN.", required = false)
  public String getEmployerINN() {
    return employerINN;
  }

  public void setEmployerINN(String employerINN) {
    this.employerINN = employerINN;
  }

  public EmploymentDTO salary(java.math.BigDecimal salary) {
    this.salary = salary;
    return this;
  }

  /**
   * Client's salary.
   * @return salary
  */
  @Valid 
  @Schema(name = "salary", example = "100000.0", description = "Client's salary.", required = false)
  public java.math.BigDecimal getSalary() {
    return salary;
  }

  public void setSalary(java.math.BigDecimal salary) {
    this.salary = salary;
  }

  public EmploymentDTO position(PositionEnum position) {
    this.position = position;
    return this;
  }

  /**
   * Client's employment position.
   * @return position
  */
  
  @Schema(name = "position", example = "WORKER", description = "Client's employment position.", required = false)
  public PositionEnum getPosition() {
    return position;
  }

  public void setPosition(PositionEnum position) {
    this.position = position;
  }

  public EmploymentDTO workExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
    return this;
  }

  /**
   * Client's total work experience.
   * @return workExperienceTotal
  */
  
  @Schema(name = "workExperienceTotal", example = "5", description = "Client's total work experience.", required = false)
  public Integer getWorkExperienceTotal() {
    return workExperienceTotal;
  }

  public void setWorkExperienceTotal(Integer workExperienceTotal) {
    this.workExperienceTotal = workExperienceTotal;
  }

  public EmploymentDTO workExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
    return this;
  }

  /**
   * Client's work experience in current job.
   * @return workExperienceCurrent
  */
  
  @Schema(name = "workExperienceCurrent", example = "2", description = "Client's work experience in current job.", required = false)
  public Integer getWorkExperienceCurrent() {
    return workExperienceCurrent;
  }

  public void setWorkExperienceCurrent(Integer workExperienceCurrent) {
    this.workExperienceCurrent = workExperienceCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmploymentDTO employmentDTO = (EmploymentDTO) o;
    return Objects.equals(this.employmentStatus, employmentDTO.employmentStatus) &&
        Objects.equals(this.employerINN, employmentDTO.employerINN) &&
        Objects.equals(this.salary, employmentDTO.salary) &&
        Objects.equals(this.position, employmentDTO.position) &&
        Objects.equals(this.workExperienceTotal, employmentDTO.workExperienceTotal) &&
        Objects.equals(this.workExperienceCurrent, employmentDTO.workExperienceCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employmentStatus, employerINN, salary, position, workExperienceTotal, workExperienceCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmploymentDTO {\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
    sb.append("    employerINN: ").append(toIndentedString(employerINN)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    workExperienceTotal: ").append(toIndentedString(workExperienceTotal)).append("\n");
    sb.append("    workExperienceCurrent: ").append(toIndentedString(workExperienceCurrent)).append("\n");
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

