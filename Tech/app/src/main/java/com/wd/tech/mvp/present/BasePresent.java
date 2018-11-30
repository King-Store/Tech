package com.wd.tech.mvp.present;


import com.wd.tech.iView.IBaseView;

public class BasePresent<V extends IBaseView> {

    private V iv;

    public void attachView(V v) {
        this.iv = v;
    }

    public void dettachView() {
        this.iv = null;
    }

    public V getView(){
        return iv;
    }


}
