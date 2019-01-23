package com.machioni.statedemo

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    //O ViewModel sobrevive a configurationChanges, mas nao à morte da activity ou do processo.
    //ver: https://developer.android.com/topic/libraries/architecture/saving-states
    //vantagem: é muito mais rápido do que persistir no bundle, nao tem limite de tamanho (sujeito a ram disponivel)
    //mas no fim das contas nao resolve todos os problemas.

    var string: String? = null
}
