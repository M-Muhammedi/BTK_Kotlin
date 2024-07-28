package mustafa.muhammedi.ders2

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mustafa.muhammedi.ders2.databinding.RecyclerRowBinding

class ParamedikAdapter(val ParamedikListesi : ArrayList<Paramedik>): RecyclerView.Adapter<ParamedikAdapter.ParamedikViewHolder>() {

    class ParamedikViewHolder(val binging : RecyclerRowBinding) : RecyclerView.ViewHolder(binging.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParamedikViewHolder {
        val binging = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ParamedikViewHolder(binging)
    }

    override fun getItemCount(): Int {
        return ParamedikListesi.size
    }

    override fun onBindViewHolder(holder: ParamedikViewHolder, position: Int) {
        holder.binging.textViewRecyclerView.text = ParamedikListesi[position].baslik

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,Tanitim::class.java)
            intent.putExtra("sicilenveri",ParamedikListesi[position])
            holder.itemView.context.startActivity(intent)
        }

    }
}