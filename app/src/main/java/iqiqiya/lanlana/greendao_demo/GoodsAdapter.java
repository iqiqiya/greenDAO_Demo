package iqiqiya.lanlana.greendao_demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import iqiqiya.lanlana.greendao_demo.model.GoodsModel;

/**
 * Author: iqiqiya
 * Date: 2019/10/22
 * Time: 16:40
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.VH> {

    private List<GoodsModel> dataSource;

    public void setDataSource(List<GoodsModel> dataSource) {
        this.dataSource = dataSource;
        notifyDataSetChanged();
    }

    private Context mContext;

    public GoodsAdapter(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        VH vh = new VH(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.goods_item,viewGroup, false));
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, int i) {
        final GoodsModel model = dataSource.get(i);

        vh.mIvIcon.setImageResource(mContext.getResources().getIdentifier(model.getIcon(), "mipmap", mContext.getPackageName()));
        vh.mTvName.setText(model.getName());
        vh.mTvInfo.setText(model.getInfo());

        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, GoodsDetailActivity.class);
                intent.putExtra("goodsModel", model);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (dataSource == null) return 0;
        return dataSource.size();
    }

    public static class VH extends RecyclerView.ViewHolder {

        public ImageView mIvIcon;
        public TextView mTvName,mTvInfo;

        public VH(@NonNull View itemView) {
            super(itemView);

            mIvIcon = itemView.findViewById(R.id.iv_icon);
            mTvName = itemView.findViewById(R.id.tv_name);
            mTvInfo = itemView.findViewById(R.id.tv_info);

        }
    }

}