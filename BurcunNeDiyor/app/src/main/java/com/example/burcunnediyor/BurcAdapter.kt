package com.example.burcunnediyor

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class BurcAdapter(private val burclar: List<BurcData>) :
    RecyclerView.Adapter<BurcAdapter.BurcViewHolder>() {

    inner class BurcViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val burcAdi: TextView = itemView.findViewById(R.id.zodburcadi)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val burc = burclar[position]
                    showAlertDialog(itemView.context, burc)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BurcViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.burclar_list, parent, false)
        return BurcViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BurcViewHolder, position: Int) {
        val burc = burclar[position]
        holder.imageView.setImageResource(burc.zodiacimagename)
        holder.burcAdi.text = burc.zodiacname
        holder.burcAdi.setTextColor(Color.WHITE) // Metin rengini beyaza ayarla
    }

    override fun getItemCount(): Int {
        return burclar.size
    }

    private fun showAlertDialog(context: Context, burc: BurcData) {
        val builder = AlertDialog.Builder(context)
        val title = burc.zodiacname

        builder.setTitle(Html.fromHtml("<b><font color='#FFFFFF'>$title </font></b>"))

        val dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_burc_info, null)
        val burcInfoTextView: TextView = dialogView.findViewById(R.id.burc_info_textview)
        burcInfoTextView.text = burc.zodiacinfo
        burcInfoTextView.setTextColor(ContextCompat.getColor(context, android.R.color.white))

        // Arka plan rengini ayarla
        dialogView.setBackgroundColor(
            ContextCompat.getColor(
                context,
                R.color.dialog_background_color
            )
        )

        builder.setView(dialogView)

        builder.setPositiveButton("Teşekkürler ") { dialog, _ ->
            dialog.dismiss()
        }

        val alertDialog = builder.create()
        alertDialog.setOnShowListener {
            val positiveButton = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
            positiveButton.setTextColor(Color.WHITE)

            // AlertDialog içindeki metinleri beyaza dönüştür
            val textViewIds = intArrayOf(android.R.id.message)
            for (textViewId in textViewIds) {
                val textView = alertDialog.findViewById<TextView>(textViewId)
                textView?.setTextColor(Color.WHITE)
            }
        }

        alertDialog.window?.apply {
            setBackgroundDrawableResource(R.color.dialog_background_color) // Arka plan rengini ayarla
            setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT
            )
        }

        alertDialog.show()
    }

}
