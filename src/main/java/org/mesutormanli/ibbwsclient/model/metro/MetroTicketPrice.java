package org.mesutormanli.ibbwsclient.model.metro;

import com.google.gson.annotations.SerializedName;

/**
 * Metro İstanbul bir bilet fiyatını temsil eder.
 */
public record MetroTicketPrice(
    /** Fiyat kaydının kimliği. */
    @SerializedName("Id") int id,
    /** Bilet adı. */
    @SerializedName("TicketName") String ticketName,
    /** Bilet fiyatı. */
    @SerializedName("Price") double price,
    /** Para birimi. */
    @SerializedName("Currency") String currency
) {}
