package com.example.workoutapp

class ExerciseModel(
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean

    ){

    fun getId() : Int{
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getName() : String{
        return name
    }

    fun setName(id: String) {
        this.name = name
    }

    fun getImage() : Int{
        return image
    }

    fun setImage(id: Int) {
        this.image = image
    }

    fun getIsCompleted() : Boolean{
        return isCompleted
    }

    fun setIsCompleted(id: Boolean) {
        this.isCompleted = isCompleted
    }
    fun getIsSelected() : Boolean{
        return isSelected
    }

    fun setIsSelected(id: Boolean) {
        this.isSelected = isSelected
    }
}