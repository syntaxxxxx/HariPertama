package com.fiqri.haripertama.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {

    // pojo adalah plain old java object
    // variable atau property
    // function nya / ada method

    // 3 fungsi
    // 1 : kirim data dalam jumlah banyak
    // 2 : untuk akses database sqlite local android
    // 3 : kirim request dan terima response data dari server

    private String name, job, tinggal, asal;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTinggal() {
        return tinggal;
    }

    public void setTinggal(String tinggal) {
        this.tinggal = tinggal;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.job);
        dest.writeString(this.tinggal);
        dest.writeString(this.asal);
        dest.writeInt(this.age);
    }

    public Person() {
    }

    protected Person(Parcel in) {
        this.name = in.readString();
        this.job = in.readString();
        this.tinggal = in.readString();
        this.asal = in.readString();
        this.age = in.readInt();
    }

    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
