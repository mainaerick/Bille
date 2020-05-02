package com.newways.billie.Adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.newways.billie.R;
import com.newways.billie.Utils.Notification_detail;

import java.util.ArrayList;
import java.util.Objects;

public class Notification_adapter extends ArrayAdapter<Notification_detail> {

    Context context;
    int mResource;
    ArrayList<Notification_detail> notification_details;
    private static class ViewHolder {
        TextView notificationtitle, notificationdate;
        ImageView popup;
    }
    public Notification_adapter(@NonNull Context context, int resource, @NonNull ArrayList<Notification_detail> objects) {
        super(context, resource, objects);
        this.context=context;
        this.mResource=resource;
        this.notification_details =objects;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Notification_adapter.ViewHolder holder;
        final String title = Objects.requireNonNull(getItem(position)).getTitle();
        final String date = Objects.requireNonNull(getItem(position)).getDate();
        Notification_detail notification_detail=new Notification_detail(title,date);

        if(convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new Notification_adapter.ViewHolder();
            holder.notificationtitle = convertView.findViewById(R.id.notification_title);
            holder.notificationdate =convertView.findViewById(R.id.notificationdate);
            convertView.setTag(holder);
        } else {
            holder = (Notification_adapter.ViewHolder) convertView.getTag();
        }
        holder.notificationtitle.setText(title);
        holder.notificationdate.setText(date);


//        Animation animation = AnimationUtils.loadAnimation(getContext(), (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
//        convertView.startAnimation(animation);
//        lastPosition = position;

        return convertView;
    }
    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public ArrayList<Notification_detail> getNoteList() {
        return notification_details;
    }

}

