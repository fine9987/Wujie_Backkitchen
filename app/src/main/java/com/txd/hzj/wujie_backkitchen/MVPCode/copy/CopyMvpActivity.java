package com.txd.hzj.wujie_backkitchen.MVPCode.copy;

import android.view.View;

import com.txd.hzj.wujie_backkitchen.MVPCode.MvpActivity;

import java.util.List;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/AndroidProject
 *    time   : 2018/11/17
 *    desc   : 可进行拷贝的MVP Activity 类
 */
public class CopyMvpActivity extends MvpActivity<CopyPresenter> implements CopyContract.View {

    @Override
    protected CopyPresenter createPresenter() {
        return new CopyPresenter();
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected int getTitleBarId() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    public void onLogin(View view) {
        // 登录操作
        getPresenter().login("账户", "密码");
    }

    /**
     * {@link CopyContract.View}
     */

    @Override
    public void loginError(String msg) {
    }

    @Override
    public void loginSuccess(List<String> data) {
    }

    @Override
    public void ShowLoading() {

    }

    @Override
    public void loadingComplete() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showError() {

    }
}