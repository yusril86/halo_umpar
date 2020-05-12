package com.pareandroid.haloumpar.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pareandroid.haloumpar.InfoDosenInformatika;
import com.pareandroid.haloumpar.Model.ModelTeknik;
import com.pareandroid.haloumpar.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterInformatika extends RecyclerView.Adapter<AdapterInformatika.itemviewholder> {
    private List<ModelTeknik> modelTekniks;

    public AdapterInformatika(List<ModelTeknik> modelTeknikList){
        this.modelTekniks =modelTeknikList;
    }

    @NonNull
    @Override
    public itemviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_kontak,parent,false);
        return new itemviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemviewholder holder, int position) {
        final ModelTeknik model = modelTekniks.get(position);

        holder.tv_nama.setText(model.getNama());
        holder.tv_nbm.setText(model.getNbm());
        holder.tv_nohp.setText(model.getNomorhp());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(view.getContext(), InfoDosenInformatika.class);
                intent.putExtra("nama",model.getNama());
                intent.putExtra("nbm",model.getNbm());
                intent.putExtra("nohp",model.getNomorhp());
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelTekniks.size();
    }

    public class itemviewholder extends RecyclerView.ViewHolder {
            TextView tv_nama, tv_nohp, tv_nbm;
        public itemviewholder(@NonNull View itemView) {
            super(itemView);

            tv_nama = itemView.findViewById(R.id.tv_nama_dosen);
            tv_nbm = itemView.findViewById(R.id.tv_nbm);
            tv_nohp = itemView.findViewById(R.id.tv_nohp);

        }
    }
}
