package com.lucid.recruit.contract.vo;

import com.lucid.core.vo.BaseVO;

public class ContractWorkOrderRateVO extends BaseVO{

    private String contractWorOrderRateID;
    private String contractWorOrderID;
    private Double workOrderRate;
    private String workOrderType;
    private String rateCode;
    private Double discount;
    private String discountCode;
    private Double netRate;
    private ContractWorkOrderVO contractWorkOrder;

    /**
     * @return contractWorOrderRateID
     */
    public String getContractWorOrderRateID() {
        return contractWorOrderRateID;
    }

    /**
     * @param contractWorOrderRateID
     */
    public void setContractWorOrderRateID(String contractWorOrderRateID) {
        this.contractWorOrderRateID = contractWorOrderRateID;
    }

    /**
     * @return contractWorOrderID
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
     * @return workOrderRate
     */
    public Double getWorkOrderRate() {
        return workOrderRate;
    }

    /**
     * @param workOrderRate
     */
    public void setWorkOrderRate(Double workOrderRate) {
        this.workOrderRate = workOrderRate;
    }

    /**
     * @return
     */
    public String getWorkOrderType() {
        return workOrderType;
    }

    /**
     * @param workOrderType
     */
    public void setWorkOrderType(String workOrderType) {
        this.workOrderType = workOrderType;
    }

    /**
     * @return rateCode
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * @param rateCode
     */
    public void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    /**
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * @return discountCode
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * @param discountCode
     */
    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    /**
     * @return netRate
     */
    public Double getNetRate() {
        return netRate;
    }

    /**
     * @param netRate
     */
    public void setNetRate(Double netRate) {
        this.netRate = netRate;
    }

    /**
     * @return contractWorkOrderVO
     */
    public ContractWorkOrderVO getContractWorkOrder() {
        return contractWorkOrder;
    }

    /**
     * @param contractWorkOrder
     */
    public void setContractWorkOrder(ContractWorkOrderVO contractWorkOrder) {
        this.contractWorkOrder = contractWorkOrder;
    }

}
