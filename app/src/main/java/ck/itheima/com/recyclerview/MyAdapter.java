package ck.itheima.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * 类名:    MyAdapter
 * 创建者:  ckqu
 * 创建时间:2017/2/23 0023 下午 2:36
 * 包名:    ck.itheima.com.recyclerview
 * 更新者:  $Author$ $Date$
 * 描述:    TODO
 */

public class MyAdapter extends RecyclerView.Adapter {

    private Context mContext;
    private List<String> mDataList;

    public MyAdapter(Context context, List<String> dataList) {
        mContext = context;
        mDataList = dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(new ItemView(mContext));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ItemView)holder.itemView).bindView(mDataList.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{
        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}
