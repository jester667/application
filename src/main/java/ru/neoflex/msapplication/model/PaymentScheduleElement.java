package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Payment schedule element.
 */

@Schema(name = "PaymentScheduleElement", description = "Payment schedule element.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class PaymentScheduleElement   {

  @JsonProperty("number")
  private Integer number;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private java.time.LocalDate date;

  @JsonProperty("totalPayment")
  private java.math.BigDecimal totalPayment;

  @JsonProperty("interestPayment")
  private java.math.BigDecimal interestPayment;

  @JsonProperty("loanPayment")
  private java.math.BigDecimal loanPayment;

  @JsonProperty("remainingDebt")
  private java.math.BigDecimal remainingDebt;

  public PaymentScheduleElement number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Payment sequence number.
   * @return number
  */
  
  @Schema(name = "number", example = "1", description = "Payment sequence number.", required = false)
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PaymentScheduleElement date(java.time.LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Payment date.
   * @return date
  */
  @Valid 
  @Schema(name = "date", example = "Wed Jun 01 03:00:00 MSK 2022", description = "Payment date.", required = false)
  public java.time.LocalDate getDate() {
    return date;
  }

  public void setDate(java.time.LocalDate date) {
    this.date = date;
  }

  public PaymentScheduleElement totalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
    return this;
  }

  /**
   * Total payment amount.
   * @return totalPayment
  */
  @Valid 
  @Schema(name = "totalPayment", example = "12000.0", description = "Total payment amount.", required = false)
  public java.math.BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(java.math.BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }

  public PaymentScheduleElement interestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
    return this;
  }

  /**
   * Interest payment amount.
   * @return interestPayment
  */
  @Valid 
  @Schema(name = "interestPayment", example = "12000.0", description = "Interest payment amount.", required = false)
  public java.math.BigDecimal getInterestPayment() {
    return interestPayment;
  }

  public void setInterestPayment(java.math.BigDecimal interestPayment) {
    this.interestPayment = interestPayment;
  }

  public PaymentScheduleElement loanPayment(java.math.BigDecimal loanPayment) {
    this.loanPayment = loanPayment;
    return this;
  }

  /**
   * Loan payment amount.
   * @return loanPayment
  */
  @Valid 
  @Schema(name = "loanPayment", example = "8000.0", description = "Loan payment amount.", required = false)
  public java.math.BigDecimal getLoanPayment() {
    return loanPayment;
  }

  public void setLoanPayment(java.math.BigDecimal loanPayment) {
    this.loanPayment = loanPayment;
  }

  public PaymentScheduleElement remainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
    return this;
  }

  /**
   * Remaining debt amount.
   * @return remainingDebt
  */
  @Valid 
  @Schema(name = "remainingDebt", example = "92000.0", description = "Remaining debt amount.", required = false)
  public java.math.BigDecimal getRemainingDebt() {
    return remainingDebt;
  }

  public void setRemainingDebt(java.math.BigDecimal remainingDebt) {
    this.remainingDebt = remainingDebt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentScheduleElement paymentScheduleElement = (PaymentScheduleElement) o;
    return Objects.equals(this.number, paymentScheduleElement.number) &&
        Objects.equals(this.date, paymentScheduleElement.date) &&
        Objects.equals(this.totalPayment, paymentScheduleElement.totalPayment) &&
        Objects.equals(this.interestPayment, paymentScheduleElement.interestPayment) &&
        Objects.equals(this.loanPayment, paymentScheduleElement.loanPayment) &&
        Objects.equals(this.remainingDebt, paymentScheduleElement.remainingDebt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, date, totalPayment, interestPayment, loanPayment, remainingDebt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentScheduleElement {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    totalPayment: ").append(toIndentedString(totalPayment)).append("\n");
    sb.append("    interestPayment: ").append(toIndentedString(interestPayment)).append("\n");
    sb.append("    loanPayment: ").append(toIndentedString(loanPayment)).append("\n");
    sb.append("    remainingDebt: ").append(toIndentedString(remainingDebt)).append("\n");
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

