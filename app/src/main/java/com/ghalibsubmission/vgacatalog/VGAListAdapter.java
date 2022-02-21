package com.ghalibsubmission.vgacatalog;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class VGAListAdapter extends RecyclerView.Adapter<VGAListAdapter.ListViewHolder> {
    private ArrayList<VGA> listVGA;

    public VGAListAdapter(ArrayList<VGA> list) {
        this.listVGA = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_vga, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        VGA vga = listVGA.get(position);
        Glide.with(holder.itemView.getContext())
                .load(vga.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.VGAPhoto);
        holder.tvVGAName.setText(vga.getName());
        holder.tvVGAIntro.setText(vga.getIntro());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
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

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView VGAPhoto;
        TextView tvVGAName, tvVGAIntro, tvHarga, tvGraphicEnging, tvVideoMemory, tvCudaCore, tvCoreClock, tvMemoryClock, tvOpenGL, tvMaxDisplay, tvRecomPSU, tvPowerConn, tvSliSupport;

        ListViewHolder(View itemView) {
            super(itemView);
            VGAPhoto = itemView.findViewById(R.id.img_vga_photo);
            tvVGAName = itemView.findViewById(R.id.tv_vga_name);
            tvVGAIntro = itemView.findViewById(R.id.tv_vga_intro);
            tvHarga = itemView.findViewById(R.id.tv_harga_dipasaran);
            tvGraphicEnging = itemView.findViewById(R.id.tv_value_graphic_engine);
            tvVideoMemory= itemView.findViewById(R.id.tv_value_video_memory);
            tvCudaCore = itemView.findViewById(R.id.tv_value_cuda_core);
            tvCoreClock = itemView.findViewById(R.id.tv_value_core_clock);
            tvMemoryClock = itemView.findViewById(R.id.tv_value_memory_clock);
            tvOpenGL = itemView.findViewById(R.id.tv_value_openGL);
            tvMaxDisplay = itemView.findViewById(R.id.tv_value_max_display);
            tvRecomPSU = itemView.findViewById(R.id.tv_value_recom_psu);
            tvPowerConn = itemView.findViewById(R.id.tv_value_power_connection);
            tvSliSupport = itemView.findViewById(R.id.tv_value_sli_support);
        }
    }
}

