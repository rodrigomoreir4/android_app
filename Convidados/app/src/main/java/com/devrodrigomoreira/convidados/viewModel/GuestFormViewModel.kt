package com.devrodrigomoreira.convidados.viewModel

import androidx.lifecycle.ViewModel
import com.devrodrigomoreira.convidados.repository.GuestRepository

class GuestFormViewModel : ViewModel() {

    private val repository = GuestRepository.getInstance()

}