package com.alan.note;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.alan.note.fragment.IndexFragment;
import com.alan.note.fragment.UserFragment;
import com.lib.basex.activity.LHomeActivity;

/**
 * @author alan
 */
public class MainActivity extends LHomeActivity {


    @Override
    protected Fragment[] getFragmentArray() {
        return new Fragment[]{new IndexFragment(), new UserFragment()};
    }
}