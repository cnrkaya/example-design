package com.example.todoapp.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "yapilacaklar")
data class Yapilacaklar(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "is_id") @NotNull var isId: Int,
    @ColumnInfo(name = "yapilacak_is") @NotNull var yapilacakIs: String
) : Serializable {
}