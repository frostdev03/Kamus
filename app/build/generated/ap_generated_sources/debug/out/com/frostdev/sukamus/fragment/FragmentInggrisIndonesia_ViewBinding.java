// Generated code from Butter Knife. Do not modify!
package com.frostdev.sukamus.fragment;

import android.view.View;
import android.widget.SearchView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.frostdev.sukamus.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FragmentInggrisIndonesia_ViewBinding implements Unbinder {
  private FragmentInggrisIndonesia target;

  @UiThread
  public FragmentInggrisIndonesia_ViewBinding(FragmentInggrisIndonesia target, View source) {
    this.target = target;

    target.searchKata = Utils.findRequiredViewAsType(source, R.id.search_kata, "field 'searchKata'", SearchView.class);
    target.rvKata = Utils.findRequiredViewAsType(source, R.id.rv_kata, "field 'rvKata'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    FragmentInggrisIndonesia target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.searchKata = null;
    target.rvKata = null;
  }
}
