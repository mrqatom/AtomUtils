package utils;

import android.app.Activity;
import android.view.Gravity;
import android.widget.Toast;

/**
 * Created by BILL on 2016/12/16.
 * email:tangbaozi@daotangbill.uu.me
 *
 * @author atom
 * @version 1.0
 */
public class ToastUtils {
    private static Toast mToast;

    /**
     * 用于吐司
     *
     * @param str string or char[]
     */
    public static void TToast(String str, Activity context) {
        if (mToast != null) {
            mToast.cancel();
            mToast = null;
        }
        mToast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
        mToast.show();
    }

    public static void Ctoast(String str, Activity context) {
        if (mToast != null) {
            mToast.cancel();
            mToast = null;
        }
        mToast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }

}
