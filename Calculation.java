/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Calculation {

    double sisi;
    double Panjang, Lebar, Tinggi;
    double Jari;

    public Calculation(int sisi) {
        this.sisi = sisi;

    }

    public Calculation(double Panjang, double Tinggi, double Lebar) {
        this.Panjang = Panjang;
        this.Tinggi = Tinggi;
        this.Lebar = Lebar;
    }

    public Calculation(double Jari, double Tinggi) {
        this.Jari = Jari;
        this.Tinggi = Tinggi;
    }

    public Calculation(double Jari) {
        this.Jari = Jari;
    }

    public double calVolumeKubus() {
        return Math.pow(sisi, 3);
    }

    public double calLuasKubus() {
        return 6.0 * Math.pow(sisi, 2);
    }

    public double calVolumeBalok() {
        return Panjang * Lebar * Tinggi;
    }

    public double calLuasBalok() {
        return 2.0 * (Panjang * Lebar + Panjang * Tinggi + Lebar * Tinggi);
    }

    public double calVolumeSilinder() {
        return (Math.PI * Math.pow(Jari, 2)) * Tinggi;
    }

    public double calLuasSilinder() {
        return 2.0 * Math.PI * Jari * (Jari + Tinggi);
    }

    public double calVolumeBola() {

        System.out.println(Jari);
        return 4.0 / 3.0 * Math.PI * Math.pow(Jari, 3);
    }

    public double calLuasBola() {
        return 4.0 * Math.PI * Math.pow(Jari, 2);
    }

}
