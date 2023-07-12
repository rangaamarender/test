package com.lucid.recruit.contract.vo;

import com.lucid.core.vo.BaseVO;

import java.util.Date;

public class ContractWorkOrderVO extends BaseVO {
    private String contractWorOrderID;
    private String contractID;
    private String workOrderCode;
    private String paymentTermCode;
    private String paymentTerms;
    private String invoiceCycleCode;
    private Date startDt;
    private Date endDt;
    private ContractVO contract;

    /**
     * @return contractWorkOrderID
     */
    public String getContractWorOrderID() {
        return contractWorOrderID;
    }

    /**
     * @param contractWorOrderID
     */
    public void setContractWorOrderID(String contractWorOrderID) {
        this.contractWorOrderID = contractWorOrderID;
    }

    /**
     * @return contractId
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * @param contractID
     */
    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    /**
     * @return workOrderCode
     */
    public String getWorkOrderCode() {
        return workOrderCode;
    }

    /**
     * @param workOrderCode
     */
    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    /**
     * @return paymentTermCode
     */
    public String getPaymentTermCode() {
        return paymentTermCode;
    }

    /**
     * @param paymentTermCode
     */
    public void setPaymentTermCode(String paymentTermCode) {
        this.paymentTermCode = paymentTermCode;
    }

    /**
     * @return paymentTerms
     */
    public String getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * @param paymentTerms
     */
    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    /**
     * @return invoiceCycleCode
     */
    public String getInvoiceCycleCode() {
        return invoiceCycleCode;
    }

    /**
     * @param invoiceCycleCode
     */
    public void setInvoiceCycleCode(String invoiceCycleCode) {
        this.invoiceCycleCode = invoiceCycleCode;
    }

    /**
     * @return startDt
     */
    public Date getStartDt() {
        return startDt;
    }

    /**
     * @param startDt
     */
    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

    /**
     * @return endDt
     */
    public Date getEndDt() {
        return endDt;
    }

    /**
     * @param endDt
     */
    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    /**
     * @return contract
     */
    public ContractVO getContract() {
        return contract;
    }

    /**
     * @param contract
     */
    public void setContract(ContractVO contract) {
        this.contract = contract;
    }

}
