package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;
import org.mesutormanli.ibbwsclient.model.base.BaseDataModel;

import java.util.Objects;

public class MetroTicketPrice extends BaseDataModel {

    @SerializedName("Id")
    private int id;

    @SerializedName("TicketName")
    private String ticketName;

    @SerializedName("Price")
    private double price;

    @SerializedName("Currency")
    private String currency;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MetroTicketPrice that = (MetroTicketPrice) o;
        return id == that.id &&
                Double.compare(that.price, price) == 0 &&
                Objects.equals(ticketName, that.ticketName) &&
                Objects.equals(currency, that.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ticketName, price, currency);
    }

    @Override
    public String toString() {
        return "MetroTicketPrice{" +
                "id=" + id +
                ", ticketName='" + ticketName + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }
}
