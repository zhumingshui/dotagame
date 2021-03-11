package com.zms.dotagame.pojo;

import lombok.Data;

/*
* 用户移动物品
* */
@Data
public class UserMoveGoods {
    private String steam_id;
    private String from_slot;
    private String to_slot;
    private String key1;
}
