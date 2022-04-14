package model;

public class Client {
    private String name;
    private String address;
    private String email;

    public Client(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    private Client(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private String address;
        private String email;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}
