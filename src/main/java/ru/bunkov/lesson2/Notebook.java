package ru.bunkov.lesson2;

public class Notebook {

    private int price;

    private int RAM;

    private String logo;

    public Notebook(int price, int RAM, String logo) {
        this.price = price;
        this.RAM = RAM;
        this.logo = logo;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", RAM=" + RAM +
                ", logo='" + logo + '\'' +
                '}';
    }
}
