/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.warungproject2;

/**
 *
 * @author IkoAlmasDevGame
 */
public class barang {
    public String kd,nama;
    public int jml;
    public double hrg,ttl,ub,uk;
    
    public void setKd(String val){
        kd = val;
    }
    public String getKd(){
        return kd;
    }
    public void setNm(String val){
        nama = val;
    }
    public String getNm(){
        return nama;
    }
    public void setHrg(Double val){
        hrg = val;
    }
    public double getHrg(){
        return hrg;
    }
    public void setJml(int val){
        jml = val;
    }
    public int getJml(){
        return jml;
    }
    public double getTot(){
        ttl = hrg*jml;
        return (ttl);
    }
    public void setUb(double val){
        ub = val;
    }
    public double getUb(){
        return ub;
    }
    public double getUk(){
        return (ub - ttl);
    }
    
    public void setSeleksiKd(){
        if(kd.equalsIgnoreCase("Shampo")){
            nama = "Shampo";
            hrg = 9000;
        }else if(kd.equalsIgnoreCase("Sikat Gigi")){
            nama = "Sikat Gigi";
            hrg = 7500;
        }else if(kd.equalsIgnoreCase("Pasta Gigi")){
            nama = "Pasta Gigi";
            hrg = 8200;
        }else if(kd.equalsIgnoreCase("Softex")){
            nama = "Softex";
            hrg = 6500;
        }else if(kd.equalsIgnoreCase("Testpack")){
            nama = "Testpack";
            hrg = 5000;
        }else if(kd.equalsIgnoreCase("Cukuran Kumis")){
            nama = "Cukuran Kumis";
            hrg = 10000;
        }else if(kd.equalsIgnoreCase("Pewangi Pakaian")){
            nama = "Pewangi Pakaian";
            hrg = 18000;
        }else if(kd.equalsIgnoreCase("Pewangi Lantai")){
            nama = "Pewangi Lantai";
            hrg = 16500;
        }else if(kd.equalsIgnoreCase("Sabun Mandi")){
            nama = "Sabun Mandi";
            hrg = 10000;
        }else if(kd.equalsIgnoreCase("Sabun Pakaian")){
            nama = "Sabun Pakaian";
            hrg = 13500;
        }else if(kd.equalsIgnoreCase("Sapu")){
            nama = "Sapu";
            hrg = 20000;
        }else if(kd.equalsIgnoreCase("Pel")){
            nama = "Pel";
            hrg = 19250;
        }else if(kd.equalsIgnoreCase("Baygon")){
            nama = "Baygon";
            hrg = 17000;
        }else if(kd.equalsIgnoreCase("Susu Cokelat")){
            nama = "Susu Cokelat";
            hrg = 6000;
        }else if(kd.equalsIgnoreCase("Susu Strawberry")){
            nama = "Susu Strawberry";
            hrg = 6000;
        }else if(kd.equalsIgnoreCase("Susu Vanilla")){
            nama = "Susu Vanilla";
            hrg = 6000;
        }else if(kd.equalsIgnoreCase("Susu Karamel")){
            nama = "Susu Karamel";
            hrg = 6000;
        }else if(kd.equalsIgnoreCase("Nu Green Tea")){
            nama = "Nu Green Tea";
            hrg = 4500;
        }else if(kd.equalsIgnoreCase("Teh Kotak")){
            nama = "Teh Kotak";
            hrg = 5000;
        }else if(kd.equalsIgnoreCase("Cimory Squishy")){
            nama = "Cimory Squishy";
            hrg = 10000;
        }else if(kd.equalsIgnoreCase("Cimory Drink")){
            nama = "Cimory Drink";
            hrg = 9500;
        }else if(kd.equalsIgnoreCase("Cimory Yogurt")){
            nama = "Cimory Yogurt";
            hrg = 7000;
        }else if(kd.equalsIgnoreCase("Pocari Sweet")){
            nama = "Pocari Sweet";
            hrg = 8000;
        }else if(kd.equalsIgnoreCase("Cap Kaki Tiga")){
            nama = "Cap Kaki Tiga";
            hrg = 6500;
        }else if(kd.equalsIgnoreCase("Cap Badak")){
            nama = "Cap Badak";
            hrg = 7000;
        }else if(kd.equalsIgnoreCase("Teh Melati")){
            nama = "Teh Melati";
            hrg = 9000;
        }else if(kd.equalsIgnoreCase("Good Day Capuccino")){
            nama = "Good Day Capuccino";
            hrg = 7000;
        }else if(kd.equalsIgnoreCase("Coco Hydro")){
            nama = "Coco Hydro";
            hrg = 7500;
        }else if(kd.equalsIgnoreCase("Oreo Cokelat")){
            nama = "Oreo Cokelat";
            hrg = 6250;
        }else if(kd.equalsIgnoreCase("Oreo Strawberry")){
            nama = "Oreo Strawberry";
            hrg = 6500;
        }else if(kd.equalsIgnoreCase("Oreo Vanilla")){
            nama = "Oreo Vanilla";
            hrg = 6250;
        }else if(kd.equalsIgnoreCase("Beng Beng Cokelat")){
            nama = "Beng Beng Cokelat";
            hrg = 12000;
        }else if(kd.equalsIgnoreCase("Biskuat")){
            nama = "Biskuat";
            hrg = 7000;
        }else if(kd.equalsIgnoreCase("Poki Poki Cokelat")){
            nama = "Poki Poki Cokelat";
            hrg = 9000;
        }else if(kd.equalsIgnoreCase("Poki Poki Strawberry")){
            nama = "Poki Poki Strawberry";
            hrg = 9000;
        }else if(kd.equalsIgnoreCase("Poki Poki Matcha Tea")){
            nama = "Poki Poki Matcha Tea";
            hrg = 9000;
        }else if(kd.equalsIgnoreCase("Coco Crunch")){
            nama = "Coco Crunch";
            hrg = 7000;
        }else if(kd.equalsIgnoreCase("Taro")){
            nama = "Taro";
            hrg = 9500;
        }else if(kd.equalsIgnoreCase("Chiki Balls")){
            nama = "Chiki Balls";
            hrg = 8500;
        }else if(kd.equalsIgnoreCase("Superstar")){
            nama = "Superstar";
            hrg = 8000;
        }else if(kd.equalsIgnoreCase("Regal Biskuit")){
            nama = "Regal Biskuit";
            hrg = 7800;
        }else{
            nama = "";
            hrg = 0;
        }
    }
}
