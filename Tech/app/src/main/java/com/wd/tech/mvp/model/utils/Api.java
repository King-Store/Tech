package com.wd.tech.mvp.model.utils;

import com.wd.tech.bean.BaseBean;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    @GET("")
    Observable<BaseBean> getBase();
}
