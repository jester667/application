package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Short application info.
 */

@Schema(name = "LoanApplicationRequestDTO", description = "Short application info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class LoanApplicationRequestDTO   {

  @JsonProperty("amount")
  private java.math.BigDecimal amount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("birthdate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private java.time.LocalDate birthdate;

  @JsonProperty("passportSeries")
  private String passportSeries;

  @JsonProperty("passportNumber")
  private String passportNumber;

  public LoanApplicationRequestDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Requested loan amount.
   * minimum: 10000
   * @return amount
  */
  @NotNull @Valid @DecimalMin("10000") 
  @Schema(name = "amount", example = "1000000", description = "Requested loan amount.", required = true)
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public LoanApplicationRequestDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Requested loan term (months).
   * minimum: 6
   * @return term
  */
  @NotNull @Min(6) 
  @Schema(name = "term", example = "24", description = "Requested loan term (months).", required = true)
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public LoanApplicationRequestDTO firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Client's first name
   * @return firstName
  */
  @NotNull @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "firstName", example = "Ivan", description = "Client's first name", required = true)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public LoanApplicationRequestDTO lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Client's last name
   * @return lastName
  */
  @NotNull @Pattern(regexp = "[A-Za-z\\-]{2,30}") 
  @Schema(name = "lastName", example = "Ivanov", description = "Client's last name", required = true)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LoanApplicationRequestDTO middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Client's middle name (if present).
   * @return middleName
  */
  @Pattern(regexp = "[A-Za-z]{2,30}") 
  @Schema(name = "middleName", example = "Ivanonovich", description = "Client's middle name (if present).", required = false)
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public LoanApplicationRequestDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Client's email.
   * @return email
  */
  @NotNull @Pattern(regexp = "[A-Za-z]{2,50}") 
  @Schema(name = "email", example = "iivanov@email.ru", description = "Client's email.", required = true)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LoanApplicationRequestDTO birthdate(java.time.LocalDate birthdate) {
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

  public LoanApplicationRequestDTO passportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
    return this;
  }

  /**
   * Client's passport series
   * @return passportSeries
  */
  @NotNull @Pattern(regexp = "[0-9]{4}") 
  @Schema(name = "passportSeries", example = "1234", description = "Client's passport series", required = true)
  public String getPassportSeries() {
    return passportSeries;
  }

  public void setPassportSeries(String passportSeries) {
    this.passportSeries = passportSeries;
  }

  public LoanApplicationRequestDTO passportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
    return this;
  }

  /**
   * Client's passport series
   * @return passportNumber
  */
  @NotNull @Pattern(regexp = "[0-9]{6}") 
  @Schema(name = "passportNumber", example = "123456", description = "Client's passport series", required = true)
  public String getPassportNumber() {
    return passportNumber;
  }

  public void setPassportNumber(String passportNumber) {
    this.passportNumber = passportNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanApplicationRequestDTO loanApplicationRequestDTO = (LoanApplicationRequestDTO) o;
    return Objects.equals(this.amount, loanApplicationRequestDTO.amount) &&
        Objects.equals(this.term, loanApplicationRequestDTO.term) &&
        Objects.equals(this.firstName, loanApplicationRequestDTO.firstName) &&
        Objects.equals(this.lastName, loanApplicationRequestDTO.lastName) &&
        Objects.equals(this.middleName, loanApplicationRequestDTO.middleName) &&
        Objects.equals(this.email, loanApplicationRequestDTO.email) &&
        Objects.equals(this.birthdate, loanApplicationRequestDTO.birthdate) &&
        Objects.equals(this.passportSeries, loanApplicationRequestDTO.passportSeries) &&
        Objects.equals(this.passportNumber, loanApplicationRequestDTO.passportNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, firstName, lastName, middleName, email, birthdate, passportSeries, passportNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanApplicationRequestDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    birthdate: ").append(toIndentedString(birthdate)).append("\n");
    sb.append("    passportSeries: ").append(toIndentedString(passportSeries)).append("\n");
    sb.append("    passportNumber: ").append(toIndentedString(passportNumber)).append("\n");
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

