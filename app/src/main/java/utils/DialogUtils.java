package utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;

/**
 * Created by BILL on 2016/12/16.
 * email:tangbaozi@daotangbill.uu.me
 *
 * @author atom
 * @version 1.0
 */

public class DialogUtils {

    /**
     * 显示ProgressDialog,附带文字
     */
    public static ProgressDialog showProgressDialog(@Nullable String message, Activity context) {
        ProgressDialog proDialg = new ProgressDialog(context);
        if (message == null) {
            message = "玩命加载中……";
        }
        proDialg.setMessage(message);
        proDialg.show();
        return proDialg;
    }

    public static AlertDialog showConfirmCancelDialog(String title, String message
            , DialogInterface.OnClickListener posListener
            , DialogInterface.OnClickListener cancelListener, Activity context) {
        AlertDialog dlg = new AlertDialog.Builder(context).setMessage(message).setTitle(title)
                .setPositiveButton("确认", posListener)
                .setNegativeButton("取消", cancelListener).create();
        dlg.setCanceledOnTouchOutside(false);
        dlg.show();
        return dlg;
    }

    /**
     * 显示 回复dialog
     *
     * @param msg   通知的内容
     * @param title 标题
     */
    public static void showResultDialog(String msg, String title, Activity context) {
        if (msg == null) return;
        String rag = msg.replace(",", "\n");
        new AlertDialog.Builder(context).setTitle(title).setMessage(rag)
                .setNegativeButton("知道了", null).create().show();
    }
}
