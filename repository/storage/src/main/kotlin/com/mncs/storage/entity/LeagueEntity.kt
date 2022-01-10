package com.mncs.storage.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.mncs.data.model.League

@Entity(tableName = "league")
data class LeagueEntity(
    @PrimaryKey val uid: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "modified_at") val modifiedAt: Long = 0L,
) {
    fun transform(): League {
        return League(
            id = uid,
            name = name,
        )
    }
}
