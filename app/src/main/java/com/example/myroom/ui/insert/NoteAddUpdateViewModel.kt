package com.example.myroom.ui.insert

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.myroom.database.Note
import com.example.myroom.repository.NoteRepository


//class ini dibangun sebagai penghubung repository dengan Activity
class NoteAddUpdateViewModel(application: Application): ViewModel() {
    private val mNoteRepository: NoteRepository = NoteRepository(application)

    fun getAllNotes(): LiveData<List<Note>> =
        mNoteRepository.getAllNotes()

    fun insert(note: Note){
        mNoteRepository.insert(note)
    }

    fun update(note: Note){
        mNoteRepository.update(note)
    }

    fun delete(note: Note){
        mNoteRepository.delete(note)
    }
}