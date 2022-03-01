package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
//import kotlinx.android.synthetic.main.item_todo.view.*
//ei suostu importtaa xml filee
class todoadapter(
    private val todos: MutableList<todo>
) : RecyclerView.Adapter<todoadapter.todoviewholder>() {
    class todoviewholder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): todoviewholder {
        return todoviewholder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }
    
    private fun togglestrikethrough(tvTodoTitle: TextView, isChecked: Boolean){
       /* if (isChecked){
            tvTodoTitle.paintFlags = tvTodoTitle.paintFlags or STRIKE_THRU_TEXT_FLAG
        }else{
            tvTodoTitle.paintFlags = tvTodoTitle.paintFlags and STRIKE_THRU_TEXT_FLAG.inv()
        }*/
    }

    override fun onBindViewHolder(holder: todoviewholder, position: Int) {
        val curtodo = todos[position]
        holder.itemView.apply { 
            tvTodoTitle
           /* cbdone.isCheckd =curtodo.ischecked
            togglestrikethrough(tvTodoTitle, curtodo.ischecked)
            cbdone.set*/
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}