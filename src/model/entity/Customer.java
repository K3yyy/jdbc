package model.entity;


public class Customer {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private String address;

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer(Integer id, String name ,String email, String phone, String address) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
