package com.example.testedannilo;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    public String ID;
    public String nome;
    public String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario(String ID, String nome, String cpf) {
        this.ID = ID;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Usuario() {

    }

    protected Usuario(Parcel in) {
        ID = in.readString();
        nome = in.readString();
        cpf = in.readString();
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(ID);
        dest.writeString(nome);
        dest.writeString(cpf);

    }
}
