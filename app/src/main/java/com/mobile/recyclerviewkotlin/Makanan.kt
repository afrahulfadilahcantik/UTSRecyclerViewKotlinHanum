package com.mobile.recyclerviewkotlin

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Makanan(
    val imgMakanan: Int,
    val nameMakanan: String,
    val descMakanan:  String
) : Parcelable
