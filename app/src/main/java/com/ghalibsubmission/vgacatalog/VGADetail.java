package com.ghalibsubmission.vgacatalog;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VGADetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_vga);
        ImageView vgaPhoto = findViewById(R.id.foto_vga);
        TextView tvNama = findViewById(R.id.tv_nama);
        TextView tvIntro = findViewById(R.id.tv_vga_intro);
        TextView tvHargaPasar = findViewById(R.id.tv_harga_dipasaran);
        TextView tvGraphicEngine = findViewById(R.id.tv_value_graphic_engine);
        TextView tvVideoMemory = findViewById(R.id.tv_value_video_memory);
        TextView tvCudaCore = findViewById(R.id.tv_value_cuda_core);
        TextView tvCoreClock = findViewById(R.id.tv_value_core_clock);
        TextView tvMemoryClock = findViewById(R.id.tv_value_memory_clock);
        TextView tvOpenGL = findViewById(R.id.tv_value_openGL);
        TextView tvMaxDisplay = findViewById(R.id.tv_value_max_display);
        TextView tvRecomPsu = findViewById(R.id.tv_value_recom_psu);
        TextView tvPowerConnection = findViewById(R.id.tv_value_power_connection);
        TextView tvSliSupport = findViewById(R.id.tv_value_sli_support);

        int foto = getIntent().getExtras().getInt("foto");
        String name = getIntent().getExtras().getString("nama");
        String intro = getIntent().getExtras().getString("intro");
        String harga = getIntent().getExtras().getString("harga");
        String graphicEngine = getIntent().getExtras().getString("graphicEngine");
        String videoMemory = getIntent().getExtras().getString("videoMemory");
        String cudaCore = getIntent().getExtras().getString("cudaCore");
        String coreClock = getIntent().getExtras().getString("coreClock");
        String memoryClock = getIntent().getExtras().getString("memoryClock");
        String openGL = getIntent().getExtras().getString("openGL");
        String maxDisplay = getIntent().getExtras().getString("maxDisplay");
        String recomPSU = getIntent().getExtras().getString("recomPSU");
        String powerConn = getIntent().getExtras().getString("powerConn");
        String sliSupport = getIntent().getExtras().getString("sliSupport");

        vgaPhoto.setImageResource(foto);
        tvNama.setText(name);
        tvIntro.setText(intro);
        tvHargaPasar.setText(harga);
        tvGraphicEngine.setText(graphicEngine);
        tvVideoMemory.setText(videoMemory);
        tvCudaCore.setText(cudaCore);
        tvCoreClock.setText(coreClock);
        tvMemoryClock.setText(memoryClock);
        tvOpenGL.setText(openGL);
        tvMaxDisplay.setText(maxDisplay);
        tvRecomPsu.setText(recomPSU);
        tvPowerConnection.setText(powerConn);
        tvSliSupport.setText(sliSupport);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void onProfileAction(MenuItem mi) {
        Intent about = new Intent(VGADetail.this, About.class);
        startActivity(about);
    }
}
