package com.example.hs.mycamera2.option;

import android.hardware.camera2.CaptureRequest;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.hs.mycamera2.R;
import com.example.hs.mycamera2.option2.CameraOption2;

import java.util.Arrays;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by user on 2018. 4. 17..
 */

class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder> {

    List<CameraAllOption.Subject> items = Arrays.asList(CameraAllOption.Subject.values());




    private List<CaptureRequest.Key<?>> availableKeys;




    private OptionViewHolder.ItemClickListener itemClickListener;

    public OptionAdapter(OptionViewHolder.ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public OptionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_option, parent, false);
        return new OptionViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(OptionViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void refresh(String cameraId) {
        availableKeys = CameraOption2.getInstance().getAvailableKeys(cameraId);



        notifyDataSetChanged();
    }

    static class OptionViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.txt_title)
        TextView title;
        @BindView(R.id.txt_desc)
        TextView desc;

        @BindView(R.id.option_value_check_box)
        CheckBox optionCheckBox;
        @BindView(R.id.option_value_text_view)
        TextView optionTextView;

        private CameraAllOption.Subject model;

        OptionViewHolder(View itemView, ItemClickListener itemClickListener) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            optionCheckBox.setOnClickListener(v -> {
                if (model != null) {
                    itemClickListener.onClickOption(v, model);
                }
            });

            optionTextView.setOnClickListener(v -> {
                if (model != null) {
                    itemClickListener.onClickOption(v, model);
                }
            });
        }

        void bind(CameraAllOption.Subject model) {
            this.model = model;
            title.setText(model.name());
            desc.setText(model.getDescription());

            if (model.getType() == CameraAllOption.Type.CHECK) {
                optionCheckBox.setVisibility(View.VISIBLE);
                optionTextView.setVisibility(View.GONE);
            } else {
                optionCheckBox.setVisibility(View.GONE);
                optionTextView.setVisibility(View.VISIBLE);
            }
        }

        interface ItemClickListener {
            void onClickOption(View view, CameraAllOption.Subject subject);
        }
    }
}
