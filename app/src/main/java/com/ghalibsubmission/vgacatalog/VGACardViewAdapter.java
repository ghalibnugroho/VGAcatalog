package com.ghalibsubmission.vgacatalog;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class VGACardViewAdapter extends RecyclerView.Adapter<VGACardViewAdapter.CardViewViewHolder> {
    private ArrayList<VGA> listVGA;

    public VGACardViewAdapter(ArrayList<VGA> list) {
        this.listVGA = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_vga, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {

        VGA vga = listVGA.get(position);
        Glide.with(holder.itemView.getContext())
                .load(vga.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(vga.getName());
        holder.tvIntro.setText(vga.getIntro());
        holder.tvHarga.setText(vga.getHarga());
        holder.btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Anda membeli VGA " +
                        listVGA.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Wishlist " +
                        listVGA.get(holder.getAdapterPosition()).getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailVGA = new Intent(view.getContext(), VGADetail.class);
                detailVGA.putExtra("foto", listVGA.get(position).getPhoto());
                detailVGA.putExtra("nama", listVGA.get(position).getName());
                detailVGA.putExtra("intro", listVGA.get(position).getIntro());
                detailVGA.putExtra("harga", listVGA.get(position).getHarga());
                detailVGA.putExtra("graphicEngine", listVGA.get(position).getGraphic_enging());
                detailVGA.putExtra("videoMemory", listVGA.get(position).getVideo_memory());
                detailVGA.putExtra("cudaCore", listVGA.get(position).getCuda_core());
                detailVGA.putExtra("coreClock", listVGA.get(position).getCore_clock());
                detailVGA.putExtra("memoryClock", listVGA.get(position).getMemory_clock());
                detailVGA.putExtra("openGL", listVGA.get(position).getOpenGL());
                detailVGA.putExtra("maxDisplay", listVGA.get(position).getMax_display());
                detailVGA.putExtra("recomPSU", listVGA.get(position).getRecom_psu());
                detailVGA.putExtra("powerConn", listVGA.get(position).getPower_connection());
                detailVGA.putExtra("sliSupport", listVGA.get(position).getSli_support());
                view.getContext().startActivity(detailVGA);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listVGA.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvIntro, tvHarga;
        Button btnBeli, btnWishlist;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_vga_name);
            tvIntro = itemView.findViewById(R.id.tv_vga_intro);
            tvHarga = itemView.findViewById(R.id.tv_vga_harga);
            btnBeli = itemView.findViewById(R.id.btn_set_beli);
            btnWishlist = itemView.findViewById(R.id.btn_set_wishlist);
        }
    }
}
