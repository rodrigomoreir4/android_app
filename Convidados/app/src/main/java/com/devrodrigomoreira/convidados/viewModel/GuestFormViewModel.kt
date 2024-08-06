package com.devrodrigomoreira.convidados.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.devrodrigomoreira.convidados.model.GuestModel
import com.devrodrigomoreira.convidados.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

    fun insert(guestModel: GuestModel){
        repository.insert(guestModel)
    }

}