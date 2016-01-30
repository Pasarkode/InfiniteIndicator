package cn.lightsky.infiniteindicator.slideview;

import java.io.File;

/**
 * Created by xushuai on 2014/12/25.
 */
public class PageView {
    public String data;
    public String url;
    public Integer drawableRes;
    public File file;
    public SliderView.OnSliderClickListener onSliderClickListener;

    public PageView(String data, Integer drawableRes) {
        this.data = data;
        this.drawableRes = drawableRes;
    }

    public PageView(String data, String url) {
        this.data = data;
        this.url = url;
    }
}
