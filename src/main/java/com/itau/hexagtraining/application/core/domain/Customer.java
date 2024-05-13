package com.itau.hexagtraining.application.core.domain;

public class Customer {

    //region Atributos
    private String id;
    private String name;
    private Address adress;
    private String cpf;
    private Boolean isValidCpf;
    //endregion

    //region Construtores
   public Customer(){
       this.isValidCpf = false;
   }


    public Customer(String id, String name, Address adress, String cpf, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
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

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
    //endregion
}
