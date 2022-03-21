package model.customer;

public class TypeCustomer {
    private  Integer customerTypeId;
    private  String customerTypeName;

    public TypeCustomer(Integer customerTypeId, String customerTypeName) {
        this.customerTypeId= customerTypeId;
        this.customerTypeName = customerTypeName;
    }

    public TypeCustomer() {
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerType) {
      this.customerTypeId = customerType;
    }

    public String getCustomerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customerTypeName) {
       this.customerTypeName = customerTypeName;
    }

    @Override
    public String toString() {
        return "TypeCustomer{" +
                "CustomerType=" + customerTypeId +
                ", CustomerTypeName='" + customerTypeName + '\'' +
                '}';
    }
}
