package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

public record MetroTicketPrice(
    @SerializedName("Id") int id,
    @SerializedName("TicketName") String ticketName,
    @SerializedName("Price") double price,
    @SerializedName("Currency") String currency
) {}
