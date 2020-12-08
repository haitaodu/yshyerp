package com.smartflow.yshyerp.crc.dto.page;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/11/30 10:56
 * @description：${description}
 * @modified By：
 * @version: version
 */

public class OutAndInQuantityPage implements Serializable {
    private String crcNo;
    private String workNo;
    private String agreementNo;
    private String customer;
    private String productType;
    private String containerNo;
    private Date   time;
    private boolean state;

    public String getCrcNo() {
        return crcNo;
    }

    public void setCrcNo(String crcNo) {
        this.crcNo = crcNo;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
    }

    public String getAgreementNo() {
        return agreementNo;
    }

    public void setAgreementNo(String agreementNo) {
        this.agreementNo = agreementNo;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getContainerNo() {
        return containerNo;
    }

    public void setContainerNo(String containerNo) {
        this.containerNo = containerNo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OutAndInQuantityPage{" +
                "crcNo='" + crcNo + '\'' +
                ", workNo='" + workNo + '\'' +
                ", agreementNo='" + agreementNo + '\'' +
                ", customer='" + customer + '\'' +
                ", productType='" + productType + '\'' +
                ", containerNo='" + containerNo + '\'' +
                ", time=" + time +
                ", state=" + state +
                '}';
    }
}
