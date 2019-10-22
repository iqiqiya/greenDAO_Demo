package iqiqiya.lanlana.greendao_demo;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import iqiqiya.lanlana.greendao_demo.model.GoodsModel;

/**
 * Author: iqiqiya
 * Date: 2019/10/22
 * Time: 16:21
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */
public class GoodsDetailActivity extends AppCompatActivity {

    private EditText mEtInfo;
    private GoodsModel mGoodsModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_detail);

        mGoodsModel = getIntent().getParcelableExtra("goodsModel");

        EditText mEtInfo = findViewById(R.id.et_info);
        mEtInfo.setText(mGoodsModel.getInfo());
    }

    /**
     * 保存编辑点击事件
     * @param v
     */
    public void onEditClick(View v) {
        String info = mEtInfo.getText().toString();
        mGoodsModel.setInfo(info);

        onBackPressed();
    }

    /**
     * 删除商品
     * @param v
     */
    public void onDelClick(View v) {
        String info = mEtInfo.getText().toString();
        mGoodsModel.setInfo(info);

        onBackPressed();
    }
}
