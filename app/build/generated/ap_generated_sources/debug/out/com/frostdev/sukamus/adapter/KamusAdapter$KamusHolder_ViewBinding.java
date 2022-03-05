// Generated code from Butter Knife. Do not modify!
package com.frostdev.sukamus.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.frostdev.sukamus.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class KamusAdapter$KamusHolder_ViewBinding implements Unbinder {
  private KamusAdapter.KamusHolder target;

  @UiThread
  public KamusAdapter$KamusHolder_ViewBinding(KamusAdapter.KamusHolder target, View source) {
    this.target = target;

    target.txtKata = Utils.findRequiredViewAsType(source, R.id.txt_kata, "field 'txtKata'", TextView.class);
    target.txtDeskripsi = Utils.findRequiredViewAsType(source, R.id.txt_deskripsi, "field 'txtDeskripsi'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    KamusAdapter.KamusHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtKata = null;
    target.txtDeskripsi = null;
  }
}
