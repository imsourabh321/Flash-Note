package com.sourya.flashnote.listeners;

import com.sourya.flashnote.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
