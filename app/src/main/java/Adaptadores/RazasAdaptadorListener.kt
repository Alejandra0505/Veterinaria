package Adaptadores

import com.example.veterinaria.DataBase.Entities.Razas
import com.example.veterinaria.raza

interface RazasAdaptadorListener {
    fun onDeleteItemClick(razas: raza)
    fun onEditItemClick(razas:raza)
}