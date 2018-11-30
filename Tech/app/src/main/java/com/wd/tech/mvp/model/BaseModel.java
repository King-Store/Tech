package com.wd.tech.mvp.model;

import com.wd.tech.bean.BaseBean;
import com.wd.tech.mvp.model.utils.HttpUtils;

import io.reactivex.Observable;


/**
 * 作者：轻 on 2018/11/29 14:
 * <p>
 * 邮箱：379996854@qq.com
 */
public class BaseModel {

    public  Observable<BaseBean> getBase(){

         return HttpUtils.getInstance().api.getBase();
    }
}
