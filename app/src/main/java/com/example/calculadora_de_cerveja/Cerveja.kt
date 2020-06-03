package com.Ap1.comparadordecerveja

import android.os.Parcel
import android.os.Parcelable

class Cerveja(val marca: String?, val volume: Double, val preco: Double) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(marca)
        parcel.writeDouble(volume)
        parcel.writeDouble(preco)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cerveja> {
        override fun createFromParcel(parcel: Parcel): Cerveja {
            return Cerveja(parcel)
        }

        override fun newArray(size: Int): Array<Cerveja?> {
            return arrayOfNulls(size)
        }
    }

}