package com.kaku.weac.activities;

import android.support.v4.app.Fragment;
import android.view.MotionEvent;

import com.kaku.weac.R;
import com.kaku.weac.fragment.LifeIndexDetailFragment;

/**
 * 生活指数详情activity
 *
 * @author 咖枯
 * @version 1.0 2015/10/10
 */
public class LifeIndexDetailActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new LifeIndexDetailFragment();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (MotionEvent.ACTION_OUTSIDE == event.getAction() ||
                MotionEvent.ACTION_DOWN == event.getAction()) {
            onFinish();
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        onFinish();

    }

    /**
     * 完成退出
     */
    private void onFinish() {
        finish();
        overridePendingTransition(0, R.anim.zoomout);
    }
}