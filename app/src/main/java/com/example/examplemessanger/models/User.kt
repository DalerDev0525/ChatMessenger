package com.example.examplemessanger.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User(val uid: String, val username: String, val profilImageUrl: String) : Parcelable {
    constructor() : this("", "", "")
}