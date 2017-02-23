package ck.itheima.com.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * 类名:    ItemView
 * 创建者:  ckqu
 * 创建时间:2017/2/23 0023 下午 2:39
 * 包名:    ck.itheima.com.recyclerview
 * 更新者:  $Author$ $Date$
 * 描述:    TODO
 */

public class ItemView extends RelativeLayout {

    private TextView mTv;

    public ItemView(Context context) {
        this(context, null);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.item_view,this);
        mTv = (TextView) this.findViewById(R.id.tv);

    }

    public void bindView(String s) {
        mTv.setText(s);
    }
}
