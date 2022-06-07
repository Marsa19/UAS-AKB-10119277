package com.example.uts_10119277;
//10119277-Muhamad Marsa-IF7
import android.database.Cursor;

import com.example.uts_10119277.model.Note;

public interface NoteInterface {
    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}