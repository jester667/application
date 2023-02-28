package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Finish registration request with full client data.
 */

@Schema(name = "FinishRegistrationRequestDTO", description = "Finish registration request with full client data.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class FinishRegistrationRequestDTO   {

  /**
   * Client's gender.
   */
  public enum GenderEnum {
    MALE("MALE"),
    
    FEMALE("FEMALE"),
    
    NON_BINARY("NON_BINARY");

    private String value;

    GenderEnum(String value) {
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
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  /**
   * Client's marital status.
   */
  public enum MaritalStatusEnum {
    MARRIED("MARRIED"),
    
    DIVORCED("DIVORCED"),
    
    SINGLE("SINGLE"),
    
    WIDOW_WIDOWER("WIDOW_WIDOWER");

    private String value;

    MaritalStatusEnum(String value) {
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
    public static MaritalStatusEnum fromValue(String value) {
      for (MaritalStatusEnum b : MaritalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("maritalStatus")
  private MaritalStatusEnum maritalStatus;

  @JsonProperty("dependentAmount")
  private Integer dependentAmount;

  @JsonProperty("passportIssueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private java.time.LocalDate passportIssueDate;

  @JsonProperty("passportIssueBranch")
  private String passportIssueBranch;

  @JsonProperty("employment")
  private EmploymentDTO employment;

  @JsonProperty("account")
  private String account;

  public FinishRegistrationRequestDTO gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Client's gender.
   * @return gender
  */
  @NotNull 
  @Schema(name = "gender", example = "MALE", description = "Client's gender.", required = true)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public FinishRegistrationRequestDTO maritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Client's marital status.
   * @return maritalStatus
  */
  @NotNull 
  @Schema(name = "maritalStatus", example = "SINGLE", description = "Client's marital status.", required = true)
  public MaritalStatusEnum getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public FinishRegistrationRequestDTO dependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
    return this;
  }

  /**
   * Client's dependents amount.
   * @return dependentAmount
  */
  @NotNull 
  @Schema(name = "dependentAmount", example = "1", description = "Client's dependents amount.", required = true)
  public Integer getDependentAmount() {
    return dependentAmount;
  }

  public void setDependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
  }

  public FinishRegistrationRequestDTO passportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Client's passport issue date.
   * @return passportIssueDate
  */
  @NotNull @Valid 
  @Schema(name = "passportIssueDate", example = "Sun Nov 27 03:00:00 MSK 2016", description = "Client's passport issue date.", required = true)
  public java.time.LocalDate getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public FinishRegistrationRequestDTO passportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
    return this;
  }

  /**
   * Client's passport issue branch.
   * @return passportIssueBranch
  */
  @NotNull 
  @Schema(name = "passportIssueBranch", example = "123-456", description = "Client's passport issue branch.", required = true)
  public String getPassportIssueBranch() {
    return passportIssueBranch;
  }

  public void setPassportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
  }

  public FinishRegistrationRequestDTO employment(EmploymentDTO employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @NotNull @Valid 
  @Schema(name = "employment", required = true)
  public EmploymentDTO getEmployment() {
    return employment;
  }

  public void setEmployment(EmploymentDTO employment) {
    this.employment = employment;
  }

  public FinishRegistrationRequestDTO account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Client's master account.
   * @return account
  */
  @NotNull @Pattern(regexp = "[0-9]{20}") 
  @Schema(name = "account", example = "11223344556677889900", description = "Client's master account.", required = true)
  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishRegistrationRequestDTO finishRegistrationRequestDTO = (FinishRegistrationRequestDTO) o;
    return Objects.equals(this.gender, finishRegistrationRequestDTO.gender) &&
        Objects.equals(this.maritalStatus, finishRegistrationRequestDTO.maritalStatus) &&
        Objects.equals(this.dependentAmount, finishRegistrationRequestDTO.dependentAmount) &&
        Objects.equals(this.passportIssueDate, finishRegistrationRequestDTO.passportIssueDate) &&
        Objects.equals(this.passportIssueBranch, finishRegistrationRequestDTO.passportIssueBranch) &&
        Objects.equals(this.employment, finishRegistrationRequestDTO.employment) &&
        Objects.equals(this.account, finishRegistrationRequestDTO.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, maritalStatus, dependentAmount, passportIssueDate, passportIssueBranch, employment, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishRegistrationRequestDTO {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dependentAmount: ").append(toIndentedString(dependentAmount)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportIssueBranch: ").append(toIndentedString(passportIssueBranch)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

