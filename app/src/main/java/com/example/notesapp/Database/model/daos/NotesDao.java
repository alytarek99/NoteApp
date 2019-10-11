package com.example.notesapp.Database.model.daos;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.notesapp.Database.model.Note;

import java.util.List;

public interface NotesDao {

    @Insert
    void addNote (Note note);

    @Delete
    void deleteNote(Note note);


     @Query("select * from note where id=:id")
     Note saearchNoteById(int id );

    @Query("select * from note")
  List<Note> getAllNotes();

}
