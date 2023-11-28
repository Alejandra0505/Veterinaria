package Adaptadores

import com.example.veterinaria.DataBase.Entities.ControlVacunas
import com.example.veterinaria.DataBase.Entities.Mascotas
import com.example.veterinaria.controles

interface ControlesAdaptadorListener {
    fun onDeleteItemClick(controlVacunas: controles)
    fun onEditItemClick(controlVacunas: controles)
}