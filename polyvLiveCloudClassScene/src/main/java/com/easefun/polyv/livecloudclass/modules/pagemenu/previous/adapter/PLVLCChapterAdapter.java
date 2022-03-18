package com.easefun.polyv.livecloudclass.modules.pagemenu.previous.adapter;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.easefun.polyv.livecloudclass.R;
import com.easefun.polyv.livecommon.ui.widget.itemview.PLVBaseViewData;
import com.easefun.polyv.livecommon.module.modules.previous.customview.PLVChapterAdapter;

/**
 * 回放章节列表适配器
 */
public class PLVLCChapterAdapter extends PLVChapterAdapter<PLVBaseViewData, PLVLCChapterViewHolder> {
    @NonNull
    @Override
    public PLVLCChapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new PLVLCChapterViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.plvlc_chapter_list_item, viewGroup, false), this);
    }
}
