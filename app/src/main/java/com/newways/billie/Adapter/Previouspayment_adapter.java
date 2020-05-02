package com.newways.billie.Adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

import com.newways.billie.R;
import com.newways.billie.Utils.Previouspayment_detail;

import java.util.ArrayList;
import java.util.Objects;

public class Previouspayment_adapter  extends ArrayAdapter<Previouspayment_detail> {

    Context context;
    int mResource;
    ArrayList<Previouspayment_detail> previouspayment_details;
    private static class ViewHolder {
        TextView tvplatenumber,tvsacconame;
        ImageView popup;
    }
    public Previouspayment_adapter(@NonNull Context context, int resource, @NonNull ArrayList<Previouspayment_detail> objects) {
        super(context, resource, objects);
        this.context=context;
        this.mResource=resource;
        this.previouspayment_details=objects;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Previouspayment_adapter.ViewHolder holder;
        final String platenumber = Objects.requireNonNull(getItem(position)).getPlatenumber();
        final String sacconame = Objects.requireNonNull(getItem(position)).getSacconame();
        Previouspayment_detail previouspayment_detail=new Previouspayment_detail(platenumber,sacconame);

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new Previouspayment_adapter.ViewHolder();
            holder.tvplatenumber = convertView.findViewById(R.id.platenumber);
            holder.tvsacconame=convertView.findViewById(R.id.sacconame);
            convertView.setTag(holder);
        } else {
            holder = (Previouspayment_adapter.ViewHolder) convertView.getTag();
        }
        holder.tvplatenumber.setText(platenumber);
        holder.tvsacconame.setText(sacconame);


//        Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
//        convertView.startAnimation(animation);
//        lastPosition = position;

        return convertView;
    }
    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public ArrayList<Previouspayment_detail> getNoteList() {
        return previouspayment_details;
    }

}
