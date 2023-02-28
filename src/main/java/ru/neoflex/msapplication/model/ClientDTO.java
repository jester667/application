package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Client&#39;s info.
 */

@Schema(name = "ClientDTO", description = "Client's info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class ClientDTO   {

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("birthdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private java.time.LocalDate birthdate;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("passportNumber")
  private String passportNumber;

  @JsonProperty("passportIssueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private java.time.LocalDate passportIssueDate;

  @JsonProperty("passportIssueBranch")
  private String passportIssueBranch;

  @JsonProperty("maritalStatus")
  private String maritalStatus;

  @JsonProperty("dependentAmount")
  private Integer dependentAmount;

  @JsonProperty("employment")
  private EmploymentDTO employment;

  @JsonProperty("account")
  private String account;

  public ClientDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "Ivan", description = "First name", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ClientDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "Ivanov", description = "Last name", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ClientDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Middle name (if present).
   * @return middleName
  */
  
  @Schema(name = "middleName", example = "Ivanonovich", description = "Middle name (if present).", required = false)
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public ClientDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Client's email.
   * @return email
  */
  
  @Schema(name = "email", example = "iivanov@email.com", description = "Client's email.", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ClientDTO gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Client's gender.
   * @return gender
  */
  
  @Schema(name = "gender", example = "MALE", description = "Client's gender.", required = false)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ClientDTO birthdate(java.time.LocalDate birthdate) {
    this.birthdate = birthdate;
    return this;
  }

  /**
   * Client's birthdate
   * @return birthdate
  */
  @Valid 
  @Schema(name = "birthdate", example = "Wed Nov 27 03:00:00 MSK 1996", description = "Client's birthdate", required = false)
  public java.time.LocalDate getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(java.time.LocalDate birthdate) {
    this.birthdate = birthdate;
  }

  public ClientDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Client's passport series
   * @return passportSeries
  */
  
  @Schema(name = "passportSeries", example = "1234", description = "Client's passport series", required = false)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public ClientDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Client's passport series
   * @return passportNumber
  */
  
  @Schema(name = "passportNumber", example = "123456", description = "Client's passport series", required = false)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  public ClientDTO passportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
    return this;
  }

  /**
   * Client's passport issue date.
   * @return passportIssueDate
  */
  @Valid 
  @Schema(name = "passportIssueDate", example = "Sun Nov 27 03:00:00 MSK 2016", description = "Client's passport issue date.", required = false)
  public java.time.LocalDate getPassportIssueDate() {
    return passportIssueDate;
  }

  public void setPassportIssueDate(java.time.LocalDate passportIssueDate) {
    this.passportIssueDate = passportIssueDate;
  }

  public ClientDTO passportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
    return this;
  }

  /**
   * Client's passport issue branch.
   * @return passportIssueBranch
  */
  
  @Schema(name = "passportIssueBranch", example = "123-456", description = "Client's passport issue branch.", required = false)
  public String getPassportIssueBranch() {
    return passportIssueBranch;
  }

  public void setPassportIssueBranch(String passportIssueBranch) {
    this.passportIssueBranch = passportIssueBranch;
  }

  public ClientDTO maritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
    return this;
  }

  /**
   * Client's marital status.
   * @return maritalStatus
  */
  
  @Schema(name = "maritalStatus", example = "SINGLE", description = "Client's marital status.", required = false)
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }

  public ClientDTO dependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
    return this;
  }

  /**
   * Client's dependents amount.
   * @return dependentAmount
  */
  
  @Schema(name = "dependentAmount", example = "1", description = "Client's dependents amount.", required = false)
  public Integer getDependentAmount() {
    return dependentAmount;
  }

  public void setDependentAmount(Integer dependentAmount) {
    this.dependentAmount = dependentAmount;
  }

  public ClientDTO employment(EmploymentDTO employment) {
    this.employment = employment;
    return this;
  }

  /**
   * Get employment
   * @return employment
  */
  @Valid 
  @Schema(name = "employment", required = false)
  public EmploymentDTO getEmployment() {
    return employment;
  }

  public void setEmployment(EmploymentDTO employment) {
    this.employment = employment;
  }

  public ClientDTO account(String account) {
    this.account = account;
    return this;
  }

  /**
   * Client's master account.
   * @return account
  */
  
  @Schema(name = "account", example = "11223344556677889900", description = "Client's master account.", required = false)
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
    ClientDTO clientDTO = (ClientDTO) o;
    return Objects.equals(this.firstName, clientDTO.firstName) &&
        Objects.equals(this.lastName, clientDTO.lastName) &&
        Objects.equals(this.middleName, clientDTO.middleName) &&
        Objects.equals(this.email, clientDTO.email) &&
        Objects.equals(this.gender, clientDTO.gender) &&
        Objects.equals(this.birthdate, clientDTO.birthdate) &&
        Objects.equals(this.passportSeries, clientDTO.passportSeries) &&
        Objects.equals(this.passportNumber, clientDTO.passportNumber) &&
        Objects.equals(this.passportIssueDate, clientDTO.passportIssueDate) &&
        Objects.equals(this.passportIssueBranch, clientDTO.passportIssueBranch) &&
        Objects.equals(this.maritalStatus, clientDTO.maritalStatus) &&
        Objects.equals(this.dependentAmount, clientDTO.dependentAmount) &&
        Objects.equals(this.employment, clientDTO.employment) &&
        Objects.equals(this.account, clientDTO.account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, middleName, email, gender, birthdate, passportSeries, passportNumber, passportIssueDate, passportIssueBranch, maritalStatus, dependentAmount, employment, account);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientDTO {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
    sb.append("    passportIssueDate: ").append(toIndentedString(passportIssueDate)).append("\n");
    sb.append("    passportIssueBranch: ").append(toIndentedString(passportIssueBranch)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    dependentAmount: ").append(toIndentedString(dependentAmount)).append("\n");
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

