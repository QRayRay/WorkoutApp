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
}