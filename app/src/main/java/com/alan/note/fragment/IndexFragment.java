package com.alan.note.fragment;

import com.alan.note.R;
import com.alan.note.databinding.FragmentIndexBinding;
import com.alan.note.viewmodel.IndexViewModel;
import com.lib.basex.fragment.LFragment;

/**
 * @author Alan
 * 时 间：2021/2/25
 * 简 述：<功能简述>
 */
public class IndexFragment extends LFragment<IndexViewModel, FragmentIndexBinding> {
    @Override
    public int getContentId() {
        return R.layout.fragment_index;
    }
}
