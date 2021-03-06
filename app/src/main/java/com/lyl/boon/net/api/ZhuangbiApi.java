package com.lyl.boon.net.api;


import com.lyl.boon.net.entity.ZhuangbiEntity;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Wing_Li
 * 2016/4/15.
 */
public interface ZhuangbiApi {

    @GET("search")
    Observable<List<ZhuangbiEntity>> search(@Query("q") String id);

    @GET
    Call<ResponseBody> downloadFileWithDynamicUrlSync(@Url String filrUrl);
}
