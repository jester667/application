package ru.neoflex.msapplication.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Credit&#39;s info.
 */

@Schema(name = "CreditDTO", description = "Credit's info.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-09T15:12:26.307569700+03:00[Europe/Moscow]")
public class CreditDTO   {

  @JsonProperty("amount")
  private java.math.BigDecimal amount;

  @JsonProperty("term")
  private Integer term;

  @JsonProperty("monthlyPayment")
  private java.math.BigDecimal monthlyPayment;

  @JsonProperty("rate")
  private java.math.BigDecimal rate;

  @JsonProperty("psk")
  private java.math.BigDecimal psk;

  @JsonProperty("isInsuranceEnabled")
  private Boolean isInsuranceEnabled;

  @JsonProperty("isSalaryClient")
  private Boolean isSalaryClient;

  @JsonProperty("paymentSchedule")
  @Valid
  private List<PaymentScheduleElement> paymentSchedule = null;

  public CreditDTO amount(java.math.BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Requested loan amount.
   * @return amount
  */
  @Valid 
  @Schema(name = "amount", example = "1000000", description = "Requested loan amount.", required = false)
  public java.math.BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(java.math.BigDecimal amount) {
    this.amount = amount;
  }

  public CreditDTO term(Integer term) {
    this.term = term;
    return this;
  }

  /**
   * Requested loan term (months).
   * @return term
  */
  
  @Schema(name = "term", example = "24", description = "Requested loan term (months).", required = false)
  public Integer getTerm() {
    return term;
  }

  public void setTerm(Integer term) {
    this.term = term;
  }

  public CreditDTO monthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
    return this;
  }

  /**
   * Monthly payment.
   * @return monthlyPayment
  */
  @Valid 
  @Schema(name = "monthlyPayment", example = "10000.1", description = "Monthly payment.", required = false)
  public java.math.BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(java.math.BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public CreditDTO rate(java.math.BigDecimal rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Loan rate
   * @return rate
  */
  @Valid 
  @Schema(name = "rate", example = "12.5", description = "Loan rate", required = false)
  public java.math.BigDecimal getRate() {
    return rate;
  }

  public void setRate(java.math.BigDecimal rate) {
    this.rate = rate;
  }

  public CreditDTO psk(java.math.BigDecimal psk) {
    this.psk = psk;
    return this;
  }

  /**
   * Loan Full Price
   * @return psk
  */
  @Valid 
  @Schema(name = "psk", example = "12.5", description = "Loan Full Price", required = false)
  public java.math.BigDecimal getPsk() {
    return psk;
  }

  public void setPsk(java.math.BigDecimal psk) {
    this.psk = psk;
  }

  public CreditDTO isInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
    return this;
  }

  /**
   * Is insurance enabled?
   * @return isInsuranceEnabled
  */
  
  @Schema(name = "isInsuranceEnabled", example = "true", description = "Is insurance enabled?", required = false)
  public Boolean getIsInsuranceEnabled() {
    return isInsuranceEnabled;
  }

  public void setIsInsuranceEnabled(Boolean isInsuranceEnabled) {
    this.isInsuranceEnabled = isInsuranceEnabled;
  }

  public CreditDTO isSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
    return this;
  }

  /**
   * Is salary client?
   * @return isSalaryClient
  */
  
  @Schema(name = "isSalaryClient", example = "true", description = "Is salary client?", required = false)
  public Boolean getIsSalaryClient() {
    return isSalaryClient;
  }

  public void setIsSalaryClient(Boolean isSalaryClient) {
    this.isSalaryClient = isSalaryClient;
  }

  public CreditDTO paymentSchedule(List<PaymentScheduleElement> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
    return this;
  }

  public CreditDTO addPaymentScheduleItem(PaymentScheduleElement paymentScheduleItem) {
    if (this.paymentSchedule == null) {
      this.paymentSchedule = new ArrayList<PaymentScheduleElement>();
    }
    this.paymentSchedule.add(paymentScheduleItem);
    return this;
  }

  /**
   * Get paymentSchedule
   * @return paymentSchedule
  */
  @Valid 
  @Schema(name = "paymentSchedule", required = false)
  public List<PaymentScheduleElement> getPaymentSchedule() {
    return paymentSchedule;
  }

  public void setPaymentSchedule(List<PaymentScheduleElement> paymentSchedule) {
    this.paymentSchedule = paymentSchedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditDTO creditDTO = (CreditDTO) o;
    return Objects.equals(this.amount, creditDTO.amount) &&
        Objects.equals(this.term, creditDTO.term) &&
        Objects.equals(this.monthlyPayment, creditDTO.monthlyPayment) &&
        Objects.equals(this.rate, creditDTO.rate) &&
        Objects.equals(this.psk, creditDTO.psk) &&
        Objects.equals(this.isInsuranceEnabled, creditDTO.isInsuranceEnabled) &&
        Objects.equals(this.isSalaryClient, creditDTO.isSalaryClient) &&
        Objects.equals(this.paymentSchedule, creditDTO.paymentSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, term, monthlyPayment, rate, psk, isInsuranceEnabled, isSalaryClient, paymentSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    monthlyPayment: ").append(toIndentedString(monthlyPayment)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    psk: ").append(toIndentedString(psk)).append("\n");
    sb.append("    isInsuranceEnabled: ").append(toIndentedString(isInsuranceEnabled)).append("\n");
    sb.append("    isSalaryClient: ").append(toIndentedString(isSalaryClient)).append("\n");
    sb.append("    paymentSchedule: ").append(toIndentedString(paymentSchedule)).append("\n");
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

