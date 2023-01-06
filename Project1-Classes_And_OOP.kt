package com.example.tuwiq

fun main() {
    var t = Task(1, "test", "cooking", false)
    var c = t.copy(2, Note = "drawing")
    var b = t.copy(3, Note = "studying")
    var to = Todo()
    to.add(t)
    to.add(c)
    to.add(b)
    to.printAll()
    to.change(c)
    to.printSpecific(2)
    to.remove(c)
    to.printAll()


}

data class Task(
    val ID: Int,
    val Name: String,
    val Note: String,
    var isCompleted: Boolean = false
)

class Todo() {
    var tasks = arrayListOf<Task>()
        private set

    fun printAll() {
        for (task in tasks) {
            println(task)
        }
    }

    fun add(NewTask: Task) {
        tasks.add(NewTask)
        println("The new task has been added ${NewTask.Note}")
    }

    fun remove(DelTask: Task) {
        tasks.remove(DelTask)
        println("The requested task has been removed: ${DelTask.Note}")
    }

    fun printSpecific(ID: Int) {
        for (index in tasks.indices) {
            if (tasks[index].ID == ID) {
                println("ID: ${tasks[index].ID}")
                println("Name: ${tasks[index].Name}")
                println("Note: ${tasks[index].Note}")
                println("Completed: ${tasks[index].isCompleted}")
            }
        }
    }

    fun change(changeTask: Task) {
        changeTask.isCompleted = !changeTask.isCompleted
    }


}

