package com.txd.hzj.wujie_backkitchen.Bean;

/**
 * 创建者：Sunzeyu
 * <br>创建时间：下午 05:16 2019/4/17 017
 * <br>功能描述：
 */
public class MyItemBean {
    private String name;
    private String time;
    private String icon;

    @Override
    public String toString() {
        return "MyItemBean{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
