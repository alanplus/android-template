package com.alan.note.fragment;

import com.alan.note.R;
import com.alan.note.databinding.FragmentUserBinding;
import com.alan.note.viewmodel.UserViewModel;
import com.lib.basex.fragment.LFragment;

/**
 * @author Alan
 * 时 间：2021/2/25
 * 简 述：<功能简述>
 */
public class UserFragment extends LFragment<UserViewModel, FragmentUserBinding> {
    @Override
    public int getContentId() {
        return R.layout.fragment_user;
    }
}
