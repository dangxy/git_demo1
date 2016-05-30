package com.example.dangxueyi.git_demo1.utils;

import android.content.Context;
import android.os.Handler;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by dangxueyi on 16/5/30.
 */
public class ToastUtils {
    private static Toast mToast;
    private static Handler mHandler = new Handler();
    private static Runnable r = new Runnable() {
        public void run() {
            mToast.cancel();
            mToast = null;
        }
    };

    public static void showToast(Context mContext, String text, int duration) {
        mHandler.removeCallbacks(r);
        if (mToast == null) {
            mToast = Toast.makeText(mContext, text, duration);
        }
        LinearLayout toastView = (LinearLayout) mToast.getView();
        TextView msg = (TextView) toastView.getChildAt(0);
        msg.setCompoundDrawablePadding(10);
        msg.setText(text);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mHandler.postDelayed(r, duration);
        mToast.show();
    }

}
