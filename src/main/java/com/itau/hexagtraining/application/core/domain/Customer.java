package com.itau.hexagtraining.application.core.domain;

public class Customer {

    //region Atributos
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean validCpf;
    //endregion

    //region Construtores
   public Customer(){
       this.isValidCpf = false;
   }


    public Customer(String id, String name, Address address, String cpf, Boolean validCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.validCpf = validCpf;
    }
    //endregion

    //region Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getvalidCpf() {
        return validCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        validCpf = validCpf;
    }
    //endregion
}
