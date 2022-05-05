package com.example.phonebook.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean
) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "Alan Wake", "0954132879",  7, 2,false),
            NoteDbModel(2, "Hilarious Clinton Company ltd.", "0762145987",  3, 2,false),
            NoteDbModel(3, "Caius Cascade", "0246854321",  3, 2,false),
            NoteDbModel(4, "Dorothy Williams", "0876215792", 4,2, false),
            NoteDbModel(5, "Snoop Dog", "0254987625", 5,2, false),
            NoteDbModel(6, "Somebody Help", "0498513257", 6,3, false),

            )
    }
}
