package model.customer;

public class Customer {
        private Integer id;
        private TypeCustomer typeCustomerId;
        private String customerCode;
        private String name;
        private String birthday;
        private Integer gender;
        private String idCard;
        private String phone;
        private String email;
        private String address;

        public Customer(Integer id, TypeCustomer typeCustomerId, String customerCode, String name, String birthday, Integer gender, String idCard, String phone, String email, String address) {
                this.id = id;
                this.typeCustomerId = typeCustomerId;
                this.customerCode = customerCode;
                this.name = name;
                this.birthday = birthday;
                this.gender = gender;
                this.idCard = idCard;
                this.phone = phone;
                this.email = email;
                this.address = address;
        }

        public Customer() {
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public TypeCustomer getTypeCustomerId() {
                return typeCustomerId;
        }

        public void setTypeCustomerId(TypeCustomer typeCustomerId) {
                this.typeCustomerId = typeCustomerId;
        }

        public String getCustomerCode() {
                return customerCode;
        }

        public void setCustomerCode(String customerCode) {
                this.customerCode = customerCode;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getBirthday() {
                return birthday;
        }

        public void setBirthday(String birthday) {
                this.birthday = birthday;
        }

        public Integer getGender() {
                return gender;
        }

        public void setGender(Integer gender) {
                this.gender = gender;
        }

        public String getIdCard() {
                return idCard;
        }

        public void setIdCard(String idCard) {
                this.idCard = idCard;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        @Override
        public String toString() {
                return "Customer{" +
                        "id=" + id +
                        ", typeCustomerId=" + typeCustomerId +
                        ", customerCode='" + customerCode + '\'' +
                        ", name='" + name + '\'' +
                        ", birthday='" + birthday + '\'' +
                        ", gender=" + gender +
                        ", idCard='" + idCard + '\'' +
                        ", phone='" + phone + '\'' +
                        ", email='" + email + '\'' +
                        ", address='" + address + '\'' +
                        '}';
        }
}
