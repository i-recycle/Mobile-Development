package com.bangkit.academy.wastemanagement.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wasteEntity")
data class WasteEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey
    var id: Int,

    @ColumnInfo(name = "wasteType")
    @NonNull
    var wasteType: String,

    @ColumnInfo(name = "description")
    @NonNull
    var description: String
)