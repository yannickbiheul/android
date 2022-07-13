package com.example.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PlanteViewModel(PlanteDao: PlanteDao,
                      application: Application) : AndroidViewModel(application) {

    lateinit var listePlantes : LiveData<List<Plante>>

    init {
        viewModelScope.launch {
            listePlantes = PlanteDao.getAll()
        }
    }

}
