package iqiqiya.lanlana.greendao_demo.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Author: iqiqiya
 * Date: 2019/10/22
 * Time: 15:48
 * Blog: blog.77sec.cn
 * Github: github.com/iqiqiya
 */

@Entity
public class GoodsModel {
    @Id(autoincrement = true)
    private Long id;
    private Integer goodsId;
    private String name;
    private String icon;
    private String type;
    @Generated(hash = 2065057396)
    public GoodsModel(Long id, Integer goodsId, String name, String icon,
            String type) {
        this.id = id;
        this.goodsId = goodsId;
        this.name = name;
        this.icon = icon;
        this.type = type;
    }
    @Generated(hash = 971639536)
    public GoodsModel() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getGoodsId() {
        return this.goodsId;
    }
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIcon() {
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
